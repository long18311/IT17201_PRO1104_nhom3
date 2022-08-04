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
@Table(name = "KhachHang")
public class KhachHang implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "TenKH")
    private String TenKH;
    @Column(name = "SDT")
    private String SDT;
    @Column(name = "TT")
    private boolean TT;
    @OneToMany(mappedBy = "khachHang")    
    private List<HoaDon> hoadons;

    public boolean isTT() {
        return TT;
    }

    public void setTT(boolean TT) {
        this.TT = TT;
    }

    public KhachHang(long id, String tenKH, String SDT) {
        this.id = id;
        TenKH = tenKH;
        this.SDT = SDT;
    }

    public KhachHang(String tenKH, String SDT) {
        TenKH = tenKH;
        this.SDT = SDT;
    }

    public KhachHang(String TenKH, String SDT, boolean TT) {
        this.TenKH = TenKH;
        this.SDT = SDT;
        this.TT = TT;
    }

    public KhachHang(long id, String TenKH, String SDT, boolean TT) {
        this.id = id;
        this.TenKH = TenKH;
        this.SDT = SDT;
        this.TT = TT;
    }

    public KhachHang() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<HoaDon> getHoadons() {
        return hoadons;
    }

    public void setHoadons(List<HoaDon> hoadons) {
        this.hoadons = hoadons;
    }
}
