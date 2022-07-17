/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModels;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sieu Nhan Bay
 */
@Entity
@Table(name = "NguoiHoc")
public class NguoiHoc implements Serializable {
    @Id
    @Column(name = "maNH")
    private String maNH;
    @Column(name = "hoTen")
    private String hoTen;
    @Column(name = "ngaySinh")
    private Date ngaySinh;
    @Column(name = "gioiTinh")
    private boolean gioiTinh;
    @Column(name = "dienThoai")
    private String dienThoai;
    @Column(name = "email")
    private String email;
    @Column(name = "ghiChu")
    private String ghiChu;
    @ManyToOne
    @JoinColumn(name = "maNV")
    private NhanVien nhanVien;
    @Column(name = "ngayDK")
    private Date ngayDK= new Date();

    public List<HocVien> getHocViens() {
        return hocViens;
    }

    public void setHocViens(List<HocVien> hocViens) {
        this.hocViens = hocViens;
    }

    @OneToMany(mappedBy= "nguoiHoc", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<HocVien> hocViens;

    public NguoiHoc(String maNH, String hoTen, Date ngaySinh, boolean gioiTinh, String dienThoai, String email, String ghiChu, NhanVien nhanVien, Date ngayDK, List<HocVien> hocViens) {
        this.maNH = maNH;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.dienThoai = dienThoai;
        this.email = email;
        this.ghiChu = ghiChu;
        this.nhanVien = nhanVien;
        this.ngayDK = ngayDK;
        this.hocViens = hocViens;
    }

    public NguoiHoc(String maNH, String hoTen, Date ngaySinh, boolean gioiTinh, String dienThoai, String email, String ghiChu, NhanVien nhanVien, Date ngayDK) {
        this.maNH = maNH;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.dienThoai = dienThoai;
        this.email = email;
        this.ghiChu = ghiChu;
        this.nhanVien = nhanVien;
        this.ngayDK = ngayDK;
    }

    public NguoiHoc() {
    }

    public String getMaNH() {
        return maNH;
    }

    public void setMaNH(String maNH) {
        this.maNH = maNH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public Date getNgayDK() {
        return ngayDK;
    }

    public void setNgayDK(Date ngayDK) {
        this.ngayDK = ngayDK;
    }




}
