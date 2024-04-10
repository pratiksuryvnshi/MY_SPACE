public class FindMIn {
    public static void main(String[] args) {
        int[] arr = {11, 32, 34, 4, 56, 54,2};

        System.out.println(min(arr));

    }
    static int min(int[] str) {
        int ans = str[0];
        for (int i = 0; i < str.length; i++) {
            if (str[i] < ans) {
                ans = str[i];
            }

        }
        return ans;

    }

}
