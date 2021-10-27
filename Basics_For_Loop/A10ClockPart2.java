package ProgrammingBasics.Basics_For_Loop;

public class A10ClockPart2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 59; j++) {
                for (int k = 0; k <= 59; k++) {
                    System.out.printf("%d : %d : %d%n", i, j, k);
                }
            }
        }
    }
}
