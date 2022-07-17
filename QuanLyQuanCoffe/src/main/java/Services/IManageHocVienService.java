package Services;

import DomainModels.HocVien;
import ViewModels.QLHocVien;

import java.util.List;

public interface IManageHocVienService {
    List<QLHocVien> getHocViens();
    List<QLHocVien> getHocViens(List<HocVien> lst);


    QLHocVien getHocVienById(long id);

    QLHocVien createNewHocVien(QLHocVien hocVien);

    QLHocVien updateHocVienById(QLHocVien hocVien);

    long deleteHocVienById(long id);

    long countAllHocVien();
}
