package javaoop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VQ
 */
public class DonHang {
    private String maDonHang;
    private ArrayList<GiayDep> danhSachSanPham;
    private double giaTriDonHang;
    private String diaChiGiaoHang;
    
    public DonHang() {}
    
    public DonHang(String maDonHang, ArrayList<GiayDep> danhSachSanPham, double giaTriDonHang, String diaChiGiaoHang) {
        this.maDonHang = maDonHang;
        this.danhSachSanPham = danhSachSanPham;
        this.giaTriDonHang = giaTriDonHang;
        this.diaChiGiaoHang = diaChiGiaoHang;
    }
    
    public String getMaDonHang() {
        return maDonHang;
    }
    
    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }
    
    public ArrayList<GiayDep> getDanhSachSanPham() {
        return danhSachSanPham;
    }
    
    public void setDanhSachSanPham(ArrayList<GiayDep> danhSachSanPham) {
        this.danhSachSanPham = danhSachSanPham;
    }
    
    public double getGiaTriDonHang() {
        return giaTriDonHang;
    }
    
    public void setGiaTriDonHang(double giaTriDonHang) {
        this.giaTriDonHang = giaTriDonHang;
    }
    
    public String getDiaChiGiaoHang() {
        return diaChiGiaoHang;
    }
    
    public void setDiaChiGiaoHang(String diaChiGiaoHang) {
        this.diaChiGiaoHang = diaChiGiaoHang;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã đơn hàng: ");
        this.maDonHang = sc.nextLine();
        
        System.out.println("Nhập địa chỉ giao hàng: ");
        this.diaChiGiaoHang = sc.nextLine();
        
        System.out.println("Nhập số lượng sản phẩm: ");
        int soLuong = sc.nextInt();
        sc.nextLine(); // đọc bỏ dòng "\n" sau khi nhập số lượng
        
        this.danhSachSanPham = new ArrayList<GiayDep>();
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i+1) + ":");
            GiayDep sp = new GiayDep();
            sp.nhapTT();
            this.danhSachSanPham.add(sp);
            this.giaTriDonHang += sp.getGia(); // cập nhật giá trị đơn hàng
        }
    }
    
    public void hien() {
        System.out.println("Mã đơn hàng: " + this.maDonHang);
        System.out.println("Danh sách sản phẩm:");
        for (int i = 0; i < this.danhSachSanPham.size(); i++) {
            System.out.println("Sản phẩm thứ " + (i+1) + ":");
            this.danhSachSanPham.get(i).hienTT();
        }
        System.out.println("Giá trị đơn hàng: " + this.giaTriDonHang);
        System.out.println("Địa chỉ giao hàng: " + this.diaChiGiaoHang);
    }

}
