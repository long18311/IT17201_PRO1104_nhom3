/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.List;
import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author vanlo
 */
@Entity
@Table (name = "khachhang")
public class KhachHang implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdKhachHang")
    private long id;
    @Column(name = "TenKH")
    private String TenKH;
    @Column(name = "SoDienThoai")
    private String SDT;
    @OneToMany
    @JoinTable(name = "khachHang")
    private List<HoaDon> hoadons;

    public KhachHang(long Id, String TenKH, String SDT, List<HoaDon> hoadons) {
        this.id = Id;
        this.TenKH = TenKH;
        this.SDT = SDT;
        this.hoadons = hoadons;
    }

    public KhachHang(String tenKH, String SDT) {
        TenKH = tenKH;
        this.SDT = SDT;
    }

    public List<HoaDon> getHoadons() {
        return hoadons;
    }

    public void setHoadons(List<HoaDon> hoadons) {
        this.hoadons = hoadons;
    }
    public KhachHang() {
    }

    public KhachHang(long id, String tenKH, String SDT) {
        id = id;
        TenKH = tenKH;
        this.SDT = SDT;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        id = id;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String tenKH) {
        TenKH = tenKH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
}
