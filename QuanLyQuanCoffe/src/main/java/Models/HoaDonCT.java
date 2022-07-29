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
@Table(name = "hoadonchitiet")
public class HoaDonCT implements Serializable{
     @EmbeddedId
    private HoaDonCTId id;
    @ManyToOne
    @MapsId("IdHoaDon")
    @JoinColumn(name = "IdHoaDon", nullable = false)
    private HoaDon hoaDon;
    @ManyToOne
    @MapsId("Id_SP")
    @JoinColumn(name = "Id_SP", nullable = false)
    private SanPham sanPham;
    @Column(name = "SoLuongSP")
    private int SoLuongSP;





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

    public int getSoLuongSP() {
        return SoLuongSP;
    }

    public void setSoLuongSP(int soLuongSP) {
        SoLuongSP = soLuongSP;
    }

    public HoaDonCT(HoaDon hoaDon, SanPham sanPham, int soLuongSP) {
        this.hoaDon = hoaDon;
        this.sanPham = sanPham;
        SoLuongSP = soLuongSP;
    }

    public HoaDonCT() {
    }
}
