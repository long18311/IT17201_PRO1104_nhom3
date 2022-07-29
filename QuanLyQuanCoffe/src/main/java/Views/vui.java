package Views;

import Models.HoaDon;
import Models.HoaDonCT;
import Models.KhachHang;
import Models.NhanVien;
import Models.SanPham;
import java.util.List;

import Repositories.HoaDonCTRepository;
import Repositories.HoaDonRepository;
import Repositories.HoaDonRepository;
import Repositories.KhachHangReposittory;
import Repositories.NhanVienRepository;
import Repositories.SanPhanRepository;
import Services.INhanVienService;
import Services.ISanPhamService;
import Services.KhachHangService;
import Services.NhanVienService;
import Services.SanPhamService;

public class vui {
//    static KhachHangReposittory NV = new KhachHangReposittory();
    public static void main(String[] args) {
        KhachHangReposittory NV = new KhachHangReposittory();
        List<KhachHang> NVs = NV.getList();
        System.out.println("vui");
        System.out.println(NVs.size());
        for (KhachHang nv : NVs) {
            System.out.println(nv.getId());
        }
    }
}
