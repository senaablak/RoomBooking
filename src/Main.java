import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int room;
        int Night = 1;
        int answer;
        int roomPrice = 0;

        System.out.println("--Welcome Reservation System--");
        System.out.println("Please Select which Bedroom wants to reserve.");
        Scanner input = new Scanner(System.in);
        System.out.println("For King Bed (Price=120) room please press 1" + "\nFor Queen Bed (Price=100) room please press 2" + "\nFor Single Bed (Price = 80) room please press 3");
        room = input.nextInt();

        if (room == 1) {
            roomPrice = 120;
        } else if (room == 2) {
            roomPrice = 100;
        } else if (room == 3) {
            roomPrice = 80;
        } else {
            System.out.println("Wrong Choise Plaese Try Again.");
            System.exit(0);
        }


        System.out.println("Please Select how many nights staying");
        Night = input.nextInt();

        System.out.println("would you like to reserve another room? " + "\nFor 'Yes' press 1" + "\n For 'No' press 2");
        answer = input.nextInt();
        while (answer <= 1) {

            System.out.println("Please Select which Bedroom wants to reserve.");
            System.out.println("For King Bed room please press 1" + "\nFor Queen Bed room please press 2" + "\nFor Single Bed room please press 3");
            room = input.nextInt();
            if (room == 1) {
                roomPrice = 120;
            } else if (room == 2) {
                roomPrice = 100;
            } else if (room == 3) {
                roomPrice = 80;
            } else {
                System.out.println("Wrong Choise Plaese Try Again.");
            }

            System.out.println("Please Select how many nights staying");
            Night = input.nextInt();

            System.out.println("would you like to reserve another room? " + "\nFor Yes press 1" + "\n For No press 2");
            answer = input.nextInt();        }
        if (answer == 2) {
            System.out.println("Total Price = " + roomPrice * Night);

        }


    }
}