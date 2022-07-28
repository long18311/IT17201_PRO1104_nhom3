/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.KhachHang;
import Repositories.KhachHangReposittory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanlo
 */
public class KhachHangService implements IKhachHangService {
    private List<KhachHang> khachHangs = new ArrayList<KhachHang>();
    public KhachHangReposittory khachHangReposittory = new KhachHangReposittory();
    public KhachHangService() {
        khachHangs = new ArrayList<KhachHang>();
        khachHangReposittory = new KhachHangReposittory();
    }
    @Override
    public List<KhachHang> getList() {
        return khachHangReposittory.getList();
    }

    @Override
    public Boolean save(KhachHang khachHang) {
        return khachHangReposittory.save(khachHang);
    }

    @Override
    public Boolean delete(KhachHang khachHang) {
        return khachHangReposittory.delete(khachHang);
    }

    @Override
    public Boolean update(KhachHang khachHang) {
        return khachHangReposittory.update(khachHang);
    }

    @Override
    public KhachHang getById(long id) {
        return khachHangReposittory.getbyID(id);
    }
    
}
