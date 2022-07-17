package Repositories;

import DomainModels.ChuyenDe;
import DomainModels.Product;

import java.util.List;

public interface IChuyenDeRepository {
    List<ChuyenDe> findAll();

    ChuyenDe findById(String maCD);

    ChuyenDe save(ChuyenDe chuyenDe);

    int delete(String maCD);

    long totalCount();
}
