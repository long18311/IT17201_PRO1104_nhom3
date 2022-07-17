/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModels;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author Sieu Nhan Bay
 */
@Entity
@Table(name = "HocVien")
public class HocVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maHV")
    private int maHV;
    @ManyToOne
    @JoinColumn(name = "maKH")
    private KhoaHoc khoaHoc;
    @ManyToOne
    @JoinColumn(name = "maNH")
    private NguoiHoc nguoiHoc;
    @Column(name = "diem")
    private double diem;

    public HocVien(int maHV, KhoaHoc khoaHoc, NguoiHoc nguoiHoc, double diem) {
        this.maHV = maHV;
        this.khoaHoc = khoaHoc;
        this.nguoiHoc = nguoiHoc;
        this.diem = diem;
    }

    public HocVien() {
    }

    public int getMaHV() {
        return maHV;
    }

    public void setMaHV(int maHV) {
        this.maHV = maHV;
    }

    public KhoaHoc getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(KhoaHoc khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public NguoiHoc getNguoiHoc() {
        return nguoiHoc;
    }

    public void setNguoiHoc(NguoiHoc nguoiHoc) {
        this.nguoiHoc = nguoiHoc;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}
