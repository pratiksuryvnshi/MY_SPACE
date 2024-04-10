import java.util.ArrayList;
import java.util.Scanner;

public class P19ARRLIST {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5); // initializing ArrayList.

        // list.add(12);
        // list.add(23);
        // list.add(34);
        // list.add(343);
        // list.add(231);
        // list.add(23421);
        // list.add(654);

        // System.out.println(list);
        // System.out.println(list.contains(343));
        // System.out.println(list.contains(341));
        // System.out.println("-----------REPLACED---------------");
    
        // list.set(0, 432);
        // System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
            
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here, list[index] sysntax will not work here......
            
        }
        System.out.println(list);



    }
}
