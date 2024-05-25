import java.util.*;
public class SolidRectangle {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        for (int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("HOLLOW RECTANGLE");
        for (int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if (i==1 ||i==row ||j==1 ||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("HALF PYRAMID");
        for (int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
               System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(" INVERED HALF PYRAMID");
        for (int i=1;i<=row;i++){
            for(int j=1;j<=row-i+1;j++){
               System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(" INVERED HALF PYRAMID rotated by 180 degree");
        for (int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
               if(j>row-i){
                System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
    
}
