/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModels;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Sieu Nhan Bay
 */
@Entity
@Table(name="NhanVien")
public class NhanVien implements Serializable {
    @Id
    @Column(name = "maNV")
    private String maNV;
    @Column(name = "matKhau")
    private String matKhau;
    @Column(name = "hoTen")
    private String hoTen;
    @Column(name = "vaiTro")
    private boolean vaiTro=false;
    @OneToMany(mappedBy = "nhanVien", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<KhoaHoc> khoaHocs;

    public NhanVien() {
    }

    public List<KhoaHoc> getKhoaHocs() {
        return khoaHocs;
    }

    public void setKhoaHocs(List<KhoaHoc> khoaHocs) {
        this.khoaHocs = khoaHocs;
    }
    public NhanVien(String maNV, String matKhau, String hoTen, boolean vaiTro, List<KhoaHoc> khoaHocs) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.vaiTro = vaiTro;
        this.khoaHocs = khoaHocs;
    }
    public NhanVien(String maNV, String matKhau, String hoTen, boolean vaiTro) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.vaiTro = vaiTro;
    }
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }
}
