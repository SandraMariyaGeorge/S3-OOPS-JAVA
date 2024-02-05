abstract class shape {
    abstract void numberofsides();
}

class rectangle extends shape {
    void numberofsides() {
        System.out.println("The number of sides of rectangle is 4");
    }
}

class triangle extends shape {
    void numberofsides() {
        System.out.println("The number of sides of triangle is 3");
    }
}

class hexagon extends shape {
    void numberofsides() {
        System.out.println("The number of sides of hexagon is 6");
    }
}

class abstract_class {
    public static void main(String a[]) {
        rectangle r = new rectangle();
        r.numberofsides();
        triangle t = new triangle();
        t.numberofsides();
        hexagon h = new hexagon();
        h.numberofsides();
    }
}