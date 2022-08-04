/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import jakarta.persistence.*;
import java.io.Serializable;



/**
 *
 * @author vanlo
 */
@Entity
@Table(name = "HoaDonCT")
public class HoaDonCT implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long Id;
    @ManyToOne
    @JoinColumn(name = "IdHD", nullable = false)
    private HoaDon hoaDon; 
    @ManyToOne
    @JoinColumn(name = "IdSP", nullable = false)
    private SanPham sanPham; 
    @Column(name = "SoLuong")
    private int SoLuong;
    @Column(name = "giaLM")
    private int giaLM;

    public HoaDonCT(long Id) {
        this.Id = Id;
    }

    public HoaDonCT(HoaDon hoaDon, SanPham sanPham, int SoLuong, int giaLM) {
        this.hoaDon = hoaDon;
        this.sanPham = sanPham;
        this.SoLuong = SoLuong;
        this.giaLM = giaLM;
    }

    public HoaDonCT() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getGiaLM() {
        return giaLM;
    }

    public void setGiaLM(int giaLM) {
        this.giaLM = giaLM;
    }
}
