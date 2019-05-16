public class testKomplex {
    public static void main(String[] args) {
        Komplex z1 = new Komplex(2,3);
            Komplex z2 = new Komplex (4,-2);

            Komplex z3 = z1.add(z2);
        System.out.println(z3);
        if (z1.equals(z2)) {
            System.out.println(z1 + " och "+ z2 + " är lika");
        } else {
            System.out.println(z1 + " och "+ z2 + " är olika");
        }
    }
}
