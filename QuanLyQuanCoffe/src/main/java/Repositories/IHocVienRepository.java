package Repositories;

import DomainModels.HocVien;

import java.util.List;

public interface IHocVienRepository {
    List<HocVien> findAll();

    HocVien findById(int maHV);

    HocVien save(HocVien hocVien);

    long delete(int maHV);

    long totalCount();
}
