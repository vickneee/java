public class Methods {

    public static void main(String[] args) {

        String name = "John";
        int age = 30;

        happyBirthday(name, age);
        happyBirthday(name, age);
        test();

    }

    static void happyBirthday(String name, int test) {
        System.out.println("Happy Birthday!");
        System.out.printf("Happy Birthday to you %s! \n", name);
        System.out.printf("You are now %d year old! \n", test);
    }

    static void test() {
        System.out.println("This is a test 1!");
        System.out.println("This is a test 2!");
        System.out.println("This is a test 3!");
    }
}
