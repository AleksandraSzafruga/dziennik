import java.util.Optional;

public class Demo {

    public static void main(String[] args) {


        Dziennik dziennik = new Dziennik();
        dziennik.addStudent(new Student("23456", "Jan", "Kowalski"));
        dziennik.addStudent(new Student("23754", "Janina", "Kowalski"));
        dziennik.addStudent(new Student("23458", "Jan", "Nowak"));
        dziennik.addStudent(new Student("20984", "Janina", "Nowak"));
        dziennik.addStudent(new Student("21234", "Janek", "Smith"));

        dziennik.removeStudentByIndex("23754");
        dziennik.removeStudentByIndex("21234");

        Optional<Student> pudełko = dziennik.returnStudent("20984");
        Student s = pudełko.get();

        System.out.println(s.getName());//sprawdza czy jest jakkaolwiek zawartość

        dziennik.sortStudentsByIndexNumber().forEach(System.out::println);

        System.out.println("something");

    }
}
