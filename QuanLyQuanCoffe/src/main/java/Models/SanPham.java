/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author vanlo
 */
@Entity
@Table(name = "sanpham")
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

    
    
}
