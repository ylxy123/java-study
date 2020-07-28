package property;

public class Armor extends Item{
    int ac;

    public Armor(String name, int price, int ac){
        this.ac = ac;
        this.name = name;
        this.price = price;
    }
    public static void main(String[] args) {
        Armor clothArmor = new Armor("布甲", 300, 15);
        Armor chainArmor = new Armor("锁子甲", 500, 40);
        System.out.println(clothArmor.name);
        System.out.println(clothArmor.price);
    }
}
