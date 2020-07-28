public class ReverseArray {
    public static void main(String[] args) {
        int[] a = new int[15];
        System.out.println("随机化数组");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.println(a[i]);
        }
        System.out.println("数组反转");
        for (int i = 0; i <= a.length/2; i++){
            int j = a.length-1-i;
            int s = a[i];
            a[i] = a[j];
            a[j] = s;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
