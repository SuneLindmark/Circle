public class Komplex {
    double a;
    double b;

    public Komplex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Komplex add(Komplex z2) {
        double a = this.a + z2.a;
        double b = this.b + z2.b;
        Komplex z3 = new Komplex(a,b);
        return z3;
        return new Komplex(this.a + z2.a, this.b + z2.b)
    }

}
