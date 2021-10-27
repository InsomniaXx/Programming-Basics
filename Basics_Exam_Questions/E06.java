package ProgrammingBasics.Basics_Exam_Questions;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceCPU = Double.parseDouble(scanner.nextLine());
        double priceVideoCard = Double.parseDouble(scanner.nextLine());
        double priceRAM = Double.parseDouble(scanner.nextLine());
        int countRAM = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double priceCPUlv = priceCPU * 1.57;
        double priceVideoCardlv = priceVideoCard * 1.57;
        double priceRAMlv = (priceRAM * countRAM) * 1.57;
        double priceCPUAfterDiscount = priceCPUlv - (priceCPUlv * discount);
        double priceVideoCardAfterDiscount = priceVideoCardlv - (priceVideoCardlv * discount);
        double finalPrice = priceRAMlv + priceCPUAfterDiscount + priceVideoCardAfterDiscount;


        System.out.printf("Money needed - %.2f leva.", finalPrice);
    }
}
