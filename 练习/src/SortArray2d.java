import java.util.Arrays;

public  class SortArray2d{
    public static void main(String[] args){
        int [][]a = new int[5][8];
        System.out.println("打印一个5x8的随机二位数组a：");
        for(int i= 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                a[i][j]=(int)(Math.random()*100);
            }
        }
        for(int [] i :a){
            System.out.println(Arrays.toString(i));
        }
        int[] b  = new int[a.length*a[0].length];
        for(int i = 0 ;i<a.length;i++){
            System.arraycopy(a[i], 0, b, i*a[i].length, a[i].length);
        }
        System.out.println("未排序前的b数组："+Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("排序后的b数组："+Arrays.toString(b));
        for(int i = 0;i<a.length;i++){
            System.arraycopy(b, i*a[i].length, a[i], 0, a[i].length);
        }
        System.out.println("排序后的a数组：");
        for(int [] i :a){
            System.out.println(Arrays.toString(i));

        }
    }
}