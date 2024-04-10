import java.util.Scanner;

public class P7Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter = ");
        //String fruit = sc.nextLine();
        int day = sc.nextInt();

        // switch (fruit) {
        //     case "mango":
        //         System.out.println("Here is a Mango");
        //         break;
        //     case "apple":
        //         System.out.println("Eat apple and stay health");
        //         break;
        //     case "banana":
        //         System.out.println("Immunity Booster");
        //         break;
        
        //     default:
        //         System.out.println("Enter Fruit as mention.");
        // }
        //Emhance Switch Statment
        //----------------------------------------------
        // switch(fruit){
        //     case "mango" -> System.out.println("Im Mango");
        //     case "apple" -> System.out.println("A Sweat fruit");
        //     case "banana" -> System.out.println("Health one");
        //     default -> System.out.println("Enter Fruit only");
        // }
        //-------------------------------------------------\
        switch(day){
            case 1,2,3,4,5 -> System.out.println("This are Weekdays");
            case 6, 7 -> System.out.println("This are Weekend");

        }

    }
    
}
