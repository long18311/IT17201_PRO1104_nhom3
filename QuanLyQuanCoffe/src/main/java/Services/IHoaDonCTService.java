package Services;

import Models.HoaDon;
import Models.HoaDonCT;

import java.util.List;

public interface IHoaDonCTService {
    List<HoaDonCT> getList();
    List<HoaDonCT> getList(HoaDon hoaDon);

    Boolean save(HoaDonCT HoaDonCT);
    Boolean save(HoaDonCT HoaDonCT,long id);

    Boolean delete(HoaDonCT HoaDonCT);

    Boolean update(HoaDonCT HoaDonCT);
    Boolean update(HoaDonCT HoaDonCT,long id);
    Boolean saveOrUpdate(HoaDonCT HoaDon);

    HoaDonCT getById(long id);
} 
