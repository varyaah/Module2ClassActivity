public class QuartsToGallons {
    public static void main(String[] args) {
        final int quartsInGallon = 4;
        int quartsNeeded = 18;
        System.out.printf("A job that needs %d quarts requires %d gallons and %d quarts", quartsNeeded, quartsNeeded / quartsInGallon, quartsNeeded % quartsInGallon);

    }
}