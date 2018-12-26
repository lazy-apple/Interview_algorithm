package int_que9;

/**写一个函数，输入n，求斐波那契（Fibonacci) 数列的第n项
 * @author LaZY（李志一）
 * @data 2018/12/26 - 15:45
 */
public class Fibonacci {

    /***
     * 获得指定位置斐波那契数列的值
     *  1.输入检查
     *  2.设置各个位置的初始值。
     *  3.迭代求解
     *  4.更新数值
     *  
     * @param num 位置
     * @return
     */
    public static int getFib(int num){
        if(check(num)!=-1){
            return check(num);
        }else {
            int prePre = 1;
            int pre = 1;
            int current = 2;

            for (int i = 3; i <= num ; i++) {
                current = prePre + pre;
                prePre = pre;
                pre = current;
            }
            return current;
        }
    }

    public static int check(int num){
        if(num <=0){
            return 0;
        }else if(num==1||num==2){
            return 1;
        }else {
            return -1;
        }
    }


    public static void main(String[] args) {
        System.out.println(getFib(0));
        System.out.println(getFib(1));
        System.out.println(getFib(2));
        System.out.println(getFib(3));
        System.out.println(getFib(4));
        System.out.println(getFib(5));
        System.out.println(getFib(6));
        System.out.println(getFib(7));
    }
}
