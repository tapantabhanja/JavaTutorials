import javax.sound.midi.Soundbank;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println("Year -1600 is: "+isLeapYear(-1600));
        System.out.println("Year 1600 is: "+isLeapYear(1600));
        System.out.println("Year 2017 is: "+isLeapYear(2017));
        System.out.println("Year 2000 is: "+isLeapYear(2000));

        System.out.println("----------------------------");

        System.out.println("The number of days in month of the given year: "+getDaysInMonth(1, 2020));
        System.out.println("The number of days in month of the given year: "+getDaysInMonth(2, 2020));
        System.out.println("The number of days in month of the given year: "+getDaysInMonth(2, 2018));
        System.out.println("The number of days in month of the given year: "+getDaysInMonth(-1, 2020));
        System.out.println("The number of days in month of the given year: "+getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear (int year) {

        if (year <1 || year > 9999) {
            return false;
        }
        else {
            int remBy4 = year%4;
            int remBy100 = year%100;
            int remBy400 = year%400;

            if ((remBy4==0 && remBy100!=0) || (remBy400==0)) {
                return true;
            }
            else {
                return false;
            }
        }

    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }

        else if (year < 1 || year > 9999) {
            return -1;
        }

        else {

            // Checking if the year is a leap year.
            boolean yearCheck = isLeapYear(year);

            switch (month) {

                case 1:
                    return 31;
                    // break;

                case 2:
                    if (yearCheck) {
                      return 29;
                }
                    else {
                        return 28;
                }
                    // break;

                case 3:
                    return 31;
                    // break;

                case 4:
                    return 30;
                    // break;

                case 5:
                    return 31;
                    // break;

                case 6:
                    return 30;
                    // break;

                case 7:
                    return 31;
                    // break;

                case 8:
                    return 31;
                    // break;

                case 9:
                    return 30;
                    // break;

                case 10:
                    return 31;
                    // break;

                case 11:
                    return 30;
                    // break;

                case 12:
                    return 31;
                    // break;

                default:
                    return -1;
                    // break;
            }
        }
    }
}
