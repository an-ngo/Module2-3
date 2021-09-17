import java.util.Scanner;

public class findElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Cam", "Sienna", "Tanya", "Con", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter a student's name: ");
        String input_name = scanner.nextLine();
        boolean isExit = false;
        for (int i=0;i<students.length;i++) {
            if(students[i]==input_name){
                isExit=true;
                System.out.println("Position of "+input_name+" is: "+i);
                break;
            }
        }
        if(!isExit){
            System.out.println("Not found "+input_name+" in the list.");
        }
        scanner.close();
    }
}
