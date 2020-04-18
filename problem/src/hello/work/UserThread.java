package hello.work;

import java.util.List;

public class UserThread<T> extends Thread {
    private List<T> list;

    public UserThread(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (T t : list) {
            System.out.println("线程信息为:"+Thread.currentThread()+"学员信息:"+t.toString());
        }
    }
}
