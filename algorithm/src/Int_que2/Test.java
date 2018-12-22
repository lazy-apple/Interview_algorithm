package Int_que2;

/**
 * @author LaZY（李志一）
 * @data 2018/12/22 - 9:36
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Singleton.Singlenton1.getInstance() == Singleton.Singlenton1.getInstance());
        System.out.println(Singleton.Singlenton2.getInstance() == Singleton.Singlenton2.getInstance());
        System.out.println(Singleton.Singlenton3.getInstance() == Singleton.Singlenton3.getInstance());
        System.out.println(Singleton.Singlenton4.getInstance() == Singleton.Singlenton4.getInstance());
        System.out.println(Singleton.Singlenton5.getInstance() == Singleton.Singlenton5.getInstance());
        System.out.println(Singleton.Singlenton6.INSTANCE == Singleton.Singlenton6.INSTANCE);
        System.out.println(Singleton.Singlenton7.getInstance() == Singleton.Singlenton7.getInstance());
    }
}
