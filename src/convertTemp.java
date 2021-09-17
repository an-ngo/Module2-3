import java.util.Scanner;

public class convertTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        double temp;
        double convertTemp=0;
        while(inputNum!=3){
            System.out.println("Input number: ");   
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("3. Exit");
            inputNum = scanner.nextInt();
            if(inputNum==1){
                System.out.println("Input temperature:");
                temp = scanner.nextInt();
                convertTemp = (temp - 32)*5/9;
                System.out.println("convert temperature = "+convertTemp);
            }
            if(inputNum==2){
                System.out.println("Input temperature:");
                temp = scanner.nextInt();
                convertTemp = temp*9/5-32;

            }
            System.out.println("convert temperature = "+convertTemp);
        }
        scanner.close();
    }
}
