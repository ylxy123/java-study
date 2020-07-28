package charactor;

public class Support extends Hero implements Healer{
    public void heal(Hero hero, int hp){
        System.out.println(this.name + "为" + hero.name + "治疗了" + hp + "点生命值");
    }
    public void heal(Hero hero){
        System.out.println(this.name + "为" + hero.name + "治疗了");
    }

    @Override
    public void heals(){
        System.out.println("治疗");
    }
}
