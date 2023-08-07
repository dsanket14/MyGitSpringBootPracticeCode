package org.designpattern;

import org.designpattern.singleton.Singleton;
import org.designpattern.singleton.SingletonBreak;

public class Main {
    public static void main(String[] args) {
      Singleton obj1= Singleton.getObject();
        Singleton obj2= Singleton.getObject();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println("Singleton break");

        SingletonBreak singletonBreak1= SingletonBreak.getObject();
        SingletonBreak singletonBreak2= SingletonBreak.getObject();
        System.out.println(singletonBreak1.hashCode());
        System.out.println(singletonBreak2.hashCode());
    }
}