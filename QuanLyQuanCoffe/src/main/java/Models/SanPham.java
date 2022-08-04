/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author vanlo
 */
@Entity
@Table(name = "SanPham")
public class SanPham implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "Ten")
    private String Ten;
    @Column(name = "GiaBan")
    private int GiaBan;
    @Column(name = "MoTa")
    private String MoTa;
    @Column(name = "TT")
    private boolean TT;
//    @OneToMany(mappedBy = "hoaDon")
//    private List<HoaDonCT> hoadonCT;

    public boolean isTT() {
        return TT;
    }

    public void setTT(boolean TT) {
        this.TT = TT;
    }

    public SanPham(long id, String Ten, int GiaBan, String MoTa, boolean TT) {
        this.id = id;
        this.Ten = Ten;
        this.GiaBan = GiaBan;
        this.MoTa = MoTa;
        this.TT = TT;
    }

    public SanPham(String Ten, int GiaBan, String MoTa, boolean TT) {
        this.Ten = Ten;
        this.GiaBan = GiaBan;
        this.MoTa = MoTa;
        this.TT = TT;
    }

    public SanPham(long id, String ten, int giaBan, String moTa) {
        this.id = id;
        Ten = ten;
        GiaBan = giaBan;
        MoTa = moTa;
    }

    public SanPham(String ten, int giaBan, String moTa) {
        Ten = ten;
        GiaBan = giaBan;
        MoTa = moTa;
    }

    public SanPham() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int giaBan) {
        GiaBan = giaBan;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }
}
