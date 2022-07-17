package Services;

import ViewModels.QLNguoiHoc;

import java.util.List;

public interface IManageNguoiHocService {
    List<QLNguoiHoc> getNguoiHocs();

    QLNguoiHoc getQLNguoiHocById(String maNH);

    QLNguoiHoc createNewQLNguoiHoc(QLNguoiHoc nguoiHoc);

    QLNguoiHoc updateQLNguoiHocById(QLNguoiHoc nguoiHoc);

    long deleteQLNguoiHocById(String maNH);

    long countAllQLNguoiHoc();
    List<QLNguoiHoc> findByten(String ten);
}
