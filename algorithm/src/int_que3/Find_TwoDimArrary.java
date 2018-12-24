package int_que3;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author LaZY（李志一）
 * @data 2018/12/22 - 12:38
 */
public class Find_TwoDimArrary {
    /***
     * 查找
     * @param a 指定二维数组
     * @param x 寻找的数
     * @return  t:在数组中；f：不在数组中。
     */
    public static boolean find(int a[][],int x){
        if(check(a)){
            int rows = a.length;//二维数组行数
            int cols = a[0].length;//二维数组列数

            int row = 0;//查找的起始行坐标
            int col = cols - 1;//查找的起始列坐标
            while(row>=0&&row<rows&&col>=0&&col<cols){//careful 循环条件
                if(a[row][col]==x){
                    return true;
                }else if(a[row][col]>x){
                    col--;
                }else {
                    row++;
                }
            }
        }
        return false;
    }

    /***
     * 输入检查
     * @param a 待检测的二维数组
     * @return t:合法；f:不合法
     */
    public static boolean check(int a[][]){
        if(a==null||a.length<1||a[0].length<1){
            System.out.println("输入非法");
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        int a[][] = new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        System.out.println(find(a,7));
        System.out.println(find(a,5));
        System.out.println(find(a,1));
        System.out.println(find(a,15));
        System.out.println(find(a,0));
        System.out.println(find(a,16));
        System.out.println(find(null,16));
    }
}
