package Repositories;

import DomainModels.NguoiHoc;
import ViewModels.QLNguoiHoc;

import java.util.List;

public interface INguoiHocRepository {
    List<NguoiHoc> findAll();

    NguoiHoc findById(String maCD);

    NguoiHoc save(NguoiHoc nguoiHoc);

    long delete(String maNH);

    long totalCount();
    List<NguoiHoc> findByten(String ten);
//    List<NguoiHoc> selectByCourse(Integer makh);
}
