
package com.mycompany.graduateprojectsupport;

import static com.mycompany.graduateprojectsupport.DatabaseConnection.getConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GetListMentor {
    
    private List<Mentor> list;
    private Connection connect;
    private Statement stmt;
    private ResultSet rs;
    private String sqlQuery;
    
    public ArrayList<Mentor> getAllGiangVien(){
        try{
            list = new ArrayList<>();
            sqlQuery = "SELECT  GV.MSGV, GV.TenGV, GV.NamCongTac, GV.HocHam,\n" +
                    "ROUND(AVG(DA.Diem), 2) AS DiemTrungBinh,  COUNT(DA.MSDT) AS SoDoAnNhan\n" +
                    "FROM giangvien as GV\n" +
                    "INNER JOIN DoAn DA ON GV.MSGV = DA.MSGV\n" +
                    "GROUP BY GV.MSGV, GV.TenGV;";
            stmt = connect.createStatement();
            rs = stmt.executeQuery(sqlQuery);
            
            while(rs.next()){
                int msgv = rs.getInt("MSGV");
                String newQuery = "select detai.TenDeTai\n" +
                                  " from detai, gv_dt\n" +
                                  "where detai.MSDT = gv_dt.MSDT and gv_dt.MSGV =" + " '"+ msgv +"' ";
                Statement newStm = connect.createStatement();
                ResultSet  newRs = newStm.executeQuery(newQuery);
                List<String> deTai = new ArrayList();
                while(newRs.next()){
                    deTai.add(newRs.getString("TenDeTai"));
                }
                list.add(new Mentor( rs.getInt("MSGV"), 
                        rs.getString("TenGV"),
                        rs.getInt("NamCongTac"),
                        rs.getString("HocHam"),
                        rs.getFloat("DiemTrungBinh"),
                        rs.getInt("SoDoAnNhan"),
                        deTai
                ));
            }
            
            
            
        }catch(SQLException s){
            s.printStackTrace();
        }
        return (ArrayList<Mentor>) list;
    }

    public GetListMentor() {
        connect = getConnection();
    }
    
    public ArrayList<String> getAllDetai(){
        
        List<String> dsDeTai = new ArrayList<>();
        try{
            
            sqlQuery = "select * from detai";
            stmt = connect.createStatement();
            rs = stmt.executeQuery(sqlQuery);
            
            while(rs.next()){
                    dsDeTai.add(rs.getString("TenDeTai"));
            }
            
        }catch(SQLException s){
            s.printStackTrace();
        }
        
        return (ArrayList<String>) dsDeTai;
    }
}
