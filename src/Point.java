public class Point {
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point){
        int x = point.getX();
        int y= point.getY();
        return Math.sqrt(Math.pow(x-this.x,2) + Math.pow(y-this.y,2));
    }

    public double distance(){
        return this.distance(new Point(0,0));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
