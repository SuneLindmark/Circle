public class Circle {
    double radious;
    double x;
    double y;

    public Circle(double x, double y, double radious) {
        this.x = x;
        this.y = y;
        this.radious = radious;
    }

    public double circumference() {
    return 2*Math.PI*this.radious;
    }

    public double Area(){
        return Math.PI*this.radious*this.radious;
    }

    public void move(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    public void resize(double scale) {
        this.radious = scale*this.radious;
    }

    public boolean equals(Circle c2) {
        if (this.x == c2.x && this.y == c2.y && this.radious == c2.radious) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "Circle at (" + this.x + "," + this.y + ") with radious " + this.radious;
    }
}

