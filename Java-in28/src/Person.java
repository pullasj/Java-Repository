public class Person {
    String name;
    int age;
    Person(){
        this.age = -1;
        this.name ="";
    }

    Person(int age){
        this.age = age;
    }

    Person(String name){
        this.name = name;
    }

    Person(String name, int age){
        this.age = age;
        this.name = name;
    }
}
