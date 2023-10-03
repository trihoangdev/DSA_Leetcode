package LyThuyet;

public class SortAlgorithm {

    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1, 2};
        //BubbleSort(a);
        //InsertionSort(a);
        SelectionSort(a);
    }

    private static void SelectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            //tìm vị trí nho nhất [i,n]
            for(int j = i+1;j<n;j++)
                if(a[j] < a[minIndex])
                    minIndex = j;
            if(minIndex!=i)
            {
                int t = a[i];
                a[i] = a[minIndex];
                a[minIndex] = t;
            }
            showArr(i,a);
        }
    }

    private static void InsertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int ai = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > ai) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = ai;
            showArr(i, a);
        }
    }

    private static void BubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            showArr(i, a);
            if (isSorted)
                break;
        }
    }

    private static void showArr(int x, int[] a) {
        System.out.print(x + ": ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
