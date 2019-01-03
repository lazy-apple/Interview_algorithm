package int_que11;

/**实现函数double Power(double base, int exponent)，
 * 求base的exponent次方。
 * 不得使用库函数，同时不需要考虑大数问题。
 * @author LaZY（李志一）
 * @data 2019/1/3 - 20:58
 */
public class Integer_power {
    /***
     * 求整数次幂的值
     *  1.输入检查；
     *      错误输入。
     *      简单输入。
     *  2.获得幂的绝对值；
     *  3.计算幂次方；
     *      幂为0,1返回（递归出口）。
     *      幂减半，求解（递归）。
     *      结果为当前结果的平方。
     *          当为奇数次方，再乘一次底数。
     *  4.计算负数幂次方。
     * @param base 底数
     * @param exponent 幂指数
     * @return
     */
    public static double power(double base,int exponent){
        double result = 0;
        if(check(base,exponent)){
            if(exponent == 1 || exponent == 0){
                return checkPower(base,exponent);
            }
            long exp = getAbsolute(exponent);
            result = powerWithUnsignedExponent(base,exp);
            result = checkNegative(result,exponent);
        }
        return result;
    }

    /***
     * 求正整数幂的结果
     * @param base
     * @param exponent  正整数幂
     * @return
     */
    public static double powerWithUnsignedExponent(double base,long exponent){
        if(exponent == 1){
            return base;
        }

        if(exponent == 0){
            return 1;
        }

        double result = powerWithUnsignedExponent(base,exponent >> 1);
        result *= result;
        if(exponent%2 != 0){
            result *= base;
        }
        return result;
    }

    /***
     * 根据幂的符号返回相应的结果
     * @param result 正整数幂的结果
     * @param exponent 幂的真实值
     * @return
     */
    public static double checkNegative(double result,int exponent){
        if(exponent<0){
            result = 1/result;
        }
        return result;
    }
    /***
     * 输入检查
     * @param base
     * @param exponent 幂
     * @return
     */
    public static boolean check(double base,int exponent){
        if (base == 0 && exponent == 0) {
            throw new RuntimeException("底数和指数不能同时为0");
        }else {
            return true;
        }
    }

    /***
     * （对幂的）简单输入检查
     * @param base
     * @param exponent 幂
     * @return
     */
    public static double checkPower(double base,int exponent){
        if(exponent == 0){
            return 1;
        }else if(exponent == 1){
            return base;
        }else{
            throw new RuntimeException("输入错误");
        }
    }

    /***
     * 获得幂的绝对值
     * @param exponet 幂
     * @return
     */
    public static long getAbsolute(long exponet){
        if(exponet<0){
            exponet = -exponet;
        }
        return exponet;
    }
}
