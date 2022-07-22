package Views;

import Models.NhanVien;
import java.util.List;
import Repositories.NhanVienRepository;

public class vui {
    static NhanVienRepository NV = new NhanVienRepository();
    public static void main(String[] args) {
        List<NhanVien> NVs = NV.getList();
        System.out.println("vui");
        for (NhanVien nv : NVs) {
            System.out.println(nv.getId());
        }
    }
}
