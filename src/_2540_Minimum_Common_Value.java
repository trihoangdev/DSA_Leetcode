public class _2540_Minimum_Common_Value {
    public static int getCommon(int[] n1, int[] n2) {
        int i1 = 0,i2 = 0;
        if(n1[n1.length-1] <n2[0]) return -1;
        while(i1<n1.length && i2<n2.length){
            int num1 = n1[i1];
            int num2 = n2[i2];
            if(num2 == num1)
                return num1;
            if(num1>num2)
                i2++;
            else
                i1++;
        }
        return -1;
    }
    public static int bSearch(int[] a,int l,int r,int x){
        if(l>r)
            return -1;
        int mid = (l+r)/2;
        if(a[mid] == x)
            return x;
        if(x>a[mid])
            return bSearch(a,mid+1,r,x);
        else
            return bSearch(a,l,mid-1,x);
    }

    public static void main(String[] args) {
        int[] n1 = {1,2,3,6};
        int[] n2 = {2,3,4,5};
        System.out.println(getCommon(n1,n2));
    }
}
