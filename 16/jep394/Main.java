///usr/bin/env jbang "$0" "$@" ; exit $?

//JAVA 16+

public class Main {

    public static void main(String[] args) {
        log("With extended instanceof operator, now we can cast object implicitly.\n");
        log("Let's use instanceof to do some tricks: \n");
        Object obj = "Hello World";
        if (obj instanceof String s) {
            log("Just said hello to %s\n", s.split(" ")[1]);
        }

        log("The pattern variable is in scope where it has definitely matched, ");
        log("we can use it in joint if condition safely. \n");
        log("For example we can check length of string following the instanceof keyword: \n");
        if (obj instanceof String s && s.length() > 5) {
            log("Wow, I just said %s.\n", s);
        }
        
        log("Field shadowing is more interesting and tricky because of pattern variables, ");
        log("consider we have class with a field bar but also declare a pattern variable named bar in a method: \n");
        var foo = new Main.Foo("The_value_in_field");
        foo.test("The_value_in_method_arg");
        foo.test(1);
    }

    static class Foo {
        String bar;
        public Foo(String bar) {
            this.bar = bar;
        }
        public void test(Object o) {
            if (o instanceof String bar) {
                log("bar=%s in instanceof block.\n", bar);
            } else {
                log("bar=%s out of instanceof block.\n", bar);
            }
        }
    }

    private static void log(String message, Object ... args) {
        System.out.printf(message, args);
    }
    
}
