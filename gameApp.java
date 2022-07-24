// ini cuma nyoba2 nerapin OOP

// Player 
class Player {
    String name;
    int lvl;
    int health;

    // Object Member
    Weapon weapon;
    Armor armor;

    Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Fight
    void attack(Player opponent) {
        int atkPwr = this.weapon.atkPwr;
        System.out.println(this.name + " attacking " + opponent.name + " with power " + atkPwr);
        opponent.defence(atkPwr);
    }

    void defence(int atkPwr) {
        // armor akan menyerap damage diterima
        int damage;
        if (this.armor.defPwr < atkPwr) {
            damage = atkPwr - this.armor.defPwr;
        } else {
            damage = 0;
        }
        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
    }

    // Equipment
    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    // Output
    void display() {
        System.out.println("\nName: " + this.name);
        System.out.println("Health: " + this.health + "HP");
        this.weapon.display();
        this.armor.display();
    }
}

// Weapon
class Weapon {
    String name;
    int atkPwr;

    Weapon(String name, int atkPwr) {
        this.name = name;
        this.atkPwr = atkPwr;
    }

    // Output
    void display() {
        System.out.println("Weapon: " + this.name + ", Power: " + this.atkPwr);
    }
}

// Armor
class Armor {
    String name;
    int defPwr;

    Armor(String name, int defPwr) {
        this.name = name;
        this.defPwr = defPwr;
    }

    // Output
    void display() {
        System.out.println("Armor: " + this.name + ", defPwr: " + this.defPwr);
    }
}

public class GameApp {
    public static void main(String[] args) {

        // buat object player
        Player player1 = new Player("Thanos", 100);
        Player player2 = new Player("Stark", 85);

        // buat object weapon
        Weapon excalibur = new Weapon("Excalibur", 64);
        Weapon katana = new Weapon("Katana", 95);

        // buat object armor
        Armor goldenArmor = new Armor("Golden Armor", 80);
        Armor samuraiSuit = new Armor("Samurai Suit", 40);

        // equip weapon and armor
        // call the output
        player1.equipWeapon(excalibur);
        player1.equipArmor(goldenArmor);
        player1.display();

        player2.equipWeapon(katana);
        player2.equipArmor(samuraiSuit);
        player2.display();

        // Fight
        System.out.println("\n---FIGHT---");

        System.out.println("\nEpisode 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();

        System.out.println("\nEpisode 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}
