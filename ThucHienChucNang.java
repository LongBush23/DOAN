package javaoop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author VQ
 */
public class ThucHienChucNang {
        
	ArrayList<GiayDep> listShoe = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void nhapDanhSachGiayDep() {
		System.out.println("Nhap so luong Giay Dep: ");
		int n = sc.nextInt();
		
		for(int i = 0; i< n; i++) {
			GiayDep shoe = new GiayDep();
			shoe.nhapTT();
			listShoe.add(shoe);
		}
	}
	
	
	public void hienThiDanhSachGiayDep() {
		for(GiayDep shoe : listShoe) {
			shoe.hienTT();
			System.out.println("\n");
		}
	}
	
	public void capNhapGiayDep() {
		System.out.println("Nhap ma san pham can cap nhap thong tin: ");
		String ma = sc.nextLine();
		GiayDep shoeFound = null;
		for(GiayDep shoe : listShoe) {
			
			if(shoe.getMaGiay().equalsIgnoreCase(ma)) {
				shoeFound = shoe;
				break;
			}
		}
		if(shoeFound != null) {
			shoeFound.nhapTT();
		}else {
			System.out.println("Khong tim thay san pham ");
	
		}
	}
	public void traCuuGiayDep() {
		sc.nextLine();
		System.out.println("Nhap ma san pham can tim :  ");
		String ma = sc.nextLine();
		boolean flag = false; // khong tim thay san pham
		
		for(GiayDep shoe : listShoe) {
			if(shoe.getMaGiay().equalsIgnoreCase(ma)) {
				shoe.hienTT();
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("khong tim thay san pham !!!");
		}
	}
	
	public void XoaGiayDep() {
		sc.nextLine();
		System.out.println("Nhap ma san pham can xoa: ");
		String ma = sc.nextLine();
		
		GiayDep shoeFound = null;
		
		for(GiayDep shoe : listShoe) {
			if(shoe.getMaGiay().equalsIgnoreCase(ma)){
				shoeFound = shoe;
				break;
			}
		}
		
		if(shoeFound != null ) {
			listShoe.remove(shoeFound);
		}else {
			System.out.println("Khong tim thay san phgam can cap nhap");
		}
	}
	
	public void SapXepTheoGiaGiamDan() {
		Collections.sort(listShoe, (shoe1, shoe2 ) -> (int) (shoe1.getGia()- shoe2.getGia()));
	}
	
	public void SapXepTheoGiaTangDan() {
	    Collections.sort(listShoe, (shoe1, shoe2 ) -> (int) (shoe2.getGia()- shoe1.getGia()));
	}
public void taoDonHang() {
    Scanner sc = new Scanner(System.in);

    if (listShoe.isEmpty()) {
        System.out.println("Không thể tạo đơn hàng vì danh sách giày dép đang trống!");
        return;
    }

    System.out.println("Tạo đơn hàng mới:");

    // Hiển thị danh sách giày dép cho người dùng chọn
    System.out.println("Danh sách giày dép:");
    for (GiayDep gd : listShoe) {
        System.out.println(gd.getMaGiay()+ "\t" + gd.getTenGiayDep() + "\t" + gd.getGia());
    }

    // Nhập thông tin đơn hàng
    System.out.println("Nhập mã giày dép:");
    String maGD = sc.nextLine();

    boolean timThay = false;
    GiayDep gd = null;
    for (GiayDep giayDep : listShoe) {
        if (giayDep.getMaGiay().equals(maGD)) {
            timThay = true;
            gd = giayDep;
            break;
        }
    }

    if (!timThay) {
        System.out.println("Không tìm thấy giày dép có mã " + maGD + " trong danh sách!");
        return;
    }

    System.out.println("Nhập số lượng giày cần đặt:");
    int soLuong = sc.nextInt();
    sc.nextLine(); // Consume leftover newline character

    if (soLuong > gd.getSoLuong()) {
        System.out.println("Số lượng giày cần đặt vượt quá số lượng giày có sẵn trong kho!");
        return;
    }

    double thanhTien = soLuong * gd.getGia();
    System.out.println("Đơn hàng mới:");
    System.out.println("Mã giày dép: " + gd.getMaGiay());
    System.out.println("Tên giày dép: " + gd.getTenGiayDep());
    System.out.println("Số lượng giày: " + soLuong);
    System.out.println("Thành tiền: " + thanhTien);
}

public void nhapTTUser() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Nhập thông tin người dùng:");

    System.out.println("Họ và tên:");
    String hoTen = sc.nextLine();

    System.out.println("Địa chỉ:");
    String diaChi = sc.nextLine();

    System.out.println("Số điện thoại:");
    String soDienThoai = sc.nextLine();

    System.out.println("Thông tin người dùng:");
    System.out.println("Họ và tên: " + hoTen);
    System.out.println("Địa chỉ: " + diaChi);
    System.out.println("Số điện thoại: " + soDienThoai);
}
}


