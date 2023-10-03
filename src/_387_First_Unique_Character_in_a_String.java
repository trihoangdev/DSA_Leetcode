public class _387_First_Unique_Character_in_a_String {
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[123];

        //duyệt mảng và đếm xem kí tự thứ index xuất hiện bao nhiêu lần
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i];
            count[index]++;
        }

        //duyệt mảng và tìm xem count[index] nào =1 thì return vị trí thứ i
        for (int i = 0; i < arr.length; i++) {
            if(count[arr[i]] == 1)
                return i;
        }

        return -1;
    }
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
