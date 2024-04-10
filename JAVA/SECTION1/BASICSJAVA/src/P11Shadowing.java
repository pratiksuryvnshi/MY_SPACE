public class P11Shadowing {
    static int x = 200;     ///this will be shadowed at 6 line.
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40; // the class variable thatis shadowed
        System.out.println(x);
        fun();
        
    }
    static void fun(){
        System.out.println(x);
    }
    
}
