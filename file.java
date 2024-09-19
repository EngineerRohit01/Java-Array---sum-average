import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter the Size");
        int size = input.nextInt();
        
        int[] arr = new int[size];
        
        int i = 0;
        while(i<arr.length){
            System.out.print("Enter the no " + (i+1) );
            arr[i] = input.nextInt();
            i++;
        }
        
        int sum = sum(arr);
        int average = average(arr);
        
        System.out.println("Sum is: "+sum);
        System.out.println("average is: "+average);
    }
    
    public static int sum(int[] arr){
        int sum=0;
        
        int i =0;
        while(i<arr.length){
            sum+=arr[i];
            i++;
        }
        return sum;
    }
    
    public static int average(int[] arr){
        int sum = sum(arr);
        return (sum/arr.length);
    }
}
