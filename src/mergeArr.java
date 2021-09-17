import java.util.Scanner;

public class mergeArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st arr.length: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        for(int i=0 ;i<size1;i++){
            System.out.println("Input E"+(i+1)+": ");
            arr1[i]= scanner.nextInt();
        }
        System.out.println("Input 2nd arr.length: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        for(int i=0 ;i<size1;i++){
            System.out.println("Input E"+(i+1)+": ");
            arr2[i]= scanner.nextInt();
        }
        int[] arr3 = new int[size1+size2];
        for(int i=0;i<size1;i++){
            arr3[i]=arr1[i];
        }
        for(int i=size1;i<size1+size2;i++){
            arr3[i]=arr2[i-size1];
        }
        for(int i=0;i<arr3.length;i++){
            System.out.println("arr3["+i+"]: "+arr3[i]);
        }
        scanner.close();
    }
}
