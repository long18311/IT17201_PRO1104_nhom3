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
@Table (name = "hoadon")
public class HoaDon implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdHoaDon")
    private long id;
    @ManyToOne
    @JoinColumn(name = "IdKhachHang", nullable = false)
    private KhachHang khachHang;
    @Column(name = "TinhTrangHoaDon")
    private boolean TinhTrangHD;
    @Column(name = "NgayThanhToan")
    private Date NgayTT;
    @Column(name = "TongTien_Giam_Gia")
    private int TTGiamGia;
    @Column(name = "TongTien_Thanh_Toan")
    private int TTThanhToan;
    @OneToMany
    @JoinTable(name = "hoadon")
    private List<HoaDonCT> hoadonCT;
    public List<HoaDonCT> getHoadonCT() {
        return hoadonCT;
    }

    public void setHoadonCT(List<HoaDonCT> hoadonCT) {
        this.hoadonCT = hoadonCT;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        id = id;
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

    public int getTTThanhToan() {
        return TTThanhToan;
    }

    public void setTTThanhToan(int TTThanhToan) {
        this.TTThanhToan = TTThanhToan;
    }

    public HoaDon(long id, KhachHang khachHang, boolean tinhTrangHD, Date ngayTT, int TTGiamGia, int TTThanhToan) {
        this.id = id;
        this.khachHang = khachHang;
        TinhTrangHD = tinhTrangHD;
        NgayTT = ngayTT;
        this.TTGiamGia = TTGiamGia;
        this.TTThanhToan = TTThanhToan;
    }

    public HoaDon() {
    }
}
