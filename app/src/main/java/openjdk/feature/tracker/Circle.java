package openjdk.feature.tracker;

record Circle(Point center, int radius, Color color) {
    Circle {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
        if (radius > 5) {
            radius = 5;
        }
    }
}