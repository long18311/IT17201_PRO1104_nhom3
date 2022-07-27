/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author vanlo
 */
@Entity
@Table (name = "khachhang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdKhachHang")
    private long Id;
    @Column(name = "TenKH")
    private String TenKH;
    @Column(name = "SoDienThoai")
    private String SDT;
    @OneToMany
    @JoinTable(name = "khachHang")
    private List<HoaDon> hoadons;

    public KhachHang(long Id, String TenKH, String SDT, List<HoaDon> hoadons) {
        this.Id = Id;
        this.TenKH = TenKH;
        this.SDT = SDT;
        this.hoadons = hoadons;
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
        Id = id;
        TenKH = tenKH;
        this.SDT = SDT;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
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
