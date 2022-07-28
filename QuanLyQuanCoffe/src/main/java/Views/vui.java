package Views;

import Models.HoaDon;
import Models.HoaDonCT;
import Models.NhanVien;
import Models.SanPham;
import java.util.List;

import Repositories.HoaDonCTRepository;
import Repositories.HoaDonRepository;
import Repositories.HoaDonRepository;
import Repositories.NhanVienRepository;
import Repositories.SanPhanRepository;
import Services.INhanVienService;
import Services.ISanPhamService;
import Services.NhanVienService;
import Services.SanPhamService;

public class vui {
    static SanPhamService NV = new SanPhamService();
    public static void main(String[] args) {
        List<SanPham> NVs = NV.getList();
        System.out.println("vui");
        for (SanPham nv : NVs) {
            System.out.println(nv.getId());
        }
    }
}
