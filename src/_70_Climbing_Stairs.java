public class _70_Climbing_Stairs {
    static int[] soBuoc = new int[46];

    public static int climbStairs(int n) {
        //bai toan co so
        soBuoc[1] = 1;
        soBuoc[2] = 2;

        //cong thuc de quy
        TinhSoBuoc(n);
        return soBuoc[n];
    }

    public static int TinhSoBuoc(int n) {
        if(soBuoc[n]==0)
            soBuoc[n] = TinhSoBuoc(n-1) + TinhSoBuoc(n-2);
        return soBuoc[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
