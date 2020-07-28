package charactor;

public class ADHero extends Hero implements AD{
    public void attack() {
        System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
    }
    // 可变数量的参数
    public void attack(Hero ... hero) {
        for (int i = 0; i < hero.length; i++) {
            System.out.println(name + " 攻击了 " + hero[i].name);
        }
    }

    @Override
    public void physicAttack(){
        System.out.println("进行了物理攻击");
    }
}