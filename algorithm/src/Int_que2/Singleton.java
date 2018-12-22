package Int_que2;

/**七种单例模式
 *
 *  单例模式：一个类只有一个实例，自己创建这个实例，整个系统都要这个实例。
 * @author LaZY（李志一）
 * @data 2018/12/22 - 9:34
 */
public class Singleton {
    /***
     *懒汉式，线程安全
     */
    public static class Singlenton1{
        private static final Singlenton1 INSTANCE = new Singlenton1();

        private Singlenton1(){

        }
        public static Singlenton1 getInstance(){
            return INSTANCE;
        }
    }

    /***
     *饿汉式，线程不安全
     */
    public static class Singlenton2{
        private static Singlenton2 instance = null;

        private Singlenton2(){

        }
        public static Singlenton2 getInstance(){
            if(instance==null){
                instance = new Singlenton2();
            }
            return instance;
        }
    }

    /***
     *饿汉式，线程安全，多线程环境下效率不高
     */
    public static class Singlenton3{
        private static Singlenton3 instance = null;

        private Singlenton3(){

        }
        public static synchronized Singlenton3 getInstance(){
            if(instance==null){
                instance = new Singlenton3();
            }
            return instance;
        }
    }

    /***
     *饿汉式，变种，线程安全
     */
    public static class Singlenton4{
        private static Singlenton4 instance = null;
        static{
            instance = new Singlenton4();
        }

        private Singlenton4(){

        }
        public static Singlenton4 getInstance(){
            return instance;
        }
    }

    /***
     *懒汉式，使用静态内部类，线程安全【推荐】
     */
    public static class Singlenton5{
        private static final class SingletonHolder{
            private static final Singlenton5 INSTANCE = new Singlenton5();
        }
        private Singlenton5(){

        }
        public static Singlenton5 getInstance(){
            return SingletonHolder.INSTANCE;
        }
    }

    /**
     *静态内部类，使用枚举方式，线程安全【推荐】
     */
    public enum Singlenton6{
        INSTANCE;
    }

    /***
     *静态内部类，使用双重校验锁，线程安全【推荐】
     */
    public static class Singlenton7{
        private static Singlenton7 instance = null;
        private Singlenton7(){

        }
        public static Singlenton7 getInstance(){
            if(instance==null){
                synchronized (Singlenton7.class){
                    if(instance==null){
                        instance = new Singlenton7();
                    }
                }
            }
            return instance;
        }
    }

}
