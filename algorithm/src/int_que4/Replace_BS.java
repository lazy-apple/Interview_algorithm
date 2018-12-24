package int_que4;

/**
 * 实现一个函数，
 * 把字符串中的每个空格替换成"%20"，
 * 例如“We are happy.”，则输出“We%20are%20happy.”。
 *
 * @author LaZY（李志一）
 * @data 2018/12/23 - 8:19
 */
public class Replace_BS {

    /***
     * 输入检查
     * @param c 字符数组
     * @param uselenth  字符数组中有效长度
     * @return  t:合法；f:不合法。
     */
    public static boolean check (char c[],int uselenth){
        if(c.length<1 || uselenth>c.length){
            return false;
        }else{
            return true;
        }
    }

    /***
     * 计算字符数组中空格字符的个数
     * @param c 字符数组
     * @return 空格字符的个数
     */
    public static int count_BS(char c[],int uselenth){
        int count = 0;
        for (int i = 0;i < uselenth;i++){
            if(c[i]==' '){
                count++;
            }
        }
        return count;
    }

    /***
     * 替换字符串中的空格
     *  1.输入检查
     *  2.获取字符数组中空格字符的个数。
     *  3.根据（2）计算最终字符串的有效长度，并保存（用于返回结果）。
     *  4.对结果预判：
     *      字符数组中无空格，返回原长度。
     *      替换后的字符数组长度大于数组的容量，返回-1。
     *  5.替换（从后向前迭代）
     *      起始位置分别是替换前的末尾和替换后的末尾位置（均为有效长度）
     *      检验（替换前）当前位置
     *          是空格：在（替换后）位置进行修改。
     *          不是空格：将原本的字符添加。
     * @param c
     * @param uselenth
     * @return
     */
    public static int replace(char[] c,int uselenth){
        int num = 0;
        if(check(c,uselenth)){
            int count = count_BS(c,uselenth);
            int newlenth = 2*count + uselenth;
            num = newlenth;
            if(newlenth==count){
                return 0;
            }else if(newlenth>c.length){
                return -1;
            }else{
                int s1 = uselenth - 1;
                int s2 = newlenth - 1;
                while (s1>=0&&s1<s2){
                    if(c[s1] == ' '){
                        c[s2--] = '0';//wrong 错误写法：c[s2]。 错误原因：a++ 和 ++a的区别。
                        c[s2--] = '2';
                        c[s2--] = '%';
                    }else{
                        c[s2--] = c[s1];//wrong 同上
                    }
                    s1--;
                }
            }
        }else{
            return -1;
        }
        return num;
    }

    public static void main(String[] args) {
        char[] c = new char[50];
        c[0] = ' ';
        c[1] = 'e';
        c[2] = ' ';
        c[3] = ' ';
        c[4] = 'r';
        c[5] = 'e';
        c[6] = ' ';
        c[7] = ' ';
        c[8] = 'a';
        c[9] = ' ';
        c[10] = 'p';
        c[11] = ' ';
        int lenth = replace(c,12);
        System.out.println(new String(c,0,lenth));
    }
}
