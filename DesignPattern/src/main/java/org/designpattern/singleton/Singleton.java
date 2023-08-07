package org.designpattern.singleton;

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
