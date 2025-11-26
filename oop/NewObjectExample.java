package oop;

import java.lang.Object;

import java.util.*;

import static oop.User.admin;
import static oop.User.printAdminNames;

public class NewObjectExample {
    public static void main(String[] args){
        User users = new User();
        users.set_name("john");

       ArrayList<User> listOfUsers = new ArrayList<User>();
       listOfUsers.add(new User("micheal"));
       listOfUsers.add(new User("sally"));
       listOfUsers.add(new User("joy"));
       listOfUsers.add(new User("messi"));

      admin = new ArrayList<User>();
       admin.add(new User("micheal"));
       admin.add(new User("sally"));
       admin.add(new User("joy"));
       admin.add(new User("messi"));

//        for(int i = 0; i < listOfUsers.size(); i++){
//            System.out.println(listOfUsers.get(i).get_name());
//        }

        /*
        int count = 0;
        while (count < listOfUsers.size()){
            System.out.println(listOfUsers.get(count).get_name());
            count++;
        }

        for(User i: listOfUsers){
            System.out.println(i.get_name());
        }
         */

        User.printAdminNames();
    }
}
