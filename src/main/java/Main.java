import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Race race = new Race();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название машины: ");
            String carName = scanner.nextLine();
            boolean check = false;
            while (check == false) {
                System.out.println("Введите скорость машины: ");
                Scanner scanner1 = new Scanner(System.in);
                int carSpeed = scanner1.nextInt();

                if (carSpeed > 0 && carSpeed <= 250) {
                    Car carWinner = new Car(carName, carSpeed);
                    check = true;
                   race.calculate(carWinner);
                } else {
                    System.out.println("Введины неправильные данные, введите дааные заново");

                }
            }
            race.winner = race.getWinner();

        }

        System.out.println("Победитель: " + race.winner);
    }

}
