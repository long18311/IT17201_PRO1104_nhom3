/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Models.NhanVien;
import Repositories.NhanVienRepository;

/**
 *
 * @author vanlo
 */
public class Auth {
    static NhanVien user;

    public static NhanVien getUser() {
        return user;
    }

    public static void setUser(NhanVien user) {
        Auth.user = user;
    }
    public static void clean(){
    user = null;
    }
    public static boolean isLogin(){
    return user != null;
    }
    public static boolean isManager(){
        if(isLogin()){
            return user.isChucVu();
        }
    return false;
    }
}
