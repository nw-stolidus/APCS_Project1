import pkg.*;
import java.util.*;
import java.util.Scanner;

class gameRun {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        TornadoFarm test = new TornadoFarm();
        //AiRS is gonna take money after day
        test.getMap();
        System.out.println("You have 10 days on the farm, GO!");
        for(int days = 1; days <= 10; days++) {
            System.out.println("Do you want to plant a crop(0), see your money(1), or finish the day(2)?");
            int option = sc.nextInt();
            sc.nextLine();
            if(option == 0) {
                System.out.print("Do you want to plant ");
                for(int i = 0; i < test.getListLen(); i++) {
                    if(i == test.getListLen()-1) {
                        System.out.println("or a "+test.getCrop(i)+"?");
                    }else {
                        System.out.print("a "+test.getCrop(i)+", ");
                    }    
                }
                String chosen = sc.nextLine();
                if(chosen.equals("squallermelon") || chosen.equals("Squallermelon")) {
                    test.changeBal(-45);
                    System.out.println("Where would you like to plant it?(First coord, 1-5)");
                    int first = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Where would you like to plant it?(Second coord, 1-5)");
                    int second = sc.nextInt();
                    sc.nextLine();
                    test.plantCrop(first-1, second-1, "  S  ");
                }
                if(chosen.equals("pomegaleate") || chosen.equals("Pomegaleate")) {
                    test.changeBal(-20);
                    System.out.println("Where would you like to plant it?(First coord, 1-5)");
                    int first = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Where would you like to plant it?(Second coord, 1-5)");
                    int second = sc.nextInt();
                    sc.nextLine();
                    test.plantCrop(first-1, second-1, "  P  ");
                }
                if(chosen.equals("weend") || chosen.equals("Weend")) {
                    test.changeBal(-90);
                    System.out.println("Where would you like to plant it?(First coord, 1-5)");
                    int first = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Where would you like to plant it?(Second coord, 1-5)");
                    int second = sc.nextInt();
                    sc.nextLine();
                    test.plantCrop(first-1, second-1, "  W  ");
                }
            }else if(option == 1) {
                test.getBal();
                days--;
            }else if(option == 2) {
                System.out.println("Skipping a day");
                System.out.println("Current Day: "+days);
            }
            else {
                System.out.println("Wrong input, try again");
                days--;
            }    
        }
	}   
}