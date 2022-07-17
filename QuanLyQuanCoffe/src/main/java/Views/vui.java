package Views;

import Services.IManageKhoaHocService;
import Services.ManageKhoaHocService;
import ViewModels.QLKhoaHoc;

import java.util.List;

public class vui {
    static IManageKhoaHocService khoaHocService = new ManageKhoaHocService();
    public static void main(String[] args) {
        List<QLKhoaHoc> khoaHocs = khoaHocService.getKhoaHocs();
        System.out.println("vui");
        for (QLKhoaHoc kh : khoaHocs) {
            System.out.println(kh.getMaKH());
        }
    }
}
