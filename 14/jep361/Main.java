///usr/bin/env jbang "$0" "$@" ; exit $?

//JAVA 14+
//SOURCES snippet/*.java

public class Main {
    public static void main(String[] args) {
        var day = Workday.FRIDAY;
        
        log("> statementWithColon\n");
        log("My feelings of Friday is: %s\n", statementWithColon(day));
    }

    private static void log(String message, Object ... args) {
        System.out.printf(message, args);
    }

    private static String statementWithColon(Workday workday) {
        log("Old fashion way to use switch clauses, don't forget breaking!!\n");
        var emoji = "🙃";
        switch (workday) {
            case MONDAY:
                emoji = "😩";
                break;
            case TUESDAY:
                emoji = "🥱";
                break;
            case WEDNESDAY:
                emoji = "🙄";
                break;
            case THURSDAY:
                emoji = "😏";
                break;
        }
        log("As you can see, there's no alert thrown if you forget the happy Friday.\n");
        return emoji;
    }

    private static String statementWithArrow(Workday workday) {
        return "";
    }

    private static String expressionWithColon(Workday workday) {
        return "";
    }

    private static String expressionWithArrow(Workday workday) {
        return "";
    }
}
