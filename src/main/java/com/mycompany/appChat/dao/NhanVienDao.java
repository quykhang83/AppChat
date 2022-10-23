/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appChat.dao;

import com.mycompany.appChat.helper.DB_Helper;
import com.mycompany.appChat.model.NhanVien;
import com.mycompany.appChat.model.NguoiDung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Duy
 */
public class NhanVienDao {
    public boolean insert(NhanVien nv) throws Exception {
        String sql = "insert into nhanvien VALUES (?,?,?,?,?,?,?)";
        try (
                Connection con = DB_Helper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql); ) {
            ptmt.setString(1, nv.getMa());
            ptmt.setString(2, nv.getHoten());
            ptmt.setString(3, nv.getLuong());
            ptmt.setString(4, nv.getEmail());
            ptmt.setString(5, nv.getSdt());
            ptmt.setString(6, nv.getGioiTinh());
            ptmt.setString(7, nv.getDiachi());  
            return ptmt.executeUpdate()>0;
        }
       
    }
    //==========================================================================
    public boolean update(NhanVien nv) throws Exception {
        String sql = "update nhanvien set hoten=?, luong=?, email=?, sodt =?, gioitinh=?, diachi=? "
                +"where maNhanVien=?";
        try (
                Connection con = DB_Helper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql); ) {
            ptmt.setString(7, nv.getMa());
            ptmt.setString(1, nv.getHoten());
            ptmt.setString(2, nv.getLuong());
            ptmt.setString(3, nv.getEmail());
            ptmt.setString(4, nv.getSdt());
            ptmt.setString(5, nv.getGioiTinh());
            ptmt.setString(6, nv.getDiachi());  
            return ptmt.executeUpdate()>0;
        }
    }
    //==============================================================
    public boolean delete(String maNV) throws Exception {
        String sql = "delete from nhanvien "
                +"where maNhanVien=?";
        try (
                Connection con = DB_Helper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql); ) {
            ptmt.setString(1,maNV);
            return ptmt.executeUpdate()>0;
        }
  }
    //==========================================================
     public NhanVien findByMaNV(String maNV) throws Exception {
        String sql = "select * from nhanvien "
                +"where maNhanVien=?";
        try (
                Connection con = DB_Helper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql); ) {
            ptmt.setString(1,maNV);
            try (ResultSet rs = ptmt.executeQuery();) {
                if (rs.next()) {
                    NhanVien nv = new NhanVien();
                    nv.setMa(rs.getString(1));
                    nv.setHoten(rs.getString(2));
                    nv.setLuong(rs.getString(3));
                    nv.setEmail(rs.getString(4));
                    nv.setSdt(rs.getString(5));
                    nv.setGioiTinh(rs.getString(6));
                    nv.setDiachi(rs.getString(7));
                    return nv;
                }
            }
            return null;
        }
    }
     //=========================================================
     public List <NhanVien> findAll() throws Exception {
        String sql = "select * from nhanvien;";
        try (
                Connection con = DB_Helper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql); ) {
            try (ResultSet rs = ptmt.executeQuery();) {
                List <NhanVien> list = new ArrayList<>();
                while (rs.next()) {
                    NhanVien nv = new NhanVien();
                    nv.setMa(rs.getString(1));
                    nv.setHoten(rs.getString(2));
                    nv.setLuong(rs.getString(3));
                    nv.setEmail(rs.getString(4));
                    nv.setSdt(rs.getString(5));
                    nv.setGioiTinh(rs.getString(6));
                    nv.setDiachi(rs.getString(7));
                    list.add(nv);
                }
                return list;
            }
        }
    }
}
