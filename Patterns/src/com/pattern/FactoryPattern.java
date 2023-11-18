package com.pattern;
//Main Interface
interface Product{
    void display();
}

//concurrent class that impl main interface
class ConcreteProduct1 implements Product{
    @Override
    public void display() {

    }
}

class ConcreteProduct2 implements Product{
    @Override
    public void display() {

    }
}

//factory interface
interface ProductFactory{
    Product createObject();
}

//concurrent factory classes to impl factory interface
class ConcreteFactory1 implements ProductFactory{
    @Override
    public Product createObject() {
        return new ConcreteProduct1();
    }
}

class ConcreteFactory2 implements ProductFactory{
    @Override
    public Product createObject() {
        return new ConcreteProduct2();
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        ProductFactory productFactory1= new ConcreteFactory1();
        Product product1=productFactory1.createObject();

        ProductFactory productFactory2= new ConcreteFactory1();
        Product product2=productFactory1.createObject();
    }
}
