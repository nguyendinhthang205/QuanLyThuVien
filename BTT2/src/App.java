import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- NHAP THONG TIN SACH ---");
        System.out.print("Nhap ma sach: ");
        String maSach = scanner.nextLine();
        
        System.out.print("Nhap ten sach: ");
        String tenSach = scanner.nextLine();
        
        System.out.print("Nhap tac gia: ");
        String tacGia = scanner.nextLine();
        
        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = scanner.nextInt();
        
        System.out.print("Nhap don gia: ");
        double donGia = scanner.nextDouble();
        
        System.out.print("Nhap so luong: ");
        int soLuong = scanner.nextInt();

        double thanhTien = donGia * soLuong;
        double phiVanChuyen = 0.05 * thanhTien; 
        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n--- THONG TIN SACH VUA NHAP ---");
        System.out.println("Ma sach: " + maSach + " | Ten sach: " + tenSach);
        System.out.println("Thanh tien: " + thanhTien);
        System.out.println("Tong tien nhap: " + tongTienNhap);
        
        scanner.close();
    }
}