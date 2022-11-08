import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter the height: ");
        double altura = scanner.nextDouble();

        System.out.println("Enter the name: ");
        String name = scanner.next();

        System.out.println("Enter the lastname:");
        String lastname = scanner.next();

        System.out.println("Enter the age:");
        String age = scanner.next();

    }
}
