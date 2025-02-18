package package2;
class Animal{
    Animal(){
        System.out.println("Animal Constructor");
    }
    public void makeSound(){
        System.out.println("Making Sound");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog Constructor");
    }
    public void bark(){
        super.makeSound();
    }
}

public class Super {
    public static void main(String[] args){
        Dog dog = new Dog();
    }
}
