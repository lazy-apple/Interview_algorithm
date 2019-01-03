package int_que10;

/**
 * @author LaZY（李志一）
 * @data 2019/1/3 - 20:18
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(CountOf1.count(0B00000000_00000000_00000000_00000000));
        System.out.println(CountOf1.count(0B00000000_00000000_00000000_00000001));
        System.out.println(CountOf1.count(0B11111111_11111111_11111111_11111111));
        System.out.println(CountOf1.count(7));
        System.out.println(CountOf1.getCount(0B00000000_00000000_00000000_00000000));
        System.out.println(CountOf1.getCount(0B00000000_00000000_00000000_00000001));
        System.out.println(CountOf1.getCount(0B11111111_11111111_11111111_11111111));
        System.out.println(CountOf1.getCount(7));
    }
}
