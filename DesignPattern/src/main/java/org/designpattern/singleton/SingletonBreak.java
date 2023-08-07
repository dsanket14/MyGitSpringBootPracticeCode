package org.designpattern.singleton;

public class SingletonBreak {
    private static SingletonBreak singleton;
    private SingletonBreak(){
    }

    /* when singleton pattern is get called by multiple thread that time it failed
     to overcome this synchronised blocked is used */
    public static SingletonBreak getObject(){
        if(singleton==null){
            if(singleton==null){
               synchronized (SingletonBreak.class){
                   singleton= new SingletonBreak();
               }
            }
        }
        return singleton;
    }

}
