public class MergeArray {
    public static void main(String[] args) {
        int[] a = new int[8];
        int[] b = new int[9];
        System.out.println("数组a：");
        for (int i = 0; i< a.length; i++){
            a[i] = (int)(Math.random()*100);
            System.out.println(a[i]);
        }
        System.out.println("数组b：");
        for (int j = 0;j < b.length; j++){
            b[j] = (int)(Math.random()*100);
            System.out.println(b[j]);
        }
        System.out.println("======数组合并======");
        int[] c = new int[a.length+b.length];
        for (int i = 0; i< c.length; i++){
            if (i < a.length){
                c[i] = a[i];
            }
            else{
                c[i] = b[i-a.length];
            }
            System.out.println(c[i]);
        }
    }
}
