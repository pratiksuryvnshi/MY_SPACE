public class P12Overloading {
    public static void main(String[] args) {
        fun(23,32,20);
    }
    //Method Overloading.........
    static void fun(int a, int b){
        int x = a + b;
        System.out.println(x);

    }
    static void fun(int a, int b, int c){
        int x = a + b - c;
        System.out.println(x);
        
    }
    
}
