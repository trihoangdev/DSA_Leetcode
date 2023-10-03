import java.util.Scanner;

public class _13_Roman_to_Integer {
    public static int romanToInt(String s) {
        int number = 0;
        int res = 0;
        int prev = 0;
        for(int i = s.length()-1;i>=0;i--)
        {
            switch (s.charAt(i))
            {
                case 'I' -> number = 1;
                case 'V' -> number = 5;
                case 'X' -> number = 10;
                case 'L' -> number = 50;
                case 'C' -> number = 100;
                case 'D' -> number = 500;
                case 'M' -> number = 1000;
            }
            if(number < prev)
                res-=number;
            else
                res+=number;
            prev = number;
        }
        return res;
    }

    public static void main(String[] args) {
        String s;
        System.out.print("Nhap chuoi: ");
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        System.out.println("Chuoi sau khi chuyen thanh so: " + romanToInt(s));

    }
}
