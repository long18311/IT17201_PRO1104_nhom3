package Services;

import Models.SanPham;
import Repositories.SanPhanRepository;

import java.util.List;

public class SanPhamService implements ISanPhamService{
    private SanPhanRepository sanphamRepository = new SanPhanRepository();
    @Override
    public List<SanPham> getList() {
        return sanphamRepository.getList();
    }

    @Override
    public Boolean save(SanPham sanPham) {
        return sanphamRepository.save(sanPham);
    }

    @Override
    public Boolean delete(SanPham sanPham) {
        return sanphamRepository.delete(sanPham);
    }

    @Override
    public Boolean update(SanPham sanPham) {
        return sanphamRepository.update(sanPham);
    }

    @Override
    public SanPham getById(long id) {
        return sanphamRepository.getbyID(id);
    }
}
