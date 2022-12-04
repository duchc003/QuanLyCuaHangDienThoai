/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.HinhThucGiaoHang;
import model.HinhThucThanhToan;
import model.KhachHang;
import model.NhanVien;
import repository.NhanVienRepository;
import service.NhanVienService;
import viewmodel.NhanVienViewmodel;

/**
 *
 * @author HieuIT
 */
public class NhanVienImpl implements NhanVienService {

    private NhanVienRepository NhanVienRepository = new NhanVienRepository();

    @Override
    public List<NhanVienViewmodel> getAll() {
        return NhanVienRepository.getAll();
    }

    @Override
    public String add(NhanVienViewmodel nv) {
        boolean add = NhanVienRepository.add(nv);
        if (add) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public ArrayList<NhanVienViewmodel> getOne(String maNV) {
        return NhanVienRepository.getOne(maNV);
    }

    @Override
    public String sua(String maNV, NhanVienViewmodel nv) {
        boolean sua = NhanVienRepository.sua(maNV, nv);
        if (sua) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }

    @Override
    public ArrayList<NhanVienViewmodel> getOneTen(String hoVaten) {
        return NhanVienRepository.getOneTen(hoVaten);
    }

    @Override
    public ArrayList<NhanVienViewmodel> getOneSdt(String sdt) {
        return NhanVienRepository.getOneSdt(sdt);
    }

    @Override
    public ArrayList<NhanVien> getIDNhanVien(String id) {
        return NhanVienRepository.getIDNhanVien(id);
    }

    @Override
    public ArrayList<KhachHang> getIDKhachHang(String id) {
        return NhanVienRepository.getIDKhachHang(id);
    }

    @Override
    public ArrayList<HinhThucGiaoHang> getIDGiaoHang() {
        return NhanVienRepository.getIDGiaoHang();
    }

    @Override
    public ArrayList<HinhThucThanhToan> getIDThanhToan() {
        return NhanVienRepository.getIDThanhToan();
    }

}
