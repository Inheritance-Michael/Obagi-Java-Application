package oop;

public class Object {
    public static void main(String[] args){

        User user = new User("john", "User.Level.BRONZE");
        User newUser = new User("john", "User.Level.BRONZE");

        /*
        user.set_name("Inheritance");
        user.set_level("level 1");
        user.set_level(User.Level.BRONZE);

         */

        System.out.println(user.equals(newUser));


    }
}
