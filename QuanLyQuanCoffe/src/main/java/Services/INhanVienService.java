package Services;

import Models.NhanVien;

import java.util.List;

public interface INhanVienService {
    List<NhanVien> getList();

    Boolean save(NhanVien nhanVien);

    Boolean delete(NhanVien nhanVien);

    Boolean update(NhanVien nhanVien);

    NhanVien getById(long id);
}
