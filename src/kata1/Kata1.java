package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Benjamín", "Medina", "Cabrera", new Date(94,12,21));
        System.out.println(person.getName() + " " + person.getSurname1() + " " + person.getSurname2() + " tiene " + person.getAge() + " años.");
    }
}
