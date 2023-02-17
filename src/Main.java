import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Нажмите Enter, чтобы начать таймер на 1 минуту.");
        scanner.nextLine();

        long startTime = System.currentTimeMillis();

        System.out.println("Нажмите кнопку в тот момент, когда пройдет 1 минута.");

        scanner.nextLine();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        final long minuteInMilliseconds = 60_000;

        if (elapsedTime < minuteInMilliseconds) {
            System.out.println("Вы нажали кнопку слишком рано.");
        } else if (elapsedTime == minuteInMilliseconds) {
            System.out.println("У вас прекрасное чувство времени!");
        } else {
            System.out.println("Вы опоздали.");
        }
    }
}