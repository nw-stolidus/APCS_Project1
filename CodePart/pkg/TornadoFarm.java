package pkg;
import java.util.*;

public class TornadoFarm {
    int balance;
    ArrayList<String> crops = new ArrayList<String>();
    String name;
    String[][] farmLand = new String[5][5];
    
    
    public TornadoFarm() {
        crops.add("Squallermelon");
        crops.add("Pomegaleate");
        crops.add("Weend");
        balance = 500;
        name = "Windell Blowout";
        for(int i = 0; i < farmLand.length; i++) {
            for(int j = 0; j < farmLand[0].length; j++) {
                farmLand[i][j] = "  0  ";
            }
        }
    }
    
    public void plantCrop(int x, int y, String cash) {
        farmLand[x][y] = cash;
        getMap();
    }
    
    
    public int getBal() {
        System.out.println("$"+balance);
        return balance;
    }
    
    public void changeBal(int x) {
        balance = balance + x;
    }
    
    public String getCrop(int plant) {
        return crops.get(plant);
    }
    
    public int income() {
        int income = 0;
        for(int uno = 0; uno < farmLand.length; uno++) {
            for(int dos = 0; dos < farmLand[0].length; dos++) {
                if(farmLand[uno][dos].equals("  S  ")) {
                    income += 30;
                }
                if(farmLand[uno][dos].equals("  P  ")) {
                    income += 15;
                }
                if(farmLand[uno][dos].equals("  W  ")) {
                    income += (int) income*0.6;
                }
            }
        }
        changeBal(income);
        return income;
    }
    
    public int getListLen() {
        return crops.size();
    }
    
    public void getMap() {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(farmLand[i][j]);
            }
            System.out.println();
        }
        
    }
	
}
