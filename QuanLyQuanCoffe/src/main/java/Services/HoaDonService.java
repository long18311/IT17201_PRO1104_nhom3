package Services;

import Models.HoaDon;
import Repositories.HoaDonRepository;

import java.util.ArrayList;
import java.util.List;

public class HoaDonService implements IHoaDonService {
    private HoaDonRepository hoaDonRepository = new HoaDonRepository();


    public HoaDonService() {
        this.hoaDonRepository = new HoaDonRepository();

    }

    @Override
    public List<HoaDon> getList() {
        return hoaDonRepository.getList();
    }

    @Override
    public Boolean save(HoaDon hoaDon) {
        return hoaDonRepository.save(hoaDon);
    }

    @Override
    public Boolean delete(HoaDon hoaDon) {
        return hoaDonRepository.delete(hoaDon);
    }

    @Override
    public Boolean update(HoaDon hoaDon) {
        return hoaDonRepository.update(hoaDon);
    }

    @Override
    public HoaDon getById(long id) {
        return hoaDonRepository.getById(id);
    }
}
