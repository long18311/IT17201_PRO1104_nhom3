/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModels;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Sieu Nhan Bay
 */
@Entity
@Table(name = "ChuyenDe")
public class ChuyenDe implements Serializable {
    @Id
    @Column(name = "maCD")
    private String maCD;
    @Column(name = "tenCD")
    private String tenCD;
    @Column(name = "hocPhi")
    private double hocPhi;
    @Column(name = "thoiLuong")
    private int thoiLuong;
    @Column(name = "hinh")
    private String hinh;
    @Column(name = "moTa")
    private String moTa;
    public ChuyenDe(String maCD, String tenCD, double hocPhi, int thoiLuong, String hinh, String moTa) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.hinh = hinh;
        this.moTa = moTa;
    }

    public ChuyenDe() {
    }

    @Override
    public String toString(){
        return this.tenCD;
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
}
