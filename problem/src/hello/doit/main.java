package hello.doit;

import hello.entity.User;
import hello.utils.ListUtils;
import hello.work.UserThread;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<User> listUserEntity = init();
        int userThreadPage = 50;
        List<List<User>> splitUserList = ListUtils.splitList(listUserEntity, userThreadPage);
        int threadSaze = splitUserList.size();
        for (int i = 0; i < threadSaze; i++) {
            List<User> list = splitUserList.get(i);
            UserThread userThread = new UserThread(list);
            userThread.start();

        }
    }
    public static List<User> init() {
        List<User>list = new ArrayList<User>();
        for (int i = 1; i<= 140; i++) {
            User userEntity = new User();
            userEntity.setId("userId" + i);
            userEntity.setName("userName" + i);
            list.add(userEntity);
        }
        return list;

    }

}
