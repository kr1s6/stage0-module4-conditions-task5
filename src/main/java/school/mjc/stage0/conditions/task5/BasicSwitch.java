package school.mjc.stage0.conditions.task5;

public class BasicSwitch {
    public static void main(String[] args) {
        int a = 20;
        switch (a) {
            case (7) -> System.out.println("seven");
            case (10) -> System.out.println("ten");
            case (19) -> System.out.println("twenty");
            default -> System.out.println("default");
        }
    }
}
