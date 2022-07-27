package Services;

import Models.HoaDonCT;

import java.util.List;

public interface IHoaDonCTService {
    List<HoaDonCT> getList();

    Boolean save(HoaDonCT HoaDon);

    Boolean delete(HoaDonCT HoaDon);

    Boolean update(HoaDonCT HoaDon);

    HoaDonCT getById(long id);
} 
