///usr/bin/env jbang "$0" "$@" ; exit $?

//JAVA 14+
//SOURCES snippet/*.java

public class Main {
    public static void main(String[] args) {
        var day = Workday.FRIDAY;
        
        log("> statementWithColon\n");
        log("I can't feel the Friday: %s\n\n", statementWithColon(day));

        log("> statementWithArrow\n");
        log("I can't feel the Friday: %s\n\n", statementWithArrow(day));

        log("> expressionWithArrow\n");
        log("My feeling of Friday is: %s\n\n", expressionWithArrow(day));

        log("Last but not least, we can't use flow-jumping keywords in the switch expressions, such as `continue` and `break`, ");
        log("because they will yield nothing which break the syntax of assignment.\n");
    }

    private static void log(String message, Object ... args) {
        System.out.printf(message, args);
    }

    private static String statementWithColon(Workday workday) {
        log("Old fashion way to use switch clauses, don't forget breaking!!\n");
        var emoji = "🙃";
        switch (workday) {
            case MONDAY:
            case TUESDAY:
                emoji = "😩";
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
        log("The right arrow is the new form of switch label, you can omit the break keyword.\n");
        var emoji = "🙃";
        switch (workday) {
            case MONDAY, TUESDAY -> emoji = "😩";
            case WEDNESDAY -> emoji = "🙄";
            case THURSDAY -> emoji = "😏";
        };
        log("Again, there's no alert thrown if you forget the happy Friday.\n");
        return emoji;
    }

    private static String expressionWithArrow(Workday workday) {
        log("We can even use the new form of switch as an expression, which means it can be used in assignment directly.\n");
        log("The compiler will complain now if the exhaustiveness isn't carefully considered.\n");
        log("And we can use yield **identifier** (not a keyword) to generate a value by a code block.\n");
        return switch (workday) {
            case MONDAY, TUESDAY -> "😩";
            case WEDNESDAY -> "🙄";
            case THURSDAY -> "😏";
            case FRIDAY -> {
                yield "🥳";
            }
        };
    }
}
