package Services;

import DomainModels.HocVien;
import Repositories.*;
import ViewModels.QLHocVien;

import java.util.ArrayList;
import java.util.List;

public class ManageHocVienService implements IManageHocVienService {
    private final IHocVienRepository _iHocVienRepository;
    private List<QLHocVien> _listHocVien;
    IManageKhoaHocService _khoaHocService =  new ManageKhoaHocService();
    IKhoaHocRepository _khoaHocRepository =  new KhoaHocRepository();
    IManageNguoiHocService _nguoihocService =  new ManageNguoiHocService();
    INguoiHocRepository _nguoihocRepository =  new NguoiHocRepository();

    public ManageHocVienService() {
        this._iHocVienRepository = new HocVienRepository();
        this._listHocVien = new ArrayList<>();
    }

    @Override
    public List<QLHocVien> getHocViens() {
        _listHocVien = new ArrayList<>();
        var hocVien = _iHocVienRepository.findAll();
        for (var x : hocVien) {

            _listHocVien.add(new QLHocVien(x.getMaHV(), _khoaHocService.getKhoaHocById(x.getKhoaHoc().getMaKH()), _nguoihocService.getQLNguoiHocById(x.getNguoiHoc().getMaNH()), x.getDiem()));
        }
        return _listHocVien;
    }

    @Override
    public List<QLHocVien> getHocViens(List<HocVien> lst) {
        _listHocVien = new ArrayList<>();
        for (var x : lst) {
            _listHocVien.add(new QLHocVien(x.getMaHV(), _khoaHocService.getKhoaHocById(x.getKhoaHoc().getMaKH()), _nguoihocService.getQLNguoiHocById(x.getNguoiHoc().getMaNH()), x.getDiem()));
        }
        return _listHocVien;
    }

    @Override
    public QLHocVien getHocVienById(long id) {
        var x = _iHocVienRepository.findById((int) id);
        return new QLHocVien(x.getMaHV(),_khoaHocService.getKhoaHocById(x.getKhoaHoc().getMaKH()), _nguoihocService.getQLNguoiHocById(x.getNguoiHoc().getMaNH()), x.getDiem());
    }

    @Override
    public QLHocVien createNewHocVien(QLHocVien hocVien) {
        var x = _iHocVienRepository.save(new HocVien(hocVien.getMaHV(), _khoaHocRepository.findById(hocVien.getKH().getMaKH()), _nguoihocRepository.findById(hocVien.getNH().getMaNH()), hocVien.getDiem()));
        return new QLHocVien(x.getMaHV(), _khoaHocService.getKhoaHocById(x.getKhoaHoc().getMaKH()), _nguoihocService.getQLNguoiHocById(x.getNguoiHoc().getMaNH()), x.getDiem());
    }

    @Override
    public QLHocVien updateHocVienById(QLHocVien hocVien) {
        var x = _iHocVienRepository.save(new HocVien(hocVien.getMaHV(), _khoaHocRepository.findById(hocVien.getKH().getMaKH()), _nguoihocRepository.findById(hocVien.getNH().getMaNH()), hocVien.getDiem()));
        return new QLHocVien(x.getMaHV(),_khoaHocService.getKhoaHocById(x.getKhoaHoc().getMaKH()), _nguoihocService.getQLNguoiHocById(x.getNguoiHoc().getMaNH()), x.getDiem());
    }

    @Override
    public long deleteHocVienById(long id) {
        return _iHocVienRepository.delete((int) id);
    }

    @Override
    public long countAllHocVien() {
        return _iHocVienRepository.totalCount();
    }
}
