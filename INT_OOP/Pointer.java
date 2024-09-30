public class Pointer {
    private int x = 0, y = 0;

    public Pointer() {}
    public Pointer(int x, int y){
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
        if (this.x >= 0 && this.x <= 400){
            if (x >= 0  && x <= 400){
                this.x = x;
            }
            else{
                System.out.println("O valor de X deve estar entre 0 e 400 (incluindo ambos)!");
            }
        }
        else{
            System.out.println("Valor atual inválido");
        }
    }
    public void setY(int y) {
        if (this.y >= 0 && this.y <= 400){
            if (y >= 0  && y <= 400){
                this.y = y;
            }
            else{
                System.out.println("O valor de Y deve estar entre 0 e 400 (incluindo ambos)!");
            }
        }
        else{
            System.out.println("Valor atual inválido");
        }
    }
    public void moveBy(int dx, int dy) {
        setX(this.x + dx);
        setY(this.y + dy);
    }
}

