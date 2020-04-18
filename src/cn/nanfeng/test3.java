package cn.nanfeng;

public class test3 {
    /**
     * 实现runnable接口，实现多线程
     */
    public static void main(String[] args) {
        createRunnable createRunnable=new createRunnable();
        Thread thread=new Thread(createRunnable);
        System.out.println("创建线程");
        thread.start();
        System.out.println("线程结束");
        for (int i = 0; i < 10; i++) {
            System.out.println("main("+i+")");
        }
    }
}

class createRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("run("+i+")");
        }

    }
}
