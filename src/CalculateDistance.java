public class CalculateDistance {
    public static void main(String[] args) {

        Point p1 = new Point(2,4);
        Point p2 = new Point(5,8);
        double d1 = p1.distance();
        double d2 = p1.distance(p2);

        System.out.println(d1 + "\n" + d2);

    }
}
