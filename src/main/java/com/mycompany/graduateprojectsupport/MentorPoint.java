package com.mycompany.graduateprojectsupport;

public class MentorPoint {

    private int MSGV;
    private int SoNamCongTac;
    private String HoTen;
    private int HocHam;
    private float DiemDoAn;
    private int SoDoAN;
    private int detai;
    
    public MentorPoint(int MSGV, int SoNamCongTac, String HoTen, int HocHam, float DiemDoAn, int SoDoAN, int detai) {
        this.MSGV = MSGV;
        this.SoNamCongTac = SoNamCongTac;
        this.HoTen = HoTen;
        this.HocHam = HocHam;
        this.DiemDoAn = DiemDoAn;
        this.SoDoAN = SoDoAN;
        this.detai = detai;
    }
    
    public int getDetai() {
        return detai;
    }
    
    public void setDetai(int detai) {
        this.detai = detai;
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

    public int getHocHam() {
        return HocHam;
    }

    public void setHocHam(int HocHam) {
        this.HocHam = HocHam;
    }

    public float getDiemDoAn() {
        return DiemDoAn;
    }

    public void setDiemDoAn(float DiemDoAn) {
        this.DiemDoAn = DiemDoAn;
    }

    public int getSoDoAN() {
        return SoDoAN;
    }

    public void setSoDoAN(int SoDoAN) {
        this.SoDoAN = SoDoAN;
    }
    
    
}
