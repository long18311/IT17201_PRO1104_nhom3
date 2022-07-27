package Services;

import Models.KhachHang;

import java.util.List;

public interface IKhachHangService {
    List<KhachHang> getList();

    Boolean save(KhachHang khachHang);

    Boolean delete(KhachHang khachHang);

    Boolean update(KhachHang khachHang);

    KhachHang getById(long id);
        }
