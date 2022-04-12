package openjdk.feature.tracker;

import io.vavr.collection.List;
import io.vavr.control.Try;

public class App {

    public static void main(String[] args) {
        Point origin = new Point(0, 0);

        log("We can declare a record by providing its components (type and name), ");
        log("and use implicit canonical constructor to create instances.\n\n");
        Circle aCircle = new Circle(origin, 1);

        log("The record class will have some auto-generated methods.\n");
        log("Data accessor: radius=%d\n", aCircle.radius());
        log("Hash code and equality: hashCode=%d\n", aCircle.hashCode());
        log("Well formatted string output:\n\t%s.\n", aCircle.toString());
        log("And we can add methods as traditional class, ");
        log("for example diameter=%d.\n\n", aCircle.diameter());

        log("We can leverage compact canonical constructor to validate the input args, ");
        Try<Circle> aFailure = Try.of(() -> new Circle(origin, 0));
        log("for example if radius <= 0 the constructor would throw exception: %s.\n", aFailure.getCause());
        log("And we can use it to normalize the input args, ");
        log("for example we can restrict the radius be shorter than 6, ");
        log("Circle((1, 1), 10) will become %s.\n", new Circle(origin, 10));
        log("Please note we don't need the `this.radius = radius` assignment.\n\n");

        log("We can declare local record type to make code more readable, ");
        log("for example the CircleAre declared in findCircleLargerThan method.\n");
        log("The result of findCircleLargerThan([((0,0), 1),((0,0), 2)])=%s.\n\n",
                findCircleLargerThan(
                        List.of(
                                new Circle(origin, 1),
                                new Circle(origin, 2)
                        ), 5
                ).toString()
        );

        log("Record classes are declared as final implicitly, but they can implement interfaces, ");
        log("for example we can compare two circles by implementing Comparable interface.\n");
        log("Now we can sort list of circles: %s",
                List.of(new Circle(origin, 2), new Circle(origin, 1)).sorted().toString()
        );

        // Annotation & Reflection
    }

    private static List<Circle> findCircleLargerThan(List<Circle> circles, double minArea) {
        record CircleArea(Circle circle, double area) {}

        return circles
                .map(it -> new CircleArea(it, it.area()))
                .filter(it -> it.area >= minArea)
                .map(it -> it.circle);
    }

    private static void log(String message, Object ... args) {
        System.out.printf(message, args);
    }

}
