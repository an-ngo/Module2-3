

import java.util.Scanner;

public class diagonalArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input height=width of array: ");
        int w = scanner.nextInt();
        int [][]arr=new int[w][w];
        sumCol.inputArr2D(arr,w,w,scanner);
        int cross1=0,cross2=0;
        for(int i=0;i<w;i++){
            cross1+=arr[i][i];
        }
        for(int i=0;i<w;i++){
            cross2+=arr[i][w-1-i];
        }
        System.out.println("cross 1 = "+cross1);
        System.out.println("cross 2 = "+cross2);
    }
}
