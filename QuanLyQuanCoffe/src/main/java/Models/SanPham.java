/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author vanlo
 */
@Entity
@Table(name = "Sanpham")
public class SanPham{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_SP")
    private long id;
    @Column(name = "TenSP")
    private String Ten;
    @Column(name = "GiaBanSP")
    private int GiaBan;
    @Column(name = "MoTaSP")
    private String MoTa;
    @Column(name = "SoLuongSP")
    private int SoLuong;
    @Column(name = "Anh")
    private String Anh;

    public List<HoaDonCT> getHoadonCT() {
        return hoadonCT;
    }

    public void setHoadonCT(List<HoaDonCT> hoadonCT) {
        this.hoadonCT = hoadonCT;
    }

    @OneToMany
    @JoinTable(name = "sanpham")
    private List<HoaDonCT> hoadonCT;

    public SanPham() {
        
    }
    public SanPham(long id, String Ten, int GiaBan, String MoTa, int SoLuong, String Anh) {
        this.id = id;
        this.Ten = Ten;
        this.GiaBan = GiaBan;
        this.MoTa = MoTa;
        this.SoLuong = SoLuong;
        this.Anh = Anh;
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

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }
    
    
    
}
