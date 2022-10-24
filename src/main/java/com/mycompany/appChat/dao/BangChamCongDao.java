/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appchat.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.appchat.helper.DB_Helper;
import com.mycompany.appchat.model.BangChamCong;
import com.mycompany.appchat.model.NhanVien;

/**
 *
 * @author Duy
 */
public class BangChamCongDao {
     public boolean insert(BangChamCong bcc) throws Exception {
        String sql = "insert into bangchamcong VALUES (?,?,?,?,?)";
        try (
                Connection con = DB_Helper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql); ) {
            ptmt.setString(1, bcc.getMaNhanVien());
            ptmt.setString(2, bcc.getNgay());
            ptmt.setString(3, bcc.getThang());
            ptmt.setString(4, bcc.getNam());
            ptmt.setString(5, bcc.getSoGioLamDuoc());
            return ptmt.executeUpdate()>0;
        }
       
    }
    //==========================================================================
      public boolean update(BangChamCong bcc) throws Exception {
        String sql = "update BangChamCong set soGioLam =? "
                +"where maNhanVien=? and ngay=? and thang =? and nam =?";
        try (
                Connection con = DB_Helper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql); ) {
            ptmt.setString(1, bcc.getSoGioLamDuoc());
            ptmt.setString(2, bcc.getMaNhanVien());
            ptmt.setString(3, bcc.getNgay());
            ptmt.setString(4, bcc.getThang());
            ptmt.setString(5, bcc.getNam());
            return ptmt.executeUpdate()>0;
        }
    }
    //==============================================================
     public boolean delete(String maNV, String ngay,String thang,String nam) throws Exception {
        String sql = "delete from bangchamcong "
                +"where maNhanVien=? and ngay =? and thang =? and nam=?";
        try (
                Connection con = DB_Helper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql); ) {
            ptmt.setString(1,maNV);
            ptmt.setString(2,ngay);
            ptmt.setString(3,thang);
            ptmt.setString(4,nam);
            return ptmt.executeUpdate()>0;
        }
  }
    //==========================================================
      public BangChamCong findByMaNVNgayThangNam(String maNV, String ngay, String thang, String nam) 
              throws Exception {
        String sql = "select * from bangchamcong "
                +"where maNhanVien=? and ngay =? and thang =? and nam=?";
        try (
                Connection con = DB_Helper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql); ) {
            ptmt.setString(1,maNV);
            ptmt.setString(2,ngay);
            ptmt.setString(3,thang);
            ptmt.setString(4,nam);
            try (ResultSet rs = ptmt.executeQuery();) {
                if (rs.next()) {
                    BangChamCong bcc = new BangChamCong();
                    bcc.setMaNhanVien(rs.getString(1));
                    bcc.setNgay(rs.getString(2));
                    bcc.setThang(rs.getString(3));
                    bcc.setNam(rs.getString(4));
                    bcc.setSoGioLamDuoc(rs.getString(5));
                    return bcc;
                }
            }
            return null;
        }
    }
     //=========================================================
     public List <BangChamCong> findAllByMaNhanVien(String maNV) 
              throws Exception {
        String sql = "select * from bangchamcong where maNhanVien=?";
        try (
                Connection con = DB_Helper.openConnection();
                PreparedStatement ptmt = con.prepareStatement(sql); ) {
             ptmt.setString(1,maNV);
            try (ResultSet rs = ptmt.executeQuery();) {
                List <BangChamCong> list = new ArrayList<>();
                while (rs.next()) {
                    BangChamCong bcc = new BangChamCong();
                    bcc.setMaNhanVien(rs.getString(1));
                    bcc.setNgay(rs.getString(2));
                    bcc.setThang(rs.getString(3));
                    bcc.setNam(rs.getString(4));
                    bcc.setSoGioLamDuoc(rs.getString(5));
                    list.add(bcc);
                }
                return list;
            }
        }
    }
}
