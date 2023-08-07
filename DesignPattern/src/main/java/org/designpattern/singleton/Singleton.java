package org.designpattern.singleton;
/*
Use the Singleton pattern when a class in your program should have just a single instance available
to all clients; for example, a single database object shared by different parts of the program.
The Singleton pattern disables all other means of creating objects of a class except for the special
creation method
*/
public class Singleton {

    /* private static Singleton singleton= new Singleton;
    above method of object creation is called eager object creation
    because at stating object is get created*/
    private static Singleton singleton;
    private Singleton(){
    }
    /*this type of object creation is called as lazy obj creation
    because in this object is get created when it required not in the initial phase*/
    public static Singleton getObject(){
        if(singleton==null){
            singleton= new Singleton();
        }
        return singleton;
    }

}
