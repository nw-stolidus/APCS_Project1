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
                farmLand[i][j] = " 0 ";
            }
        }
    }
    
    public void plantCrop(int x, int y, String cash) {
        farmLand[x][y] = cash;
        getMap();
    }
    
    
    public int getBal() {
        return balance;
    }
    
    public void addBal(int x) {
        balance = balance + x;
    }
    
    public String getCrop(int plant) {
        return crops.get(plant);
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
