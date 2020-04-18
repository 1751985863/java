package cn.nanfeng;

public class test2 {
    /**
     * 多线程实现
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("创建线程");
        CreateThread createThread=new CreateThread();
        System.out.println("线程开始启动");
        createThread.start();
        System.out.println("-----多线程创建结束-----");

        for (int i = 0; i < 100; i++) {
            System.out.println("main("+i+")");
        }
    }
}

class CreateThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("run("+i+")");
        }
    }
}
