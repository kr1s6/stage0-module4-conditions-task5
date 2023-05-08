package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int x = year%100 == 0 && year%400 != 0? 0 : 1;
        switch (x){
            case 1 -> System.out.println("leap");
            case 0 -> System.out.println("not leap");
        }
    }
}
