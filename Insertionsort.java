
import java.util.*;

public class Insertionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new  int[5];
        
        for (int i=0;i< arr.length ;i++){
            arr[i]=sc.nextInt();

        }
        for (int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=current;
        }
        
        for (int i=0;i< arr.length ;i++){
            System.out.println(arr[i]);

        }

    }
    
}
