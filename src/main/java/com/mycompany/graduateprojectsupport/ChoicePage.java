package com.mycompany.graduateprojectsupport;

import java.util.ArrayList;

public class ChoicePage extends javax.swing.JFrame {
    
    GetListMentor data = new GetListMentor();
    ArrayList<Mentor> list;
    ArrayList<MentorPoint> listPoint;
    public String detai, hocHam, diemTB, namCongTac, soDoAn;
   
    public ChoicePage() {
        initComponents();
        setLocationRelativeTo(null);
        ArrayList<String> listDt = data.getAllDetai();
        listDt.add(0, "-- Chọn đề tài --");
        String [] dsDeTaiv =  listDt.toArray(String[]::new);
        DetaiCombox.setModel(new javax.swing.DefaultComboBoxModel<>(dsDeTaiv));
        list = data.getAllGiangVien();
        table1.setData(list);
    }
    
    public void getData(){
        detai = DetaiCombox.getSelectedItem().toString();
        hocHam = cbxHV.getSelectedItem().toString();
        diemTB = DiemDoAnTextField.getText();
        namCongTac = NamCongTacTextField.getText();
    }
    
    public boolean CheckData(){
        try{
            Double.parseDouble(diemTB);           
            return true;
        }catch ( NumberFormatException ex){
            return false;
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        InputPanel = new javax.swing.JPanel();
        CongTacLabel = new javax.swing.JLabel();
        NamCongTacTextField = new javax.swing.JTextField();
        DeTaiLabel = new javax.swing.JLabel();
        HocHamLabel = new javax.swing.JLabel();
        ShowButton = new javax.swing.JButton();
        DiemLabel = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        cbxHV = new javax.swing.JComboBox<>();
        DiemLabel1 = new javax.swing.JLabel();
        DiemDoAnTextField = new javax.swing.JTextField();
        DetaiCombox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new com.mycompany.graduateprojectsupport.SupportTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InputPanel.setBackground(new java.awt.Color(255, 204, 153));

        CongTacLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CongTacLabel.setText("Số năm công tác tối thiểu");

        NamCongTacTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamCongTacTextFieldActionPerformed(evt);
            }
        });

        DeTaiLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeTaiLabel.setText("Hướng đề tài");

        HocHamLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HocHamLabel.setText("Học hàm – học vị");

        ShowButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ShowButton.setText("Hiển thị");
        ShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowButtonActionPerformed(evt);
            }
        });

        DiemLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DiemLabel.setText(" ");

        Clear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Clear.setText("Xóa trắng");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        cbxHV.setEditable(true);
        cbxHV.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        cbxHV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Chọn học vị --", "Thạc sĩ", "Tiến sĩ", "Giáo sư" }));
        cbxHV.setToolTipText("");
        cbxHV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxHV.setRequestFocusEnabled(true);

        DiemLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DiemLabel1.setText("Điểm TB cần ");

        DiemDoAnTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiemDoAnTextFieldActionPerformed(evt);
            }
        });

        DetaiCombox.setEditable(true);
        DetaiCombox.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        DetaiCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DetaiCombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetaiComboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InputPanelLayout = new javax.swing.GroupLayout(InputPanel);
        InputPanel.setLayout(InputPanelLayout);
        InputPanelLayout.setHorizontalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addComponent(DiemDoAnTextField)
                        .addContainerGap())
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addComponent(cbxHV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(DeTaiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HocHamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(InputPanelLayout.createSequentialGroup()
                                .addComponent(DiemLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DiemLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(CongTacLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputPanelLayout.createSequentialGroup()
                        .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NamCongTacTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DetaiCombox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ShowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        InputPanelLayout.setVerticalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeTaiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DetaiCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CongTacLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamCongTacTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HocHamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbxHV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiemLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DiemDoAnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jPanel1.add(InputPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 560));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -3, 750, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 4, 1010, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NamCongTacTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamCongTacTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamCongTacTextFieldActionPerformed

    private void ShowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowButtonActionPerformed
        getData();
        if(detai.equals("-- Chọn đề tài --") && namCongTac.equals("") && hocHam.equals("-- Chọn học vị --") && diemTB.equals("") && soDoAn.equals("")){
            table1.setData(list);
        }else{
            
            int NCT;
            if(namCongTac.equals(""))
                NCT = -1;
            else {
                NCT = Integer.parseInt(namCongTac);
            }
            
            float dtb;
            
            if(diemTB.equals(""))
                dtb = -1;
            else {
                dtb = Float.parseFloat(diemTB);
            }
            
            String detaiSinhVien = this.detai;
            
            GetListMentorPoint lt = new GetListMentorPoint();
            listPoint = lt.getAllGiangVien(list, hocHam, NCT, dtb, detaiSinhVien);
            table1.setDataPonit(listPoint);
            
            Topsis topsis = new Topsis(listPoint); 
            topsis.calculate();
        }
        
    }//GEN-LAST:event_ShowButtonActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        NamCongTacTextField.setText("");
        DiemDoAnTextField.setText("");
        cbxHV.setSelectedIndex(0);
    }//GEN-LAST:event_ClearActionPerformed

    private void DiemDoAnTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiemDoAnTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiemDoAnTextFieldActionPerformed

    private void DetaiComboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetaiComboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetaiComboxActionPerformed
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChoicePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new ChoicePage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JLabel CongTacLabel;
    private javax.swing.JLabel DeTaiLabel;
    private javax.swing.JComboBox<String> DetaiCombox;
    private javax.swing.JTextField DiemDoAnTextField;
    private javax.swing.JLabel DiemLabel;
    private javax.swing.JLabel DiemLabel1;
    private javax.swing.JLabel HocHamLabel;
    private javax.swing.JPanel InputPanel;
    private javax.swing.JTextField NamCongTacTextField;
    private javax.swing.JButton ShowButton;
    private javax.swing.JComboBox<String> cbxHV;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.mycompany.graduateprojectsupport.SupportTable table1;
    // End of variables declaration//GEN-END:variables
}
