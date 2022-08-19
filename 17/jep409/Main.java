///usr/bin/env jbang "$0" "$@" ; exit $?

//JAVA 17+

public class Main {
    public static void main(String[] args) {
        log("Hello JEP409");
    }

    private static void log(String message, Object ... args) {
        System.out.printf(message, args);
    }
}