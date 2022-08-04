package Services;

import Models.HoaDon;
import Models.HoaDonCT;
import Repositories.HoaDonCTRepository;
import Repositories.HoaDonRepository;

import java.util.List;

public class HoaDonCTService implements IHoaDonCTService {
    public HoaDonCTRepository hoaDonCTRepository = new HoaDonCTRepository();
    private HoaDonRepository hoaDonRepository = new HoaDonRepository();
    @Override
    public List<HoaDonCT> getList() {
        return hoaDonCTRepository.getList();
    }

    @Override
    public Boolean save(HoaDonCT hoaDonCT) {
        return hoaDonCTRepository.save(hoaDonCT);
    }


    @Override
    public Boolean save(HoaDonCT hoaDonCT, long id) {
        hoaDonCT.setHoaDon(hoaDonRepository.getById(id));
        System.out.println(hoaDonCT.getHoaDon().getId() + " "+hoaDonCT.getSanPham().getId()+" "+hoaDonCT.getSoLuong());
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
    public Boolean update(HoaDonCT hoaDonCT, long id) {
        hoaDonCT.setHoaDon(hoaDonRepository.getById(id));
        return hoaDonCTRepository.update(hoaDonCT);
    }

    @Override
    public Boolean saveOrUpdate(HoaDonCT hoaDonCT) {
        return hoaDonCTRepository.update(hoaDonCT);
    }

    @Override
    public HoaDonCT getById(long id) {
        return hoaDonCTRepository.getById(id);
    }

    @Override
    public List<HoaDonCT> getList(HoaDon hoaDon) {
          return hoaDonCTRepository.getList(hoaDon);
    }
}
