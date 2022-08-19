///usr/bin/env jbang "$0" "$@" ; exit $?

//JAVA 17+
//SOURCES snippet/*.java

public class Main {
    public static void main(String[] args) {
        log("There are only three implementations of the Command interface, which is guaranteed by the compiler.\n\n");

        log("SuperUserCommand is prohibit to be extended because it's declared as final.");
        executeCommand(new SuperUserCommand());

        log("PrivilegeCommand can have limited extentions, but they must declared by definition.");
        executeCommand(new PrivilegeCommand());

        log("NormalCommand can be extended freely, but all the descendants are of type NormalCommand, not Command.");
        executeCommand(new NormalCommand());
        log("Is CustomCommand an instance of Command? %s\n", (new CustomCommand()) instanceof Command);
    }

    private static void log(String message, Object ... args) {
        System.out.printf(message, args);
    }

    private static void executeCommand(Command command) {
        command.executeMe();
    }
}
