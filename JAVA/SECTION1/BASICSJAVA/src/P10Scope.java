public class P10Scope {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        String name = "Yash";

        {
            a = 100;
            b = 200;
            System.out.println(a);
            int c = 99;
            System.out.println(c);
            name = "Suraj";
            System.out.println(name);
        }
        System.out.println(a);
        System.out.println(name);
    }
    
}
