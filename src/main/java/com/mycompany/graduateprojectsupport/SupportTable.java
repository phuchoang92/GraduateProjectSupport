
package com.mycompany.graduateprojectsupport;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class SupportTable extends JTable{
    
    private DefaultTableModel tableModel;
    private DefaultTableCellRenderer centerRenderer;
    private int maxSize = 13;
    
    public SupportTable(){
        setRowHeight(40);
        setShowVerticalLines(true);
        centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tableModel = new DefaultTableModel();
    }
    
    public void setData(ArrayList<Mentor> list){
        
        tableModel.setColumnIdentifiers(new Object[] { 
            "Tên GV", 
            "Số năm công tác", 
            "Học hàm" , 
            "Điểm TB đồ án đã nhận", 
            "Số đồ án đã nhận",
            "Danh sách đề tài"
        });
        
        tableModel.setRowCount(0);
        for(int i = 0; i< list.size(); i++){
            String ten = list.get(i).getHoTen();
            int congtac = list.get(i).getSoNamCongTac();
            String hoham = list.get(i).getHocHam();
            float diemTb = list.get(i).getDiemDoAn();
            int soDoAn = list.get(i).getSoDoAN();
            String dsDeTai = String.join(", ", list.get(i).getDsDetai());
            
            tableModel.addRow(new Object[]{ten , congtac, hoham ,diemTb ,soDoAn ,dsDeTai});
        }
        
        if(list.size() < maxSize){
            int cotThem = maxSize - list.size();
            for(int i = 0;i < cotThem; i++){
                tableModel.addRow(new Object[]{"" , "", "" ,"" ,"", ""});
            }
        }
        
        this.setModel(tableModel);
        getTableHeader().setDefaultRenderer(centerRenderer);
        for(int index = 0; index < this.getColumnCount(); index++){
            this.getColumnModel().getColumn(index).setCellRenderer(centerRenderer);
        }
    }
    
     public void setDataPonit(ArrayList<MentorPoint> list){

        tableModel.setColumnIdentifiers(new Object[] { 
            "Tên Giảng viên", 
            "Phù hợp về năm công tác", 
            "Phù hợp về học hàm" , 
            "Phù hợp về kết quả đồ án", 
            "Phù hợp về chuyên môn"
        });
         
        tableModel.setRowCount(0);
        for(int i = 0; i< list.size(); i++){
            String ten = list.get(i).getHoTen();
            int congtac = list.get(i).getSoNamCongTac();
            int hoham = list.get(i).getHocHam();
            float diemTb = list.get(i).getDiemDoAn();
            int deTai = list.get(i).getDetai();
            
            tableModel.addRow(new Object[]{ten , congtac, hoham ,diemTb , deTai});
        }
        
        if(list.size() < maxSize){
            int cotThem = maxSize - list.size();
            for(int i = 0;i < cotThem; i++){
                tableModel.addRow(new Object[]{"" , "", "" , "" , ""});
            }
        }
        
        this.setModel(tableModel);
        for(int index = 0; index < this.getColumnCount(); index++){
            this.getColumnModel().getColumn(index).setCellRenderer(centerRenderer);
        }
    }
}
