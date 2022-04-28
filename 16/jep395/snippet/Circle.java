record Circle(@FieldAnno Point center, @MethodAnno int radius) implements Comparable<Circle> {
    Circle {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
        if (radius > 5) {
            radius = 5;
        }
    }

    int diameter() {
        return this.radius * 2;
    }

    double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public int compareTo(Circle o) {
        return this.radius - o.radius;
    }
}