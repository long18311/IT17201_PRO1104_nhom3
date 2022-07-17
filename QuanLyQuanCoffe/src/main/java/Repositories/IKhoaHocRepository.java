package Repositories;

import DomainModels.KhoaHoc;

import java.util.List;

public interface IKhoaHocRepository {
    List<KhoaHoc> findAll();

    KhoaHoc findById(int maCD);

    KhoaHoc save(KhoaHoc khoaHoc);

    long delete(int maCD);

    long totalCount();
}
