public class abc {
    public static void main() {
        int year = 1900;
        if (year % 4 == 0) {
            int a = year;
            a = a / 100;
            if (a % 2 == 0) {
                System.out.pritnln("leap year");

            } else {
                System.out.pritnln("not a leap year");
            }
        }
    }
}