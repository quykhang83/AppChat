/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appchat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mycompany.appchat.helper.DB_Helper;
import com.mycompany.appchat.model.NguoiDung;

/**
 *
 * @author Duy
 */
public class NguoiDungDao {
    public NguoiDung checkLogin (String tenDangNhap, String matKhau) throws Exception {
        String sql = "select tendangnhap, matkhau, vaitro from nguoidung "
                + "where tendangnhap=? and matkhau =?";
        try (
                Connection con = DB_Helper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql);) {
            ptmt.setString(1, tenDangNhap);
            ptmt.setString(2, matKhau);
            try (ResultSet rs = ptmt.executeQuery();) {
                if (rs.next()) {
                    NguoiDung nd = new NguoiDung();
                    nd.setTenDangNhap(tenDangNhap);
                    nd.setVaiTro(rs.getString("vaitro"));
                    nd.setMatKhau(matKhau);
                    return nd;
                }
            }
        }
        return null;
    }
    
     //==========================================================
     public NguoiDung findByMaND(String maND) throws Exception {
        String sql = "select * from nguoidung "
                +"where tendangnhap=?";
        try (
                Connection con = DB_Helper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql); ) {
            ptmt.setString(1,maND);
            try (ResultSet rs = ptmt.executeQuery();) {
                if (rs.next()) {
                    NguoiDung nd = new NguoiDung();
                    nd.setTenDangNhap(rs.getString(1));
                    nd.setMatKhau(rs.getString(2));
                    nd.setVaiTro(rs.getString(3));
                    return nd;
                }
            }
            return null;
        }
    }
     
     public boolean updateMK(String tdn, String mkm) throws Exception {
        String sql = "update nguoidung set matkhau=? "
                +"where tenDangNhap=?";
        try (
                Connection con = DB_Helper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql); ) {
            ptmt.setString(1, mkm);
            ptmt.setString(2, tdn);
            return ptmt.executeUpdate()>0;
        }
    }
    //==============================================================
}
