package Services;

import DomainModels.KhoaHoc;
import ViewModels.QLKhoaHoc;

import java.util.List;

public interface IManageKhoaHocService {
    List<QLKhoaHoc> getKhoaHocs();
    List<QLKhoaHoc> getKhoaHocs(List<KhoaHoc> lstKH);

    QLKhoaHoc getKhoaHocById(long id);

    QLKhoaHoc createNewKhoaHoc(QLKhoaHoc khoaHoc);

    QLKhoaHoc updateKhoaHocById(QLKhoaHoc khoaHoc);

    long deleteKhoaHocById(long id);

    long countAllKhoaHoc();
}
