import java.util.Scanner;

public class countE {
    public static void main(String[] args) {
        String str = "aaabcddeeghiklmnouupqrsy";
        char c;
        Scanner scanner = new Scanner(System.in);
        c = scanner.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(c==str.charAt(i)){
                count++;
            }
        }
        System.out.println("There is "+count);
        scanner.close();
    }
}
