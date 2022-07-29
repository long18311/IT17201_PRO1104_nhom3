/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;

/**
 *
 * @author vanlo
 */
@Entity
@Table(name = "NhanVien")
public class NhanVien implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_NV")
    private long id;
    
    @Column(name = "UserName")
    private String UserName;
    
    @Column(name = "MatKhau")
    private String MatKhau;
    
    @Column(name = "Ten_NV")
    private String Ten_NV;
    
    @Column(name = "NgaySin")
    private Date NgaySinh;
    
    @Column(name = "SoDienThoai")
    private String SDT;
    
    @Column(name = "Email")
    private String Email;
    
    @Column(name = "ChucVu")
    private String ChucVu;


    public NhanVien() {
    }

    public long getId() {
        return id;
    }

    public String getTen_NV() {
        return Ten_NV;
    }

    public void setTen_NV(String ten_NV) {
        Ten_NV = ten_NV;
    }

    public NhanVien(String userName, String matKhau, String ten_NV, Date ngaySinh, String SDT, String email, String chucVu) {
        UserName = userName;
        MatKhau = matKhau;
        Ten_NV = ten_NV;
        NgaySinh = ngaySinh;
        this.SDT = SDT;
        Email = email;
        ChucVu = chucVu;
    }

    public NhanVien(long Id, String UserName, String MatKhau, String Ten_NV, Date NgaySinh, String SDT, String Email, String ChucVu) {
        this.id = Id;
        this.UserName = UserName;
        this.MatKhau = MatKhau;
        this.Ten_NV = Ten_NV;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.Email = Email;
        this.ChucVu = ChucVu;
    }

    public void setId(long Id) {
        this.id = Id;
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



    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
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
