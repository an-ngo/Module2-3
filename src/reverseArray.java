import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int size;
        int [] array;
        do{
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("size is exceed 20");
            }
        }
        
        while(size>20);
        array = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter element"+(i+1)+": ");
            array[i] = scanner.nextInt();
        }
        System.out.printf("%-20s%s","Elements in array");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+"\t");
        }
        for(int i=0;i<size/2;i++){
            int t = array[i];
            array[i] = array[size-i-1];
            array[size-i-1] = t;
        }
        System.out.printf("\n%-20s%s","Reserse array: ");
        
        for(int i=0;i<size;i++){
            System.out.print(array[i]+"\t");
        }
        scanner.close();
    }
}
