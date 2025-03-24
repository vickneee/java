public class Person {

    String first;
    String last;
    int age;

    // Constructor
    Person(String first, String last, int age) {
        this.first = first;
        this.last = last;
        this.age = age;
    }

    void showName() {
        System.out.println(this.first + " " + this.last);
    }
}
