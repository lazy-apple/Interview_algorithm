package int_que10;

/**
 * 请实现一个函数， 输入一个整数，输出该数二进制表示中1的个数。
 * 例如把9表示成二进制是1001 ，有2位是1. 因此如果输入9，该出2。
 * @author LaZY（李志一）
 * @data 2019/1/3 - 19:46
 */
public class CountOf1 {
    /***
     * 计算二进制中1的个数
     * 对32位每一位和1做与运算（int -4字节-32位）
     * 每一次对原数进行无符号右移1位（来计算下一位）
     * @param num
     * @return
     */
    public static int count(int num){
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += (num & 1);//用来识别num二进制最后一位是否为1
            num >>>= 1;
        }
        return count;
    }

    /***
     * 清除数字其二进制的最末端的1，并计数，直到数字归0.
     * @param num
     * @return
     */
    public static int getCount(int num){
        int count = 0;
        while (num != 0){
            count++;
            num &= (num - 1);//清楚二进制末端的1
        }
        return count;
    }
}
