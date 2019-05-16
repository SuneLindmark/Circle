public class TestCircle {
    public static void main(String[] args) {
    Circle c1 = new Circle(0,0,3);
    Circle c2 = new Circle(0,0,3);
    System.out.println("Cirkel 1 har omkretsen " + c1.circumference());
    //c1.resize(2.5);
    System.out.println("Cirkel 2 har omkretsen " + c2.circumference());
    if (c1.equals(c2)) {
        System.out.println("lika");
    } else {
        System.out.println("Olika");
    }

    System.out.println(c1.toString());
        }
    }

