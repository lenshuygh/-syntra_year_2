package recap_exercises;

import java.util.Scanner;

public class Ex03LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year to check: ");
        System.out.println(isIntLeapYear(scanner.nextInt()));
    }

    private static boolean isIntLeapYear(int yearToCheckInt) {
        if(yearToCheckInt % 4 != 0){
            return false;
        }
        if(yearToCheckInt % 400 == 0){
            return true;
        }
        if(yearToCheckInt % 100 == 0){
            return false;
        }
        return false;
    }
}
