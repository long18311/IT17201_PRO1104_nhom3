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
@Table(name = "KhoaHoc")
public class KhoaHoc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maKH")
    private int maKH;
    @Column(name = "hocPhi")
    private double hocPhi;
    @Column(name = "thoiLuong")
    private int thoiLuong;
    @Column(name = "ngayKG")
    private Date ngayKG;
    @Column(name = "ghiChu")
    private String ghiChu;
    @ManyToOne
    @JoinColumn(name = "maNV")
    private NhanVien nhanVien;
    @Column(name = "ngayTao")
    private Date ngayTao = new Date();
    @ManyToOne
    @JoinColumn(name = "maCD")
    private ChuyenDe chuyenDe;
    @OneToMany(mappedBy= "khoaHoc", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<HocVien> hocViens;
    public KhoaHoc() {
    }

    public KhoaHoc(int maKH, double hocPhi, int thoiLuong, Date ngayKG, String ghiChu, NhanVien nhanVien, Date ngayTao, ChuyenDe chuyenDe, List<HocVien> hocViens) {
        this.maKH = maKH;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.ngayKG = ngayKG;
        this.ghiChu = ghiChu;
        this.nhanVien = nhanVien;
        this.ngayTao = ngayTao;
        this.chuyenDe = chuyenDe;
        this.hocViens = hocViens;
    }

    public KhoaHoc(int maKH, ChuyenDe chuyenDe, double hocPhi, int thoiLuong, Date ngayKG, String ghiChu, NhanVien nhanVien, Date ngayTao) {
        this.maKH = maKH;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.ngayKG = ngayKG;
        this.ghiChu = ghiChu;
        this.nhanVien = nhanVien;
        this.ngayTao = ngayTao;
        this.chuyenDe = chuyenDe;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
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

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public ChuyenDe getChuyenDe() {
        return chuyenDe;
    }

    public void setChuyenDe(ChuyenDe chuyenDe) {
        this.chuyenDe = chuyenDe;
    }

    public List<HocVien> getHocViens() {
        return hocViens;
    }

    public void setHocViens(List<HocVien> hocViens) {
        this.hocViens = hocViens;
    }






}
