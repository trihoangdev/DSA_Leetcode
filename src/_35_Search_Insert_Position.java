public class _35_Search_Insert_Position {
    public static int searchInsert(int[] a, int target) {
        int L = 0;
        int R = a.length-1;
        while(L<=R)
        {
            int M = (R-L)/2+L;
            if(a[M] == target)
                return M;
            else if(a[M]>target)
                R = M-1;
            else
                L = M+1;
        }
        return R+1;
    }

    public static void main(String[] args) {
        int[] a ={1,3,5,6};
        System.out.println(searchInsert(a,7));
    }
}
