
public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] a) {
        int max = 0;
        for (int i = 0;i<a.length;i++)
        {
            int tong = 0;
            for (int j = 0;j<a[i].length;j++)
                tong+=a[i][j];
            if(tong>max)
                max = tong;
        }
        return max;

    }

    public static void main(String[] args) {
        int[][] a = {{2,8,7} , {7,1,3},{1,9,5}};
        System.out.println("Số tiền max: " + maximumWealth(a));
    }
}
