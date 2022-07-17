package Services;

import DomainModels.NhanVien;
import Repositories.INhanVienRepository;
import Repositories.NhanVienRepository;
import ViewModels.QLNhanVien;

import java.util.ArrayList;
import java.util.List;

public class ManageNhanVienService implements IManageNhanVienService{
    private final INhanVienRepository _iNhanVienRepository;
    private List<QLNhanVien> _lstQlNhanVien;
    IManageKhoaHocService _iManageKhoaHocService = new ManageKhoaHocService();

    public ManageNhanVienService() {
        _iNhanVienRepository = new NhanVienRepository();
        _lstQlNhanVien = new ArrayList<>();
    }

    @Override
    public List<QLNhanVien> getNhanViens() {
        _lstQlNhanVien = new ArrayList<>();
        var nhanVien = _iNhanVienRepository.findAll();
        for (NhanVien x : nhanVien) {
            _lstQlNhanVien.add(new QLNhanVien(x.getMaNV(), x.getHoTen(), x.getMatKhau(),x.isVaiTro(), _iManageKhoaHocService.getKhoaHocs(x.getKhoaHocs())));
        }
        return _lstQlNhanVien;
    }

    @Override
    public QLNhanVien getNhanVienById(String maNV) {
        var x = _iNhanVienRepository.findById(maNV);
        return new QLNhanVien(x.getMaNV(), x.getHoTen(), x.getMatKhau(),x.isVaiTro(), _iManageKhoaHocService.getKhoaHocs(x.getKhoaHocs()));
    }

    @Override
    public QLNhanVien createNewNhanVien(QLNhanVien nhanVien) {
        nhanVien.setMaNV(null);
        var x = _iNhanVienRepository.save(new NhanVien(nhanVien.getMaNV(), nhanVien.getHoTen(), nhanVien.getMatKhau(),nhanVien.isVaiTro()));
        return new QLNhanVien(x.getMaNV(), x.getHoTen(), x.getMatKhau(),x.isVaiTro());
    }

    @Override
    public QLNhanVien updateNhanVienById(QLNhanVien nhanVien) {
        var x = _iNhanVienRepository.save(new NhanVien(nhanVien.getMaNV(), nhanVien.getHoTen(), nhanVien.getMatKhau(),nhanVien.isVaiTro()));
        return new QLNhanVien(x.getMaNV(), x.getHoTen(), x.getMatKhau(),x.isVaiTro());
    }

    @Override
    public long deleteNhanVienById(String id) {
        return _iNhanVienRepository.delete(id);
    }

    @Override
    public long countAllNhanVien() {
        return _iNhanVienRepository.totalCount();
    }
}
