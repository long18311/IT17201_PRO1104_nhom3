package Services;

import Models.HoaDonCT;
import Repositories.HoaDonCTRepository;

import java.util.List;

public class HoaDonCTService implements IHoaDonCTService {
    public HoaDonCTRepository hoaDonCTRepository = new HoaDonCTRepository();
    @Override
    public List<HoaDonCT> getList() {
        return hoaDonCTRepository.getList();
    }

    @Override
    public Boolean save(HoaDonCT hoaDonCT) {
        return hoaDonCTRepository.save(hoaDonCT);
    }

    @Override
    public Boolean delete(HoaDonCT hoaDonCT) {
        return hoaDonCTRepository.delete(hoaDonCT);
    }

    @Override
    public Boolean update(HoaDonCT hoaDonCT) {
        return hoaDonCTRepository.update(hoaDonCT);
    }

    @Override
    public HoaDonCT getById(long id) {
        return hoaDonCTRepository.getById(id);
    }
}
