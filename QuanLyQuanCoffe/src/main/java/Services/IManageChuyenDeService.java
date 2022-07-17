package Services;

import ViewModels.QLChuyenDe;

import java.util.List;

public interface IManageChuyenDeService {
    List<QLChuyenDe> getChuyenDes();

    QLChuyenDe getQLChuyenDeById(String maCD);

    QLChuyenDe createNewQLChuyenDe(QLChuyenDe chuyenDe);

    QLChuyenDe updateQLChuyenDeById(QLChuyenDe chuyenDe);

    long deleteQLChuyenDeById(String maCD);

    long countAllQLChuyenDe();
}
