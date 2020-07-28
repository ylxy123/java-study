package charactor;

public class Hero {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度
    public Hero(String heroName, float heroHP, float heroArmor, int heroMoveSpeed){
        this.name = heroName;
        this.armor = heroArmor;
        this.hp = heroHP;
        this.moveSpeed = heroMoveSpeed;
    }
    public Hero(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    public Hero(){

    }
    // 复活
    public void revive(Hero h){
        h.hp = 383;
    }

    public static void main(String[] args) {
        Hero teemo = new Hero("teemo", 383);
        teemo.hp = teemo.hp - 400;
        teemo.revive(teemo);
        System.out.println(teemo.hp);
    }
}
