import models.Auto;
import models.User;
import services.AutoService;
import services.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args){
        UserService userService = new UserService();
        AutoService autoService = new AutoService();


        userService.saveUser(new User("Misha", 26));
        userService.saveUser(new User("Vasya", 27));
        userService.saveUser(new User("Tolya", 28));
        userService.saveUser(new User("Petya", 29));
        userService.saveUser(new User("Vanya", 30));

        autoService.saveAuto(new Auto("Mercedes", "silver"));
        autoService.saveAuto(new Auto("BMW", "montecarlo"));
        autoService.saveAuto(new Auto("Subaru", "blue"));
        autoService.saveAuto(new Auto("Mitsubishi", "red"));
        autoService.saveAuto(new Auto("Ford", "black"));

        List<User> userList = userService.findAllUsers();
        List<Auto> autoList = autoService.findAllAutos();

        int i = 0;
        for (User userFor:userList) {
//            System.out.println(userFor);
            userFor.addAuto(autoList.get(i));
            i++;
        }

        for (Auto autoFor:autoList){
            System.out.println(autoFor);
        }

//        userService.deleteUser(userList.get(4));
    }
}
