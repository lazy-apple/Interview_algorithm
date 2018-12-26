package int_que8;

/**把一个数组最开始的若干个元素搬到数组的末尾， 我们称之数组的旋转。
 * 输入一个递增排序的数组的一个旋转， 输出旋转数组的最小元素。
 * 例如数组{3，4, 5, 1, 2 ｝为｛ l1,2,3, 4，5}的一个旋转，该数组的最小值为1
 * @author LaZY（李志一）
 * @data 2018/12/26 - 10:44
 */
public class Min_RotateArray {
    /***
     * 查找旋转数组中的最小值
     *  1.输入检查
     *  2.设置查找的起始、末尾的坐标。
     *  3.设置游标，初始值为起始坐标。。
     *  4在旋转数组中迭代查找
     *      当查找范围间隔为1时：返回末尾坐标（末尾的永远比起始的小）
     *      让游标成为中间坐标
     *      当起始、中间、末尾坐标相等时：遍历查找。
     *      当中间坐标大于（等于）起始坐标，让中间坐标为起始坐标。
     *      当中间坐标小于（等于）末尾坐标，让中间坐标为末尾坐标。
     *  不满足旋转数组返回数组起始坐标
     *
     * @param a 数组
     * @return 旋转数组中的最小值
     */
    public static int min(int a[]){
        int start = 0;
        int end = a.length - 1;
        int index = start;

        while(a[start]>=a[end]){
            if((end - start)==1){
                return a[end];
            }

            index = index + (end - start)/2;
            
            if(a[start]==a[index]&&a[index]==a[end]){
                return findMin(a,start,end);
            }
            
            if(a[index] >= a[start]){
                start = index;
            }

            if(a[index] <= a[end]){
                end = index;
            }
        }
        return a[start];
    }



    /***
     * 遍历查找数组中的最小值
     * @param a 数组
     * @param start 遍历起始点
     * @param end 遍历末尾
     * @return 范围内数组最小值
     */
    public static int findMin(int a[],int start,int end){
        int result = a[start];
        for (int i = start+1; i <= end; i++) {
            if(result>a[i]){
                result =a[i];
            }
        }
        return result;
    }
    /***
     * 输入检查
     * @param a 数组
     * @return
     */
    public static boolean check(int a[]){
        if(a == null||a.length == 0){
            return false;
        }else{
            return true;
        }
    }

}
