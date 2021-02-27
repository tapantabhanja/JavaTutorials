public class Main {
    public static void main(String[] args) {
        SpeedConverter.printConversion(1.5);
        System.out.println("---------------------------");
        SpeedConverter.printConversion(10.25);
        System.out.println("---------------------------");
        SpeedConverter.printConversion(-5.6);
        System.out.println("---------------------------");
        SpeedConverter.printConversion(25.42);
        System.out.println("---------------------------");
        SpeedConverter.printConversion(75.114);
        System.out.println("---------------------------");

        System.out.println("**********************************************");

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        System.out.println("---------------------------");
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        System.out.println("---------------------------");
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        System.out.println("---------------------------");

        System.out.println("**********************************************");

        boolean val1 = BarkingDog.shouldWakeUp(true, 1);
        System.out.println("Should Wake Up: "+val1);
        System.out.println("---------------------------");
        boolean val2 = BarkingDog.shouldWakeUp(false, 2);
        System.out.println("Should Wake Up: "+val2);
        System.out.println("---------------------------");
        boolean val3 = BarkingDog.shouldWakeUp(true, 8);
        System.out.println("Should Wake Up: "+val3);
        System.out.println("---------------------------");
        boolean val4 = BarkingDog.shouldWakeUp(true, -1);
        System.out.println("Should Wake Up: "+val4);
        System.out.println("---------------------------");

        System.out.println("**********************************************");

        boolean val5 = LeapYear.isLeapYear(-1600);
        System.out.println("Is it LeapYear? "+val5);
        System.out.println("---------------------------");
        boolean val6 = LeapYear.isLeapYear(1600);
        System.out.println("Is it LeapYear? "+val6);
        System.out.println("---------------------------");
        boolean val7 = LeapYear.isLeapYear(2017);
        System.out.println("Is it LeapYear? "+val7);
        System.out.println("---------------------------");
        boolean val8 = LeapYear.isLeapYear(2000);
        System.out.println("Is it LeapYear? "+val8);
        System.out.println("---------------------------");

        System.out.println("**********************************************");

        boolean val9 = EqualSumChecker.hasEqualSum(1, 1, 1);
        System.out.println("The result is: "+val9);
        System.out.println("---------------------------");
        boolean val10 = EqualSumChecker.hasEqualSum(1, 1, 2);
        System.out.println("The result is: "+val10);
        System.out.println("---------------------------");
        boolean val11 = EqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println("The result is: "+val11);
        System.out.println("---------------------------");

        System.out.println("**********************************************");

        boolean val12 = TeenNumberChecker.hasTeen(9, 99, 19);
        System.out.println("The result is: "+val12);
        System.out.println("---------------------------");
        boolean val13 = TeenNumberChecker.hasTeen(23, 15, 42);
        System.out.println("The result is: "+val13);
        System.out.println("---------------------------");
        boolean val14 = TeenNumberChecker.hasTeen(22, 23, 34);
        System.out.println("The result is: "+val14);
        System.out.println("---------------------------");

        boolean val15 = TeenNumberChecker.isTeen(9);
        System.out.println("The result is: "+val15);
        System.out.println("---------------------------");
        boolean val16 = TeenNumberChecker.isTeen(13);
        System.out.println("The result is: "+val16);
        System.out.println("---------------------------");

        System.out.println("**********************************************");

        MinutesToYearsDaysCalculator.printYearsAndDays(561600);

        System.out.println("**********************************************");

        IntEqualityPrinter.printEqual(1,1,1);
        IntEqualityPrinter.printEqual(1,1,2);
        IntEqualityPrinter.printEqual(-1,-1,-1);
        IntEqualityPrinter.printEqual(1,2,3);

        System.out.println("**********************************************");
        boolean val17 = PlayingCat.isCatPlaying(false,10);
        System.out.println("The cat is playing: "+val17);
        System.out.println("---------------------------");
        boolean val18 = PlayingCat.isCatPlaying(false,36);
        System.out.println("The cat is playing: "+val18);
        System.out.println("---------------------------");
        boolean val19 = PlayingCat.isCatPlaying(true,35);
        System.out.println("The cat is playing: "+val19);
        System.out.println("---------------------------");
    }
}
