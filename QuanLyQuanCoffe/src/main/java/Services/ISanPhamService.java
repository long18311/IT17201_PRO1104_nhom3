package Services;

import Models.SanPham;

import java.util.List;

public interface ISanPhamService {
    List<SanPham> getList();

    Boolean save(SanPham sanPham);

    Boolean delete(SanPham sanPham);

    Boolean update(SanPham sanPham);

    SanPham getById(long id);
}
