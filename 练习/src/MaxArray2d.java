public class MaxArray2d {
    public static void main(String[] args) {
        System.out.println("随机5*5数组为：");
        int[][] a = new int[5][5];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                a[i][j] = (int)(Math.random()*100);
            }
            System.out.printf("\t%d\t%d\t%d\t%d\t%d\n",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
        }
        int p = a[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                if (a[i][j] > p){
                    p = a[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.printf("其中最大值为：%d\n",p);
        System.out.printf("最大值坐标为：(%d, %d)",x+1,y+1);
    }
}
