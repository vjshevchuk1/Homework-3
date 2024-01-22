public class Main {
    public static void main(String[] args) {
        // Task 1
        int num1 = 0, num2 = 1, num3 = 2, num4 = 3, num5 = 4, num6 = 5, num7 = 6, num8 = 7, num9 = 8, num10 = 9;
        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        int average = sum / 10;

        System.out.println("Sum of numbers: " + sum);
        System.out.println("Average: " + average);

        // Task 2
        double priceA = 1000.0;
        double priceB = 500.0;
        double discount = 0.10;
        double totalPrice = (priceA + priceB) * (1 - discount);

        System.out.println("\nTotal cost with discount: " + totalPrice);
        System.out.println("Discount amount: " + (priceA + priceB - totalPrice));

        // Task 3
        int[] temps = {25, 27, 22, 30, 28, 26, 23};
        int sumTemps = 0;
        for (int temp : temps) {
            sumTemps += temp;
        }
        double averageTemperature = (double) sumTemps / temps.length;

        System.out.println("\nAverage temperature for the week: " + averageTemperature);

        // Task 4
        System.out.println("\nRemainder of division by 2 and 3:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " % 2 = " + (i % 2) + ", " + i + " % 3 = " + (i % 3));
        }

        // Task 5
        int x = 3;
        x += x++;
        System.out.println("\nValue of x after the operation x += x++: " + x);
    }
}
