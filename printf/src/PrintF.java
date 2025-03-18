public class PrintF {

    public static void main(String[] args) {

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        String name = "Victoria";
        char firstLetter = 'V';
        int age = 36;
        double height = 170;
        boolean isStudent = true;

        System.out.printf("Hello %s \n", name);
        System.out.printf("Your name starts with a %c \n", firstLetter);
        System.out.printf("Your are %d years old \n", age);
        System.out.printf("Your are %.2f cm tall \n", height);
        System.out.printf("Your are Student: %b \n", isStudent);

        System.out.printf("%s is %d years old!", name, age);
    }
}
