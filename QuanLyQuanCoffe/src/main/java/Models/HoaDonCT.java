/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author vanlo
 */
@Entity
@Table(name = "hoadonchitiet")
public class HoaDonCT {

    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "IdHoaDon", nullable = false)
    private HoaDon hoaDon;
    @ManyToOne
    @JoinColumn(name = "Id_SP", nullable = false)
    private SanPham sanPham;
    
   
    
    
}
