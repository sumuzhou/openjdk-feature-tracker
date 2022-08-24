///usr/bin/env jbang "$0" "$@" ; exit $?

//JAVA 14+
//SOURCES snippet/*.java

public class Main {
    public static void main(String[] args) {
        log("Hello JEP361");
    }

    private static void log(String message, Object ... args) {
        System.out.printf(message, args);
    }
}
