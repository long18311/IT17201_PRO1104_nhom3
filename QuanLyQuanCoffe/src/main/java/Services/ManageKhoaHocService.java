package Services;

import DomainModels.KhoaHoc;
import Repositories.*;
import ViewModels.QLKhoaHoc;

import java.util.ArrayList;
import java.util.List;

public class ManageKhoaHocService implements IManageKhoaHocService {
    private final IKhoaHocRepository _iKhoaHocRepository;
    private List<QLKhoaHoc> _listKhoaHoc;
    IManageChuyenDeService _chuyenDeService = new ManageChuyenDeService();
    IChuyenDeRepository chuyenDeRepository = new ChuyenDeRepository();
    IManageNhanVienService _NhanVienService = new ManageNhanVienService();
    INhanVienRepository _nhanVienRepository = new NhanVienRepository();
    IManageHocVienService _hocVienService = new ManageHocVienService();

    public ManageKhoaHocService() {
        _iKhoaHocRepository = new KhoaHocRepository();
        _listKhoaHoc =new ArrayList<>();
    }

    @Override
    public List<QLKhoaHoc> getKhoaHocs() {
        _listKhoaHoc = new ArrayList<>();
        var khoaHoc = _iKhoaHocRepository.findAll();
        for (var x : khoaHoc) {
            _listKhoaHoc.add(new QLKhoaHoc(x.getMaKH(),_chuyenDeService.getQLChuyenDeById(x.getChuyenDe().getMaCD()),x.getHocPhi(),x.getThoiLuong(),x.getNgayKG(),x.getGhiChu(),_NhanVienService.getNhanVienById(x.getNhanVien().getMaNV()),x.getNgayTao(),_hocVienService.getHocViens(x.getHocViens())));
        }
        return _listKhoaHoc;
    }

    @Override
    public List<QLKhoaHoc> getKhoaHocs(List<KhoaHoc> lstKH) {
        _listKhoaHoc = new ArrayList<>();
        for (var x : lstKH) {
            _listKhoaHoc.add(new QLKhoaHoc(x.getMaKH(),_chuyenDeService.getQLChuyenDeById(x.getChuyenDe().getMaCD()),x.getHocPhi(),x.getThoiLuong(),x.getNgayKG(),x.getGhiChu(),_NhanVienService.getNhanVienById(x.getNhanVien().getMaNV()),x.getNgayTao(),_hocVienService.getHocViens(x.getHocViens())));
        }
        return _listKhoaHoc;
    }

    @Override
    public QLKhoaHoc getKhoaHocById(long id) {
        var x = _iKhoaHocRepository.findById((int)id);
        return new QLKhoaHoc(x.getMaKH(),_chuyenDeService.getQLChuyenDeById(x.getChuyenDe().getMaCD()),x.getHocPhi(),x.getThoiLuong(),x.getNgayKG(),x.getGhiChu(),_NhanVienService.getNhanVienById(x.getNhanVien().getMaNV()),x.getNgayTao(),_hocVienService.getHocViens(x.getHocViens()));
    }

    @Override
    public QLKhoaHoc createNewKhoaHoc(QLKhoaHoc khoaHoc) {
        var x = _iKhoaHocRepository.save(new KhoaHoc(khoaHoc.getMaKH(),chuyenDeRepository.findById(khoaHoc.getChuyenDe().getMaCD()),khoaHoc.getHocPhi(),khoaHoc.getThoiLuong(),khoaHoc.getNgayKG(),khoaHoc.getGhiChu(),_nhanVienRepository.findById(khoaHoc.getNV().getMaNV()),khoaHoc.getNgayTao()));
        return new QLKhoaHoc(x.getMaKH(),_chuyenDeService.getQLChuyenDeById(x.getChuyenDe().getMaCD()),x.getHocPhi(),x.getThoiLuong(),x.getNgayKG(),x.getGhiChu(),_NhanVienService.getNhanVienById(x.getNhanVien().getMaNV()),x.getNgayTao());
    }

    @Override
    public QLKhoaHoc updateKhoaHocById(QLKhoaHoc khoaHoc) {
        var x = _iKhoaHocRepository.save(new KhoaHoc(khoaHoc.getMaKH(),chuyenDeRepository.findById(khoaHoc.getChuyenDe().getMaCD()),khoaHoc.getHocPhi(),khoaHoc.getThoiLuong(),khoaHoc.getNgayKG(),khoaHoc.getGhiChu(),_nhanVienRepository.findById(khoaHoc.getNV().getMaNV()),khoaHoc.getNgayTao()));
        return new QLKhoaHoc(x.getMaKH(),_chuyenDeService.getQLChuyenDeById(x.getChuyenDe().getMaCD()),x.getHocPhi(),x.getThoiLuong(),x.getNgayKG(),x.getGhiChu(),_NhanVienService.getNhanVienById(x.getNhanVien().getMaNV()),x.getNgayTao());
    }

    @Override
    public long deleteKhoaHocById(long id) {
        return _iKhoaHocRepository.delete((int)id);
    }

    @Override
    public long countAllKhoaHoc() {
        return _iKhoaHocRepository.totalCount();
    }
}
