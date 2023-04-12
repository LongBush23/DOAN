package javaoop;

/**
 *
 * @author VQ
 */
import java.util.Scanner;

public class Main {
    private static ThucHienChucNang thcn = new ThucHienChucNang();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Nhập danh sách giày dép");
            System.out.println("2. Hiển thị danh sách giày dép");
            System.out.println("3. Cập nhật thông tin giày dép");
            System.out.println("4. Tra cứu giày dép");
            System.out.println("5. Tạo đơn hàng");
            System.out.println("6. Nhập thông tin người dùng");
            System.out.println("7. Thoát");
            System.out.println("Nhập lựa chọn của bạn:");

            choice = sc.nextInt();
            sc.nextLine(); // Consume leftover newline character

            switch (choice) {
                case 1:
                    thcn.nhapDanhSachGiayDep();
                    break;
                case 2:
                    thcn.hienThiDanhSachGiayDep();
                    break;
                case 3:
                    thcn.capNhapGiayDep();
                    break;
                case 4:
                    thcn.traCuuGiayDep();
                    break;
                case 5:
                    thcn.taoDonHang();
                    break;
                case 6:
                    thcn.nhapTTUser();
                    break;
                case 7:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

            System.out.println();
        } while (choice != 7);
    }
}
