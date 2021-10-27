package ProgrammingBasics.Basics_While_Loop;

public class A04NumbersDividedBy3WithoutReminder {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
