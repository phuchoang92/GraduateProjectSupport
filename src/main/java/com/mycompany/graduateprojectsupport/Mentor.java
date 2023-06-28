
package com.mycompany.graduateprojectsupport;

import java.util.List;

public class Mentor {
    private int MSGV;
    private int SoNamCongTac;
    private String SDT;
    private String HoTen;
    private String HocHam;
    private float DiemDoAn;
    private int SoDoAN;
    private List<String> dsDetai;
    
    public Mentor(int MSGV, String HoTen, int SoNamCongTac, String HocHam, float DiemDoAn, int SoDoAN, List dsDeTai) {
        this.MSGV = MSGV;
        this.SoNamCongTac = SoNamCongTac;
        this.DiemDoAn = DiemDoAn;
        this.HoTen = HoTen;
        this.HocHam = HocHam;
        this.SoDoAN = SoDoAN;
        this.dsDetai = dsDeTai;
    }

    public List<String> getDsDetai() {
        return dsDetai;
    }

    public void setDsDetai(List<String> dsDetai) {
        this.dsDetai = dsDetai;
    }
    
    public int getSoDoAN() {
        return SoDoAN;
    }

    public void setSoDoAN(int SoDoAN) {
        this.SoDoAN = SoDoAN;
    }

    public float getDiemDoAn() {
        return DiemDoAn;
    }

    public void setDiemDoAn(float DiemDoAn) {
        this.DiemDoAn = DiemDoAn;
    }

    public int getMSGV() {
        return MSGV;
    }

    public void setMSGV(int MSGV) {
        this.MSGV = MSGV;
    }

    public int getSoNamCongTac() {
        return SoNamCongTac;
    }

    public void setSoNamCongTac(int SoNamCongTac) {
        this.SoNamCongTac = SoNamCongTac;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getHocHam() {
        return HocHam;
    }

    public void setHocHam(String HocHam) {
        this.HocHam = HocHam;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
}
