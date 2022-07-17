package Services;

import DomainModels.NguoiHoc;

import Repositories.INguoiHocRepository;
import Repositories.INhanVienRepository;
import Repositories.NguoiHocRepository;
import Repositories.NhanVienRepository;
import ViewModels.QLNguoiHoc;

import java.util.ArrayList;
import java.util.List;

public class ManageNguoiHocService implements IManageNguoiHocService {
    private final INguoiHocRepository _nguoiHocRepository = new NguoiHocRepository();
    private List<QLNguoiHoc> _listNguoiHoc = new ArrayList<>();
    private IManageNhanVienService _NhanVienService = new ManageNhanVienService();
    INhanVienRepository _nhanVienRepository = new NhanVienRepository();
    IManageHocVienService _HocVienService = new ManageHocVienService();

    public ManageNguoiHocService() {
    }

    @Override
    public List<QLNguoiHoc> getNguoiHocs() {
        _listNguoiHoc = new ArrayList<>();
        var nguoiHoc = this._nguoiHocRepository.findAll();
        for (var x : nguoiHoc) {
            _listNguoiHoc.add(new QLNguoiHoc(x.getMaNH(), x.getHoTen(), x.getNgaySinh(), x.isGioiTinh(), x.getDienThoai(), x.getEmail(), x.getGhiChu(), _NhanVienService.getNhanVienById(x.getNhanVien().getMaNV()), x.getNgayDK(), _HocVienService.getHocViens(x.getHocViens())));
        }
        return _listNguoiHoc;
    }

    @Override
    public QLNguoiHoc getQLNguoiHocById(String maNH) {
        var x = _nguoiHocRepository.findById((maNH));
        return new QLNguoiHoc(x.getMaNH(), x.getHoTen(), x.getNgaySinh(), x.isGioiTinh(), x.getDienThoai(), x.getEmail(), x.getGhiChu(), _NhanVienService.getNhanVienById(x.getNhanVien().getMaNV()), x.getNgayDK(), _HocVienService.getHocViens(x.getHocViens()));
    }

    @Override
    public QLNguoiHoc createNewQLNguoiHoc(QLNguoiHoc nguoiHoc) {
        var x = _nguoiHocRepository.save(new NguoiHoc(nguoiHoc.getMaNH(), nguoiHoc.getHoTen(), nguoiHoc.getNgaySinh(), nguoiHoc.isGioiTinh(), nguoiHoc.getDienThoai(), nguoiHoc.getEmail(), nguoiHoc.getGhiChu(), _nhanVienRepository.findById(nguoiHoc.getNV().getMaNV()), nguoiHoc.getNgayDK()));
        return new QLNguoiHoc(x.getMaNH(), x.getHoTen(), x.getNgaySinh(), x.isGioiTinh(), x.getDienThoai(), x.getEmail(), x.getGhiChu(), _NhanVienService.getNhanVienById(x.getNhanVien().getMaNV()), x.getNgayDK());
    }

    @Override
    public QLNguoiHoc updateQLNguoiHocById(QLNguoiHoc nguoiHoc) {
        var x = _nguoiHocRepository.save(new NguoiHoc(nguoiHoc.getMaNH(), nguoiHoc.getHoTen(), nguoiHoc.getNgaySinh(), nguoiHoc.isGioiTinh(), nguoiHoc.getDienThoai(), nguoiHoc.getEmail(), nguoiHoc.getGhiChu(), _nhanVienRepository.findById(nguoiHoc.getNV().getMaNV()), nguoiHoc.getNgayDK()));
        return new QLNguoiHoc(x.getMaNH(), x.getHoTen(), x.getNgaySinh(), x.isGioiTinh(), x.getDienThoai(), x.getEmail(), x.getGhiChu(),_NhanVienService.getNhanVienById(x.getNhanVien().getMaNV()), x.getNgayDK());
    }

    @Override
    public long deleteQLNguoiHocById(String maNH) {
        return _nguoiHocRepository.delete(maNH);
    }

    @Override
    public long countAllQLNguoiHoc() {
        return _nguoiHocRepository.totalCount();
    }

    @Override
    public List<QLNguoiHoc> findByten(String ten) {

        _listNguoiHoc = new ArrayList<>();
        var nguoiHoc = _nguoiHocRepository.findByten(ten);
            return _listNguoiHoc;

    }
}
