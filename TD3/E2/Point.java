/**
 * Point
 */
import java.lang.Math;
public class Point {
    private double x;
    private double y;
    /**
     * Constructeur par defaut
     */
    public Point(){}
    /**
     * Constructeur avec les coordonnees
     * @param x
     * @param y
     */
    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    /**
     * Constructeur avec comme parametre un point
     * @param p
     */
    public Point(Point p){
        new Point(p.x,p.y);
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return y;
    }
    public double distance(double x,double y){
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)) ;
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2)) ;
    }
    public static double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
    public double deplacer(double x, double y){
        return x += y;
    }
    public Point translate(double dx, double dy){
        return new Point(deplacer(this.x, dx), deplacer(this.y, y));
    }
    public String toString() {
        return "("+this.x+","+this.y+")";
    }
}