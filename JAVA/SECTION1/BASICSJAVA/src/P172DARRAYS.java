import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class P172DARRAYS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int[][] val = new int[2][2];
        //2D Arrays are writen as 
        // int[][] val= {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9},
        // };

        //input
        for (int i = 0; i < val.length; i++) {// row
            for (int j = 0; j < val.length; j++) {// colcumn

                val[i][j] = sc.nextInt();
                
            }         

            
        }
        //output
        // for (int i = 0; i < val.length; i++) {// row
        //     for (int j = 0; j < val.length; j++) {// colcumn

        //         System.out.print(val[i][j]+" ");
                
        //     }
        //     System.out.println();        
        //---------------------OR---------------------------
            
        // }
        // for (int i = 0; i < val.length; i++) {
        //     System.out.println(Arrays.toString(val[i]));
    
        // }  
        //-----------------ENHANCE FOR LOOP---------------------
        for (int[] a : val) {
            System.out.println(Arrays.toString(a));
        }
    

    }  
}
