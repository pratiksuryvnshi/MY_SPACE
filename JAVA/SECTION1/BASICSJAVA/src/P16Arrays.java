import java.util.Arrays;
// Arrays are mutible in nuture.

public class P16Arrays {
    public static void main(String[] args) {
        int[] arrr = {2, 43, 45, 44, 23};
        System.out.println(Arrays.toString(arrr));
        changes(arrr);
        System.out.println(Arrays.toString(arrr));
    }
    static void changes(int[] arr){

        arr[0] = 12;

    }
}
