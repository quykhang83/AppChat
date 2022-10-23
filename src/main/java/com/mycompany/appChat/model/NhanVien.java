/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appChat.model;

/**
 *
 * @author Duy
 */
public class NhanVien {
    private String ma, hoten, luong, email, sdt, gioiTinh, diachi;


    public NhanVien() {
    }

    public NhanVien(String ma, String hoten, String luong, String email, String sdt, String gioiTinh, String diachi) {
        this.ma = ma;
        this.hoten = hoten;
        this.luong = luong;
        this.email = email;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
        this.diachi = diachi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    

}