import java.util.Scanner;

public class addE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of array");
        int size = scanner.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Input Element "+(i+1)+": ");
        }
        int []arr =new int[size];
        System.out.println("Input value to add");
        int value = scanner.nextInt();
        System.out.println("Input index u want to add");
        int index = scanner.nextInt();
        arr=addElement(arr, value, index);
        for(int i=0;i<arr.length;i++){
            System.out.print((i+1)+": "+arr[i]+"\t");
        }
        scanner.close();
    }
    public static int[] addElement(int[] arr,int value,int index){
        int [] arr1 = new int[arr.length+1];
        for(int i=0;i<index;i++){
            arr1[i]=arr[i];
        }
        arr1[index] = value;
        for(int i=index+1;i<arr1.length;i++){
            arr1[i] = arr[i-1];
        }
        return arr1;
    }
}
