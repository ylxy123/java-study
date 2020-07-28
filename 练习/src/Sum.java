import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fstInt = scanner.nextInt();
        System.out.format("第一个整数：%d\n",fstInt);
        int secInt = scanner.nextInt();
        System.out.format("第二个整数：%d",secInt);
        System.out.printf("两者之和为：%d",fstInt+secInt);
    }
}
