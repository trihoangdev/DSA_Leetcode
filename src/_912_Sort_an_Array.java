public class _912_Sort_an_Array {
    public static int[] mergeSort(int[] a, int L, int R) {
        //dk dung
        if (L == R) {
            int[] single ={a[L]};
            return single;
        }
        //THTQ
        //chia ra
        int k = (L + R) / 2;
        int[] a1 = mergeSort(a, L, k);//chia nua ben trai
        int[] a2 = mergeSort(a, k + 1, R);//chia nua ben phai

        //tron vao
        int n = a1.length + a2.length;
        int[] res = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n)
            if (i1 < a1.length && i2 < a2.length) //a1 va a2 khac rong
                if (a1[i1] < a2[i2]) {
                    res[i] = a1[i1];
                    i++;
                    i1++;
                }else{
                    res[i] = a2[i2];
                    i++;
                    i2++;
                }
            else //a1 hoac a2 rong
                if(i1<a1.length){
                    //a2 rong
                    res[i] = a1[i1];
                    i++;
                    i1++;
                }else{
                    //a1 rong
                    res[i] = a2[i2];
                    i++;
                    i2++;
                }
        return res;
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] a = {5, 1, 1, 2, 0, 0};
        sortArray(a);
    }
}
