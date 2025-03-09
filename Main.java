import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // input 
        Scanner scanner = new Scanner(System.in);
        Path path1 = new Path();
        Path path2 = new Path();
        Path path3 = new Path();

        // game loop
        while (true) {
            System.out.println("GAMERINO 1:");
            path1.DisplayMan();
            System.out.println("GAMERINO 2:");
            path2.DisplayMan();
            System.out.println("GAMERINO 3:");
            path3.DisplayMan();

            // win condition
            if (path1.isWinner() && path2.isWinner() && path3.isWinner()) {
                System.out.println("YOU ARE DID IT!!!!!!!!!!!\n            o\n           ooo\n          ooooo\n    ooooooooooooooooo\n      ooooooooooooo\n        ooooooooo\n      ooooo   ooooo\n     ooo         ooo\n    o               o\n");
            }

            System.out.print("Which GAMERINO would you like to move? (1, 2, or 3, or enter 0 to quit): ");
            
            int pathChoice = -1;
            while (true) {
                if (scanner.hasNextInt()) {
                    pathChoice = scanner.nextInt();
                    scanner.nextLine(); 
                    break;
                } else {
                    System.out.println("WOMP WOMP! wrong input. Please enter a valid number (1, 2, 3, or 0 to quit): ");
                    scanner.nextLine(); 
                }
            }

            if (pathChoice == 0) {
                System.out.println("BYEBYE!!!");
                break;
            }
            
            //movement
            if (pathChoice == 1) {
                System.out.print("Enter 'L' to move left or 'R' to move right: ");
                String input = scanner.nextLine().toUpperCase();
                if (input.equals("L")) {
                    path1.missionMan.StepLeft();
                } else if (input.equals("R")) {
                    path1.missionMan.StepRight();
                }
            } else if (pathChoice == 2) {
                System.out.print("Enter 'L' to move left or 'R' to move right: ");
                String input = scanner.nextLine().toUpperCase();
                if (input.equals("L")) {
                    path2.missionMan.StepLeft();
                } else if (input.equals("R")) {
                    path2.missionMan.StepRight();
                }
            } else if (pathChoice == 3) {
                System.out.print("Enter 'L' to move left or 'R' to move right: ");
                String input = scanner.nextLine().toUpperCase();
                if (input.equals("L")) {
                    path3.missionMan.StepLeft();
                } else if (input.equals("R")) {
                    path3.missionMan.StepRight();
                }
            } else {
                System.out.println("Invalid path choice. Please enter 1, 2, 3, or 0 to quit.");
                continue;
            }
        }

        scanner.close();
    }
}
