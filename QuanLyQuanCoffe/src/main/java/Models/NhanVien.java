/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;
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
@Table(name = "NhanVien")
public class NhanVien implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_ND")
    private long Id;
    
    @Column(name = "UserName")
    private String UserName;
    
    @Column(name = "MatKhau")
    private String MatKhau;
    
    @Column(name = "Ten_ND")
    private String Ten_ND;
    
    @Column(name = "NgaySinh")
    private int NgaySinh;
    
    @Column(name = "SoDienThoai")
    private String SDT;
    
    @Column(name = "Email")
    private String Email;
    
    @Column(name = "ChucVu")
    private String ChucVu;

    public NhanVien() {
    }

    public long getId() {
        return Id;
    }

    public NhanVien(long Id, String UserName, String MatKhau, String Ten_ND, int NgaySinh, String SDT, String Email, String ChucVu) {
        this.Id = Id;
        this.UserName = UserName;
        this.MatKhau = MatKhau;
        this.Ten_ND = Ten_ND;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.Email = Email;
        this.ChucVu = ChucVu;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getTen_ND() {
        return Ten_ND;
    }

    public void setTen_ND(String Ten_ND) {
        this.Ten_ND = Ten_ND;
    }

    public int getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(int NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

}
