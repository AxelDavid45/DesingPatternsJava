package PatronesCreacionales.prototype;

public class Enemy {
    private float PosX, PosY;
    private String source;

    public Enemy (String source, float posX, float posY) {
        this.source = source;
        this.PosX = posX;
        this.PosY = posY;
    }

    //Crear el constructor que clona el objeto e implementa el patron PatronesCreacionales.prototype
    public Enemy (Enemy base) {
        this.source = base.getSource();
        this.PosX = base.getPosX();
        this.PosY = base.getPosY();
    }

    public float getPosX() {
        return PosX;
    }

    public void setPosX(float posX) {
        PosX = posX;
    }

    public float getPosY() {
        return PosY;
    }

    public void setPosY(float posY) {
        PosY = posY;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


    @Override
    public String toString() {
        return "fuente " + this.getSource() + " ("+this.getPosX()+","+ this.getPosY()+")";
    }
}
