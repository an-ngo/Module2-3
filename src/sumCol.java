import java.util.Scanner;

public class sumCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Width and Length of arr");
        int w = sc.nextInt();
        int h = sc.nextInt();
        int [][]arr=new int[w][h];
        inputArr2D(arr,w,h,sc);
        System.out.println("What column u want to count sum");
        int row = sc.nextInt();
        int sum=0;
        for(int i=0;i<w;i++){
            sum+=arr[i][row];
        }
        System.out.println("Sum of column "+row+" is: "+sum);
        sc.close();
    }
    public static void inputArr2D(int [][]arr,int w,int h,Scanner sc){
        for(int i=0;i<w;i++){
            for(int j=0;j<h;j++){
                System.out.println("Input arr["+i+"]["+j+"]: ");
                arr[i][j] = sc.nextInt();
            }
        }

    }
}
