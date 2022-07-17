package Services;

import DomainModels.ChuyenDe;
import Repositories.ChuyenDeRepository;
import Repositories.IChuyenDeRepository;
import ViewModels.QLChuyenDe;

import java.util.ArrayList;
import java.util.List;

public class ManageChuyenDeService implements IManageChuyenDeService{
    private final IChuyenDeRepository _iChuyenDerepository;
    private final IManageKhoaHocService _khoaHocService = new ManageKhoaHocService();
    private List<QLChuyenDe> _lstQlChuyenDe;

    public ManageChuyenDeService() {
        _iChuyenDerepository = new ChuyenDeRepository();
        _lstQlChuyenDe = new ArrayList<>();
    }


    @Override
    public List<QLChuyenDe> getChuyenDes() {
        _lstQlChuyenDe = new ArrayList<>();
        var chuyenDe = _iChuyenDerepository.findAll();
        for (ChuyenDe x : chuyenDe) {
            _lstQlChuyenDe.add(new QLChuyenDe(x.getMaCD(), x.getTenCD(), x.getHocPhi(), x.getThoiLuong(), x.getHinh(), x.getMoTa(),_khoaHocService.getKhoaHocs(x.getKhoahocs())));
        }
        return _lstQlChuyenDe;
    }

    @Override
    public QLChuyenDe getQLChuyenDeById(String maCD) {
        var x = _iChuyenDerepository.findById(maCD);
        return new QLChuyenDe(x.getMaCD(), x.getTenCD(), x.getHocPhi(), x.getThoiLuong(), x.getHinh(), x.getMoTa(),_khoaHocService.getKhoaHocs(x.getKhoahocs()));
    }

    @Override
    public QLChuyenDe createNewQLChuyenDe(QLChuyenDe chuyenDe) {
        chuyenDe.setMaCD(null);
        var x = _iChuyenDerepository.save(new ChuyenDe(chuyenDe.getMaCD(), chuyenDe.getTenCD(), chuyenDe.getHocPhi(), chuyenDe.getThoiLuong(), chuyenDe.getHinh(), chuyenDe.getMoTa()));
        return new QLChuyenDe(x.getMaCD(), x.getTenCD(), x.getHocPhi(), x.getThoiLuong(), x.getHinh(), x.getMoTa());
    }

    @Override
    public QLChuyenDe updateQLChuyenDeById(QLChuyenDe chuyenDe) {
        var y = _iChuyenDerepository.save(new ChuyenDe(chuyenDe.getMaCD(), chuyenDe.getTenCD(), chuyenDe.getHocPhi(), chuyenDe.getThoiLuong(), chuyenDe.getHinh(), chuyenDe.getMoTa()));
        return new QLChuyenDe(y.getMaCD(), y.getTenCD(), y.getHocPhi(), y.getThoiLuong(), y.getHinh(), y.getMoTa());
    }

    @Override
    public long deleteQLChuyenDeById(String maCD) {
        return _iChuyenDerepository.delete(maCD);
    }

    @Override
    public long countAllQLChuyenDe() {
        return _iChuyenDerepository.totalCount();
    }
}
