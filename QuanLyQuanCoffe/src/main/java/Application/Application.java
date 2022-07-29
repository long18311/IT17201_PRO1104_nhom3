package Application;

import Models.KhachHang;
import Models.NhanVien;
import Views.DangNhapJDialog;
import Views.KhachHangJDialog;
import Views.NhanVienJDialog;
import Views.SanPhamJDialog;


public class Application {
    public static void main(String[] args) {
       new KhachHangJDialog().setVisible(true);
    }
}
