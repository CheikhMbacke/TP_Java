/**
 * TestPoint
 */
public class TestPoint {

    public static void main(String[] args) {
        Point p = new Point(2, 5);
        /**
         * La distance avec la methode distance(x,y)
         */
        System.out.println(p.distance(3, 3));
        /**
         * La distance avec la methode distance(Point)
         */
        System.out.println(p.distance(new Point(3, 3)));
        /**
         * La distance avec la methode statique distance
         */
        System.out.println(Point.distance(p.getX(),p.getY(), 3, 3));
        /**
         * La methode deplacer(x,y)
         */
        System.out.println(p.toString()); 
        p.deplacer(p.getX(), 2);
        System.out.println(p.toString()); 
        /**
         * La methode translate(dx,dy)
         */
        System.out.println(p.toString()); 
        p.translate(3.3, 5.3);
        System.out.println(p.toString());
    }
}