package cn.nanfeng;

class dmeoThread extends Thread{
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getId()+"->"+getName()+currentThread()+"->"+i);
        }
    }
}
public class test5 {
    public static void main(String[] args) {
        dmeoThread thread=new dmeoThread();
        dmeoThread thread1=new dmeoThread();
        thread.start();
        thread1.start();

    }
}
