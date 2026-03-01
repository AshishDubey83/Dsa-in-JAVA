import java.util.Scanner;
public class NegativeElement {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int n=sc.nextInt();  
        int []arr= new int [n];// Array of the size n
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The negative elements are : ");
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }   
        }

    }
    
}
