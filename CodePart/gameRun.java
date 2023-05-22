import pkg.*;
import java.util.*;
import java.util.Scanner;

class gameRun {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        TornadoFarm test = new TornadoFarm();
        //AiRS is gonna take money after day
        test.getMap();
        for(int days = 0; days < 10; days++) {
            System.out.println("Do you want to plant a crop(0), see your money(1), or finish the day(3)?");
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
                if(chosen == "squallermelon" || chosen == "Squallermelon") {
                    System.out.println("Where would you like to plant it?(First coord)");
                    int first = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Where would you like to plant it?(Second coord)");
                    int second = sc.nextInt();
                    sc.nextLine();
                    test.plantCrop(first, second, " S ");
                }
            }    
        }
	}   
}