package buoi1;

import java.util.Scanner;
import java.lang.Math;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        
        scanner.close();
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            double x = -b / (2*a);
            System.out.println("Phương trình có nghiệm x = : " + x);
        } else {
            double x1 = (double)(-b + Math.sqrt(delta)) / (2*a);
            double x2 = (double)(-b - Math.sqrt(delta)) / (2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
