package parte1;

class Character {
        // Attributes
        private String name;
        private int healthPoints;
        private int strength;

        // Constructor to initialize attributes
        public Character(String name, int healthPoints, int strength) {
            this.name = name;
            this.healthPoints = healthPoints;
            this.strength = strength;
        }
        // Method to attack another character
        public void attack(Character opponent) {
            System.out.println(this.name + " attacks " + opponent.name + "!");
            opponent.takeDamage(this.strength);
        }
        // Method to take damage
        public void takeDamage(int strength) {
        this.healthPoints -= strength;
        }
        // Method to display character details
        public void detalles() {
            System.out.println("El nombre del personaje es: "+name);
            System.out.println("El personaje ataco con: "+this.strength+" de daño");
            System.out.println("El personaje tiene: "+this.healthPoints+" de vida");

        }
    }