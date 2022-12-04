/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

/**
 *
 * @author Banh Chung Ran
 */
public class hoaDonViewModelHUY {
    private String maHD;
    private String hoVaTen;
    private String tenKhachHang;
    private int soLuong;
    private long tongTien;
    private String tenHTTT;
    private String tenHTGH;
    private String trangThai;

    public hoaDonViewModelHUY() {
    }

    public hoaDonViewModelHUY(String maHD, String hoVaTen, String tenKhachHang, int soLuong, long tongTien, String tenHTTT, String tenHTGH, String trangThai) {
        this.maHD = maHD;
        this.hoVaTen = hoVaTen;
        this.tenKhachHang = tenKhachHang;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
        this.tenHTTT = tenHTTT;
        this.tenHTGH = tenHTGH;
        this.trangThai = trangThai;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public long getTongTien() {
        return tongTien;
    }

    public void setTongTien(long tongTien) {
        this.tongTien = tongTien;
    }

    public String getTenHTTT() {
        return tenHTTT;
    }

    public void setTenHTTT(String tenHTTT) {
        this.tenHTTT = tenHTTT;
    }

    public String getTenHTGH() {
        return tenHTGH;
    }

    public void setTenHTGH(String tenHTGH) {
        this.tenHTGH = tenHTGH;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    
    
}
