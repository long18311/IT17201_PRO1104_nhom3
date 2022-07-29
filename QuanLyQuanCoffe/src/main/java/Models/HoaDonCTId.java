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
@Embeddable
public class HoaDonCTId implements Serializable {
    @Column(name = "IdHoaDon")
    Long IdHoaDon;

    @Column(name = "Id_SP")
    Long Id_SP;
    
}
