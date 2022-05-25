///usr/bin/env jbang "$0" "$@" ; exit $?

//JAVA 16+

public class Main {

    public static void main(String[] args) {
        log("With extended instanceof operator, now we can cast object implicitly.\n");
        log("Let's use instanceof to do some tricks: \n");
        Object obj = "Hello David";
        if (obj instanceof String s) {
            log("Just said hi to %s\n", s.split(" ")[1]);
        }

        System.out.flush();
    }

    private static void log(String message, Object ... args) {
        System.out.printf(message, args);
    }
}
