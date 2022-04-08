package openjdk.feature.tracker;

import io.vavr.control.Try;

public class App {

    public static void main(String[] args) {
        log("We can declare a record by providing its components (type and name), ");
        log("and use implicit canonical constructor to create instances.\n\n");
        Circle aCircle = new Circle(new Point(0, 0), 1, Color.RED);

        log("The record will generate some methods for us.\n");
        log("Data accessor: radius=%d\n", aCircle.radius());
        log("Hash code and equality: hashCode=%d\n", aCircle.hashCode());
        log("Well formatted string output:\n\t%s.\n\n", aCircle.toString());

        log("We can leverage compact canonical constructor to validate the input args, ");
        Try<Circle> aFailure = Try.of(() -> new Circle(new Point(1, 1), 0, Color.BLUE));
        log("for example if radius <= 0 the constructor would throw exception: %s.\n", aFailure.getCause());
        log("And we can use it to normalize the input args, ");
        log("for example we can restrict the radius be shorter than 6, ");
        log("Circle((1, 1), 10, RED) will become %s.\n", new Circle(new Point(1, 1), 10, Color.RED));
        log("Please note we don't need the `this.radius = radius` assignment.\n\n");
    }

    private static void log(String message, Object ... args) {
        System.out.printf(message, args);
    }

}
