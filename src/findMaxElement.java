import java.util.Scanner;

public class findMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of arr");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Element "+(i+1)+": ");
            arr[i]=scanner.nextInt();
        }
        int max = arr[0];
        int index=0;
        for(int i=0;i<size;i++){
            if(max < arr[i]){
                max = arr[i];
                index=i+1;
            }
        }
        System.out.println("The largest value is: "+max+" at position: "+(index+1));
        scanner.close();
    }
}
