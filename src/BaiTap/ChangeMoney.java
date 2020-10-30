package BaiTap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        System.out.println("Nhập tiền USD");
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        int usd = scanner.nextInt();
        int vnd = rate*usd;

        System.out.println(usd + " USD bằng " + vnd + " VNĐ");
    }
}
