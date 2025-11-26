package oop;

import java.util.List;

public class User {
    public User(String name, String level) {
         set_name(name);
         set_level(level);
    }

    public static void printAdminNames(){
        for(User i: admin){
            System.out.println(i.get_name());
        }
    }

    public static List<User>admin;

    public User() {

    }

    public User(String name){
        set_name(name);
    }

    public boolean equals(User newUser){
        if (
                get_name() == newUser.get_name()
                &&
                get_level() == newUser.get_level()
        ){
            return true;
        }else {
            return false;
        }
    }

    public enum Level{
        BRONZE,
        SILVER,
        GOLD;
    }

      private   String _name;
      private   String _level;
    private boolean _verified = false;


    void set_verified (boolean verified){
        _verified = verified;
    }

    boolean get_verified(){
        return _verified;
    }

        void set_name(String name){
            _name = name;
        }
        String get_name(){
            return _name;
        }

        void set_level(String level){
            _level = level;
        }

        void set_level(Level level){
            _level = level.name();
        }

        String get_level(){
            return _level;
        }

}
