import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        final int quartsInGallon = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quarts:");
        int quartsNeeded = Integer.parseInt(scanner.nextLine());
        System.out.printf("A job that needs %d quarts requires %d gallons and %d quarts", quartsNeeded, quartsNeeded / quartsInGallon, quartsNeeded % quartsInGallon);
    }
    
}
