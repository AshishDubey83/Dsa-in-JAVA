import java.util.Scanner;

public class LinearSearch {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target to found: ");
        int tar=sc.nextInt();// Taking the target from the user
        for(int i=0;i<n;i++){
            if(arr[i]==tar){
                System.out.println("The element is at index: "+ i);
            }
            
        }

       }
}
