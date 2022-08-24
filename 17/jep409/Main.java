import java.util.Arrays;

///usr/bin/env jbang "$0" "$@" ; exit $?

//JAVA 17+
//SOURCES snippet/*.java

public class Main {
    public static void main(String[] args) {
        log("There are only three direct implementations of the Command interface, which is guaranteed by the compiler.\n\n");

        log("SuperUserCommand is prohibit to be extended because it's declared as final.\n");
        executeCommand(new SuperUserCommand());

        log("PrivilegeCommand can have limited extentions, but they must declared by definition.\n");
        executeCommand(new PrivilegeCommand());

        log("NormalCommand can be extended freely as an ordinary class.\n");
        executeCommand(new NormalCommand());
        log("An interesting fact: the keyword `non-sealed` is the first **hyphenated keyword** introduced in Java.\n\n");

        log("There are two reflection APIs added in order to retrieve info of sealed class:\n");
        log("> Class<?>[] getPermittedSubclasses() - ");
        log("The permitted subclasses of Command are: %s\n", Arrays.toString(Command.class.getPermittedSubclasses()));
        log("> boolean isSealed() - ");
        log("Is the Command sealed? %s\n", Command.class.isSealed());
    }

    private static void log(String message, Object ... args) {
        System.out.printf(message, args);
    }

    private static void executeCommand(Command command) {
        command.executeMe();
    }
}
