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
    @Column(name = "id")
    private long id;
    
    @Column(name = "UserName")
    private String UserName;
    
    @Column(name = "MatKhau")
    private String MatKhau;
    
    @Column(name = "Ten_NV")
    private String Ten_NV;
    
    @Column(name = "NgaySinh")
    private Date NgaySinh;
    
    @Column(name = "SDT")
    private String SDT;
    
    @Column(name = "Email")
    private String Email;
    
    @Column(name = "ChucVu")
    private boolean ChucVu;
    
    @Column(name = "TT")
    private boolean TT;

    public NhanVien() {
    }

//    public NhanVien(String userName, String matKhau, String ten_NV, Date ngaySinh, String SDT, String email, boolean chucVu) {
//        UserName = userName;
//        MatKhau = matKhau;
//        Ten_NV = ten_NV;
//        NgaySinh = ngaySinh;
//        this.SDT = SDT;
//        Email = email;
//        ChucVu = chucVu;
//    }

    public NhanVien(long id, String UserName, String MatKhau, String Ten_NV, Date NgaySinh, String SDT, String Email, boolean ChucVu, boolean TT) {
        this.id = id;
        this.UserName = UserName;
        this.MatKhau = MatKhau;
        this.Ten_NV = Ten_NV;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.Email = Email;
        this.ChucVu = ChucVu;
        this.TT = TT;
    }

    public NhanVien(String UserName, String MatKhau, String Ten_NV, Date NgaySinh, String SDT, String Email, boolean ChucVu, boolean TT) {
        this.UserName = UserName;
        this.MatKhau = MatKhau;
        this.Ten_NV = Ten_NV;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.Email = Email;
        this.ChucVu = ChucVu;
        this.TT = TT;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }

    public String getTen_NV() {
        return Ten_NV;
    }

    public void setTen_NV(String ten_NV) {
        Ten_NV = ten_NV;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
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

    public void setEmail(String email) {
        Email = email;
    }

    public boolean isChucVu() {
        return ChucVu;
    }

    public void setChucVu(boolean ChucVu) {
        this.ChucVu = ChucVu;
    }

    public boolean isTT() {
        return TT;
    }

    public void setTT(boolean TT) {
        this.TT = TT;
    }

    
}
