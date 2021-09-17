import java.util.Scanner;

public class deleteE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of arr");
        int size = scanner.nextInt();
        int [] arr = new int[size];
        for(int i = 0 ; i < size; i++){
            System.out.println("Element "+(i+1)+": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Input int need be delete: ");
        int x = scanner.nextInt();
        for(int i=0;i<size;i++){
            if(x==arr[i]){
                for(int j=i;j<size-1;j++){
                    arr[i]=arr[j];
                }
                arr[size-1]=0;
                break;
            }
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        scanner.close();
    }
}
