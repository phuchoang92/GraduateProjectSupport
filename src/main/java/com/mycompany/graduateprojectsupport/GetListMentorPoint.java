
package com.mycompany.graduateprojectsupport;

import java.util.ArrayList;
import java.util.List;

public class GetListMentorPoint {
    private List<MentorPoint> listResult;
    private int chenhLechNCT;
    private float chenhLechDTB;
    private int chenhLechHH;
    private int chenhLechDoAn;
    private int cungDetai;

    GetListMentorPoint() {
        
    }

    public ArrayList<MentorPoint> getAllGiangVien(ArrayList<Mentor> list, String HH, int NCT, float diemtb, String detai){

        listResult = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){

            String ten = list.get(i).getHoTen();

            int congtac = list.get(i).getSoNamCongTac();
            if(NCT == -1){
                chenhLechNCT = congtac;
            }else{
                chenhLechNCT = congtac - NCT;
            }

            String hoham = list.get(i).getHocHam();

            if(HH.equals("-- Chọn học vị --")){
                chenhLechHH = 0;
            }else{
                if(hoham.charAt(0) == 'T'){
                    if(HH.charAt(0) == 'T'){
                        if(hoham.charAt(1) == HH.charAt(1)){
                            chenhLechHH = 0;
                        }else if(hoham.charAt(1) == 'i' && HH.charAt(1)== 'h'){
                            chenhLechHH = 1;
                        }else
                            chenhLechHH = -1;                        
                    }else{
                        if(hoham.charAt(1) == 'i')
                            chenhLechHH = 1;
                        else
                            chenhLechHH = -2;
                    }
                }else {
                    if(HH.charAt(0) == 'G')
                        chenhLechHH = 0;
                    else {
                        if(HH.charAt(1) == 'i')
                            chenhLechHH = 1;
                        else
                            chenhLechHH = 2;
                    }             
                }
            } 

           float diemTb = list.get(i).getDiemDoAn();
           int soDoAn = list.get(i).getSoDoAN();

           if(diemtb == -1){
               chenhLechDTB = diemTb;
           }else
               chenhLechDTB = (float) ((diemTb - diemtb)*1/(1+java.lang.Math.exp((soDoAn - 10))));

           ArrayList<String> dsDetai = (ArrayList<String>) list.get(i).getDsDetai();
           cungDetai = 0;
           for (String deTai : dsDetai){
               if(detai.equals(deTai)){
                   cungDetai = 1;
               }
           }

           listResult.add(
                   new MentorPoint(i, chenhLechNCT, ten, chenhLechHH, chenhLechDTB, chenhLechDoAn, cungDetai)            
           );

       }
       return (ArrayList<MentorPoint>) listResult;
    }
}
