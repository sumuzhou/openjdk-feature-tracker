package openjdk.feature.tracker;

record Circle(Point center, int radius) {
    Circle {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
        if (radius > 5) {
            radius = 5;
        }
    }

    int diameter() {
        return radius * 2;
    }

    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}