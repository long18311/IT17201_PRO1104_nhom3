/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author vanlo
 */
@Entity
@Table (name = "HoaDon")
public class HoaDon implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @ManyToOne
    @JoinColumn(name = "IdKhachHang", nullable = false)
    private KhachHang khachHang;
    @Column(name = "TinhTrangHD")
    private boolean TinhTrangHD;
    @Column(name = "NgayTT")
    private Date NgayTT;
    @Column(name = "TTGiamGia")
    private int TTGiamGia;
    @OneToMany(mappedBy = "hoaDon")
    private List<HoaDonCT> hoadonCT;

    public HoaDon() {
    }

    public HoaDon(long id) {
        this.id = id;
    }

    public HoaDon(long id, KhachHang khachHang, boolean tinhTrangHD, Date ngayTT, int TTGiamGia) {
        this.id = id;
        this.khachHang = khachHang;
        TinhTrangHD = tinhTrangHD;
        NgayTT = ngayTT;
        this.TTGiamGia = TTGiamGia;
        
    }

    public HoaDon(KhachHang khachHang, boolean tinhTrangHD, Date ngayTT, int TTGiamGia) {
        this.khachHang = khachHang;
        TinhTrangHD = tinhTrangHD;
        NgayTT = ngayTT;
        this.TTGiamGia = TTGiamGia;
    }

    public HoaDon(long id, KhachHang khachHang, boolean tinhTrangHD, Date ngayTT, int TTGiamGia, List<HoaDonCT> hoadonCT) {
        this.id = id;
        this.khachHang = khachHang;
        TinhTrangHD = tinhTrangHD;
        NgayTT = ngayTT;
        this.TTGiamGia = TTGiamGia;
        this.hoadonCT = hoadonCT;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public boolean isTinhTrangHD() {
        return TinhTrangHD;
    }

    public void setTinhTrangHD(boolean tinhTrangHD) {
        TinhTrangHD = tinhTrangHD;
    }

    public Date getNgayTT() {
        return NgayTT;
    }

    public void setNgayTT(Date ngayTT) {
        NgayTT = ngayTT;
    }

    public int getTTGiamGia() {
        return TTGiamGia;
    }

    public void setTTGiamGia(int TTGiamGia) {
        this.TTGiamGia = TTGiamGia;
    }

    public List<HoaDonCT> getHoadonCT() {
        return hoadonCT;
    }

    public void setHoadonCT(List<HoaDonCT> hoadonCT) {
        this.hoadonCT = hoadonCT;
    }
}
