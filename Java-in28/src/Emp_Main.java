//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Emp_Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Employee employee = new Employee();
        employee.submitTimesheet();
        employee.bookVacation();
        employee.performWork();
        System.out.println();

        programmer programmer = new programmer();
        programmer.submitTimesheet();
        programmer.bookVacation();
        programmer.writeCode();
        programmer.performWork();
        System.out.println();

        Tester tester = new Tester();
        tester.testCode();
        tester.submitTimesheet();
        tester.bookVacation();
        tester.performWork();

    }
}