public class PrintHeroType {
    public static void main(String[] args) {
        HeroType herotype = HeroType.ASSASSIN;
        switch (herotype){
            case PUSH:
                System.out.println("推进");
                break;
            case ASSASSIN:
                System.out.println("刺客");
                break;
            case TANK:
                System.out.println("坦克");
                break;
            case ASSIST:
                System.out.println("辅助");
                break;
            case RANGED:
                System.out.println("射手");
                break;
            case WIZARD:
                System.out.println("法师");
                break;
            case FARMING:
                System.out.println("打野");
                break;
            case WARRIOR:
                System.out.println("战士");
                break;
        }
    }
}
