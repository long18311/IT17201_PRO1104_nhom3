/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

import Services.IManageKhoaHocService;
import Services.IManageNguoiHocService;
import Services.ManageKhoaHocService;
import Services.ManageNguoiHocService;

/**
 *
 * @author Sieu Nhan Bay
 */
public class QLHocVien {
    IManageKhoaHocService khoaHocService = new ManageKhoaHocService();
    IManageNguoiHocService nguoiHocService = new ManageNguoiHocService();
    private int maHV;
    private QLKhoaHoc KH;
    private QLNguoiHoc NH;
    private double diem;

    public QLHocVien(int maHV, QLKhoaHoc KH, QLNguoiHoc NH, double diem) {
        this.maHV = maHV;
        this.KH = KH;
        this.NH = NH;
        this.diem = diem;
    }

    public int getMaHV() {
        return maHV;
    }

    public void setMaHV(int maHV) {
        this.maHV = maHV;
    }

    public QLKhoaHoc getKH() {
        return KH;
    }

    public void setKH(QLKhoaHoc KH) {
        this.KH = KH;
    }
    public void setKH(int maKH) {
        this.KH = khoaHocService.getKhoaHocById(maKH);

    }
    public QLNguoiHoc getNH() {
        return NH;
    }

    public void setNH(QLNguoiHoc NH) {
        this.NH = NH;
    }
    public void setNH(String maNH) {
        this.NH = nguoiHocService.getQLNguoiHocById(maNH);
    }
    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public QLHocVien() {
    }
}
