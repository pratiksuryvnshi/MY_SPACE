/*
 *Variable Argument : when u made methods its takes multiple arguments 
 */

import java.util.Arrays;

public class P12VarArgs {
    public static void main(String[] args) {
       // fun(23,434,546,67,00);
        mix(2, 34, "PRATIK", "sam", "MONI");
    }
    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }
    static void mix(int a , int b, String ...v){
        System.out.println(a);
        System.out.println(Arrays.toString(v));

    }
    
}
