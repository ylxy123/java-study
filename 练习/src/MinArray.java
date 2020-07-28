public class MinArray {
    public static void main(String[] args) {
        int[] a = {0,0,0,0,0};
        for (int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random()*100);
        }
        System.out.println("数组中的各个随机数是:");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);

        int p = a[0];
        for (int i = 1; i < a.length; i++){
            p = Math.min(p, a[i]);
        }
        System.out.printf("其中的一个最小值为：%d", p);

    }
}
