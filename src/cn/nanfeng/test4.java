package cn.nanfeng;

public class test4 {
    /**
     * 匿名内部类实现多线程
     * @param args
     */
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("run("+i+")");
                }
            }
        }).start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main("+i+")");
        }

    }
}
