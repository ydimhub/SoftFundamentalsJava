import java.util.Scanner;

public class BackInMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int result = (hour * 60) + minutes + 30;

        int finalHours = result / 60;
        int finalMinutes = result % 60;

        if (finalHours > 23){
            finalHours = 0;
        }
        System.out.printf("%d:%02d",finalHours, finalMinutes);
    }
}
