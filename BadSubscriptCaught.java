import java.util.Arrays;
import java.util.Scanner;
public class BadSubscriptCaught {
    public static void main(String[] args) {
        String[] firstNam = new String[10];
        Scanner myObj = new Scanner(System.in);

        for (int x = 0; x < firstNam.length; x++) {
            System.out.println("What name would you like to input for place " +x);
            String num = myObj.next();
            firstNam[x] = num;
            System.out.println("these are your names so far " + Arrays.toString(firstNam));
        }
        try{
            System.out.println("Chose a number correlated to your name");
            int numbNam = myObj.nextInt();
            System.out.println(firstNam[numbNam]);
        }
        catch (Exception e) {
            System.out.println("You have exceeded the parameters of the array");
        }
    }
}