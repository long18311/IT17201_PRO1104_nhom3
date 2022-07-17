package Services;
import ViewModels.QLNhanVien;

import java.util.List;

public interface IManageNhanVienService {
    List<QLNhanVien> getNhanViens();

    QLNhanVien getNhanVienById(String maNV);

    QLNhanVien createNewNhanVien(QLNhanVien nhanVien);

    QLNhanVien updateNhanVienById(QLNhanVien nhanVien);

    long deleteNhanVienById(String id);

    long countAllNhanVien();
}
