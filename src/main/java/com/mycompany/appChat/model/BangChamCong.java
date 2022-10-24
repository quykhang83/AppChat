/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appchat.model;

/**
 *
 * @author Duy
 */
public class BangChamCong {
    private String maNhanVien, ngay, thang, nam,soGioLamDuoc;

    public BangChamCong() {
    }

    public BangChamCong(String maNhanVien, String ngay, String thang, String nam, String soGioLamDuoc) {
        this.maNhanVien = maNhanVien;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.soGioLamDuoc = soGioLamDuoc;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getSoGioLamDuoc() {
        return soGioLamDuoc;
    }

    public void setSoGioLamDuoc(String soGioLamDuoc) {
        this.soGioLamDuoc = soGioLamDuoc;
    }

    
}
