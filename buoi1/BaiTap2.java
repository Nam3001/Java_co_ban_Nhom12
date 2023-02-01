package buoi1;

import java.util.Scanner;

public class BaiTap2 {
    static long giaiThua(int n) {
        long res = n == 0 ? 0 : 1;
        if (res == 0) return 0;
        
        for (int i = n; i > 0; i--) {
            res *= i;
        }
        return res;
    }
    static long giaiThuaDeQui(int n) {
        if (n <= 1) return 1;
        
        long res = n * giaiThuaDeQui(n - 1);
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = scanner.nextInt();
        scanner.close();
        
        long giaiThua1 = giaiThua(n);
        long giaiThua2 = giaiThuaDeQui(n);
        System.out.println("n giai thua: " + giaiThua1);
        System.out.println("n giai thua(su dung de qui): " + giaiThua2);
    }
}
