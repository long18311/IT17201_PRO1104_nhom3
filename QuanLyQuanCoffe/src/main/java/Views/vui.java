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
import Services.NhanVienService;

public class vui {
    static INhanVienService NV = new NhanVienService();
    public static void main(String[] args) {
        List<NhanVien> NVs = NV.getList();
        System.out.println("vui");
        for (NhanVien nv : NVs) {
            System.out.println(nv.getId());
        }
    }
}
