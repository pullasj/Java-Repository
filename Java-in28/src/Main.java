//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Person person = new Person();
        System.out.println("Name: "+person.name+" age: "+person.age);

        Person person1 = new Person("Test");
        System.out.println("Name: "+person1.name+" age: "+person1.age);

        Person person2 = new Person(32);
        System.out.println("Name: "+person2.name+" age: "+person2.age);

        Person person3 = new Person("Test",25);
        System.out.println("Name: "+person3.name+" age: "+person3.age);
    }
}