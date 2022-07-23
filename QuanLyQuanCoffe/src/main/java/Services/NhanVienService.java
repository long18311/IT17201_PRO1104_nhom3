package Services;

import Models.NhanVien;
import Repositories.NhanVienRepository;

import java.util.List;

public class NhanVienService implements INhanVienService{
    private List<NhanVien> nhanViens;
    private NhanVienRepository nhanVienRepository;
    @Override
    public List<NhanVien> getList() {
        return nhanVienRepository.getList();
    }

    @Override
    public Boolean save(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    @Override
    public Boolean delete(NhanVien nhanVien) {
        return nhanVienRepository.delete(nhanVien);
    }

    @Override
    public Boolean update(NhanVien nhanVien) {
        return nhanVienRepository.update(nhanVien);
    }

    @Override
    public NhanVien getById(long id) {
        return nhanVienRepository.getById(id);
    }
}
