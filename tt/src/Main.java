import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Person person = new Person(23);
       Student student = new Student();
       person.name="SHAA";
       person.age=18;
        person.printInfo();
        person.birtday();
        person.printInfo();
        person.id();
    }
}