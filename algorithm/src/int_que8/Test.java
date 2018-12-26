package int_que8;

/**
 * @author LaZY（李志一）
 * @data 2018/12/26 - 11:15
 */
public class Test {


    public static void main(String[] args) {

        int[] array1 = {3, 4, 5, 1, 2};
        System.out.println(Min_RotateArray.min(array1));

        // 有重复数字，并且重复的数字刚好的最小的数字
        int[] array2 = {3, 4, 5, 1, 1, 2};
        System.out.println(Min_RotateArray.min(array2));

        // 有重复数字，但重复的数字不是第一个数字和最后一个数字
        int[] array3 = {3, 4, 5, 1, 2, 2};
        System.out.println(Min_RotateArray.min(array3));

        // 有重复的数字，并且重复的数字刚好是第一个数字和最后一个数字
        int[] array4 = {1, 0, 1, 1, 1};
        System.out.println(Min_RotateArray.min(array4));

        // 单调升序数组，旋转0个元素，也就是单调升序数组本身
        int[] array5 = {1, 2, 3, 4, 5};
        System.out.println(Min_RotateArray.min(array5));

        // 数组中只有一个数字
        int[] array6 = {2};
        System.out.println(Min_RotateArray.min(array6));

        // 数组中数字都相同
        int[] array7 = {1, 1, 1, 1, 1, 1, 1};
        System.out.println(Min_RotateArray.min(array7));

    }
}
