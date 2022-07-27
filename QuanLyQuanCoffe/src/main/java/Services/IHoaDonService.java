package Services;

import Models.HoaDon;
import Models.NhanVien;

import java.util.List;

public interface IHoaDonService {
    List<HoaDon> getList();

    Boolean save(HoaDon hoaDon);

    Boolean delete(HoaDon hoaDon);

    Boolean update(HoaDon hoaDon);

    HoaDon getById(long id);
}
