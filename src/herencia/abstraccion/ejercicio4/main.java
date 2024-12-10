package herencia.abstraccion.ejercicio4;

import herencia.abstraccion.ejercicio4.entities.Appliance;
import herencia.abstraccion.ejercicio4.entities.Refrigerator;
import herencia.abstraccion.ejercicio4.entities.WashingMachine;
    
public class main {
    public static void main(String[] args) {
        // Create an array of Appliance objects
        Appliance[] appliances = {
                new WashingMachine("LG", "TWINWash", 15),
                new Refrigerator("Samsung", "Family Hub", 800),
                new WashingMachine("Bosch", "Series 6", 9),
                new Refrigerator("Whirlpool", "Double Door", 600)
        };
        //Appliance appliance2 = new Refrigerator();
        // Turn on each appliance, display details, and then turn off
            for (Appliance appliance : appliances){
                appliance.turnOn();
                appliance.displayDetails();
                appliance.turnOff();
                System.out.println();
            }
        }
    }