package javaoop;

import java.util.Scanner;

/**
 *
 * @author VQ
 */
public class GiayDep {
    private String maGiay;
    private String tenGiayDep;
    private String hang;
    private int size;
    private double gia;
    private int soLuong;

    // Constructor không đối số
    public GiayDep() {
    }

    // Constructor có đối số
    public GiayDep(String maGiay, String tenGiayDep, String hang, int size, double gia, int soLuong) {
        this.maGiay = maGiay;
        this.tenGiayDep = tenGiayDep;
        this.hang = hang;
        this.size = size;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    // Getter và Setter
    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public String getMaGiay() {
        return maGiay;
    }

    public void setMaGiay(String maGiay) {
        this.maGiay = maGiay;
    }

    public String getTenGiayDep() {
        return tenGiayDep;
    }

    public void setTenGiayDep(String tenGiayDep) {
        this.tenGiayDep = tenGiayDep;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    // Phương thức nhập thông tin
    public void nhapTT() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã giày: ");
        this.maGiay = scanner.nextLine();
        System.out.print("Nhập tên giày dép: ");
        this.tenGiayDep = scanner.nextLine();
        System.out.print("Nhập hãng: ");
        this.hang = scanner.nextLine();
        System.out.print("Nhập size: ");
        this.size = scanner.nextInt();
        System.err.println("Nhap Số Lượng có sẵn: ");
        this.soLuong = scanner.nextInt();
        System.out.print("Nhập giá: ");
        this.gia = scanner.nextDouble();
        System.out.println("----------------------");
    }

    // Phương thức hiển thị thông tin
    public void hienTT() {
        System.out.println("Mã giày: " + this.maGiay);
        System.out.println("Tên giày dép: " + this.tenGiayDep);
        System.out.println("Hãng: " + this.hang);
        System.out.println("Size: " + this.size);
        System.out.println("Giá: " + this.gia);
    }
}


