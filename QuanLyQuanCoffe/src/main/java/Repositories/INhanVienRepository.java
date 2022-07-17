package Repositories;

import DomainModels.NhanVien;

import java.util.List;

public interface INhanVienRepository {
    List<NhanVien> findAll();

    NhanVien findById(String maCD);

    NhanVien save(NhanVien nhanVien);

    long delete(String maNV);

    long totalCount();
}
