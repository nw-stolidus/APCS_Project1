package pkg;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

class TornadoFarm {
    int balance;
    ArrayList<String> crops = new ArrayList<String>();
    String name;
    
    public TornadoFarm() {
        balance = 500;
        name = "Windell Blowout";
    }
    
    public int getBal() {
        return balance;
    }
    
    public void addBal(int x) {
        balance = balance + x;
    }
    
    public void newCrop(String plant) {
        crops.add(plant);
    }
    
	
}
