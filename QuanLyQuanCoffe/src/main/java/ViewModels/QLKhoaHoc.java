/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

import Services.IManageChuyenDeService;
import Services.IManageNhanVienService;
import Services.ManageChuyenDeService;
import Services.ManageNhanVienService;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Sieu Nhan Bay
 */
public class QLKhoaHoc {
    IManageChuyenDeService chuyenDeService = new ManageChuyenDeService();
    IManageNhanVienService nhanVienService = new ManageNhanVienService();
    private int maKH;
    private QLChuyenDe chuyenDe;
    private double hocPhi;
    private int thoiLuong;
    private Date ngayKG;
    private String ghiChu;
    private QLNhanVien NV;
    private Date ngayTao = new Date();

    public QLKhoaHoc(int maKH, QLChuyenDe chuyenDe, double hocPhi, int thoiLuong, Date ngayKG, String ghiChu, QLNhanVien NV, Date ngayTao, List<QLHocVien> hocViens) {
        this.maKH = maKH;
        this.chuyenDe = chuyenDe;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.ngayKG = ngayKG;
        this.ghiChu = ghiChu;
        this.NV = NV;
        this.ngayTao = ngayTao;
    }

    public QLKhoaHoc(int maKH, QLChuyenDe chuyenDe, double hocPhi, int thoiLuong, Date ngayKG, String ghiChu, QLNhanVien NV, Date ngayTao) {
        this.maKH = maKH;
        this.chuyenDe = chuyenDe;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.ngayKG = ngayKG;
        this.ghiChu = ghiChu;
        this.NV = NV;
        this.ngayTao = ngayTao;
    }

    public QLKhoaHoc() {
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public QLChuyenDe getChuyenDe() {
        return chuyenDe;
    }

    public void setChuyenDe(QLChuyenDe chuyenDe) {
        this.chuyenDe = chuyenDe;
    }
    public void setChuyenDe(String maCD) {
        this.chuyenDe = chuyenDeService.getQLChuyenDeById(maCD);
    }
    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public Date getNgayKG() {
        return ngayKG;
    }

    public void setNgayKG(Date ngayKG) {
        this.ngayKG = ngayKG;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public QLNhanVien getNV() {
        return NV;
    }

    public void setNV(QLNhanVien NV) {
        this.NV = NV;
    }
    public void setNV(String maNV) {
        this.NV = nhanVienService.getNhanVienById(maNV);
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
}
