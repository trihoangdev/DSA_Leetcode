package Lap_Trinh_Thi_Dau.Bai1;

import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        // Nhập vào n và in ra số bit của nó
        var sc = new Scanner(System.in);
       // System.out.print("Nhập n: ");
        // int n = sc.nextInt();
        inRaSoBit(3);
    }

    private static void inRaSoBit(int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    if (check(i, j, k))
                        System.out.print(i + j + k + "\n");
    }

    private static boolean check(int i, int j, int k) {
        return (i == j && i == k && j == k);
    }
}