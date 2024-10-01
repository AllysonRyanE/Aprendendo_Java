public class Point {
    protected int x = 0, y = 0;

    public Point() {}
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void moveBy(int dx, int dy) {
        setX(this.x + dx);
        setY(this.y + dy);
    }

    public String toString() {
        return "("+ (this.x) + ", " + (this.y) + ")";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Point){
            Point target = (Point) obj;
            if (this.x ==  target.x && this.y == target.y){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
class ScreenPoint extends Point{
    public ScreenPoint(int x, int y){
        super(x, y);
        if (!validate(x, y)){
            throw new IllegalArgumentException ("Valores iniciais inválidos para screen points!");
        }
    }

    public boolean validate(int x, int y){
        if (x < 0 || x > 300 || y < 0 || y > 300){
            return false;
        }
        return true;
    }
    @Override
    public void setX(int x){
        if (validate(x, super.getY())){
            super.setX(x);
        }
        else{
            System.out.println("Valor de X não aceito para Screen Points!");
        }
    }
    @Override
    public void setY(int y){
        if (validate(super.getX(), y)){
            super.setY(y);
        }
        else{
            System.out.println("Valor de Y não aceito para Screen Points!");
        }
    }
}
