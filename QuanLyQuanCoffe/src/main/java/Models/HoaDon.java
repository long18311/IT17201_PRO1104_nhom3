/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author vanlo
 */
@Entity
@Table (name = "hoadon")
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdHoaDon")
    private long Id;
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
    @Column(name = "SoLuongSP")
    private int SoLuong; 
    
}
