import java.lang.reflect.Array;
import java.util.Arrays;
//WAP check weather given target is present in given String
public class SearchInString {
    public static void main(String[] args) {
        String name = "Pratik";
        char tar = 't';

//        System.out.println(search(name,tar));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search2(name,tar));
        // showing String to char......

    }
    static boolean search2(String str,char tr){
        if(str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()) {// foreach loop example
            if(ch == tr) {
                return true;
            }
        }
        return false;
    }
    static boolean search(String str,char tr){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(tr == str.charAt(i)){
                return true;
            }

        }
        return false;
    }
}
