import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1 task
        int [] spends = {8616, 6164, 6168, 9520, 9553};
        int sum = Arrays.stream(spends).sum();
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();

        // 2 task

        int [] spending = {9876, 5984, 4168, 5954, 9844};
        int max = Arrays.stream(spending).max().getAsInt();
        int min = Arrays.stream(spending).min().getAsInt();
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");


        System.out.println();

        // 3 task

        int [] numbers = {325479, 155157, 256277, 325625};
        double average = 0;
        if (numbers.length > 0)
        {
            double summ = 0;
            for (int i = 0; i < numbers.length; i++) {
                summ += numbers[i];
            }
            average = summ / numbers.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println();

        // 4 task

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}