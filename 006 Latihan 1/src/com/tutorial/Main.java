package com.tutorial;

// Player
class Player {
    String name;
    double health;
    int level;

    // Object Member
    Weapon weapon;
    Armor armor;

    Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    // method
    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("\nName: " + this.name);
        System.out.println("Health: " + this.health);
        this.weapon.display();
        this.armor.display();
    }
}

// Senjata
class Weapon {
    double WeaponPower;
    String name;

    Weapon(String name, double WeaponPower) {
        this.name = name;
        this.WeaponPower = WeaponPower;
    }

    void display() {
        System.out.println("Weapon : " + this.name + ", attack : " + this.WeaponPower);
    }
}

// Tameng
class Armor {
    double defencePower;
    String name;

    Armor(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    void display() {
        System.out.println("Armor : " + this.name + ", defences : " + this.defencePower);
    }
}

public class Main {
    public static void main(String[] args) {

        // membuat object Player
        Player player1 = new Player("Aelita", 100);
        Player player2 = new Player("Ulrich", 120);

        // Membuat object Weapon
        Weapon pedang = new Weapon("pedang", 15);
        Weapon laser = new Weapon("laser", 20);

        // Membuat object Armor
        Armor bajuBesi = new Armor("Baju Besi", 10);
        Armor tameng = new Armor("tameng", 25);

        // Equip Player1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        // Equip Player2
        player2.equipWeapon(laser);
        player2.equipArmor(tameng);
        player2.display();
    }
}