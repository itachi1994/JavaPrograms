package coding.challenge;

public class Main {
    public static void main(String[] args) {
        //called all challenges one by one
        SpeedConverter.printConversion(95.75);
        MegaBytesConverter.printMegaBytesAndKiloBytes(14000);
        System.out.println("Barking Dog::::::" + BarkingDog.shouldWakeUp(true, 7));
        System.out.println("Is 1999 a leap year? " + LeapYear.isLeapYear(1999));
        System.out.println("Are two decimal numbers (6.75332 & 6.75312) equal to three decimal points? " + DecimalComparator.areEqualByThreeDecimalPlaces(3.176, 3.175));
        System.out.println("has teen? "+ TeenNumberCheck.hasTeen(78,39,17));
        System.out.println("Area of circle " + AreaCalculator.area(7) );
        System.out.println("Area of rectangle " + AreaCalculator.area(45, 50) );
        MinutesToYearsDays.printYearsAndDays(1051200);
        EqualityPrinter.printEqual(1,1,1);
        System.out.println("Is cat playing? " + PlayingCat.isCatPlaying(true, 41));
    }
}
