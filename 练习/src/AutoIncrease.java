public class AutoIncrease {
    public static void main(String[] args) {
        int i = 1;
        int j = ++i;
        int a = i++;
        int b = ++i;
        int c = ++i + i++;
        System.out.println(b);
        System.out.println(c);
    }
}
