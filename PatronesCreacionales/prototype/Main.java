package PatronesCreacionales.prototype;

public class Main {
    public static void main(String[] args) {

        //Creamos el objeto base
        Enemy base = new Enemy("../imgs/alien/base.png", 30, 100);

        Enemy enemy1 = new Enemy(base);
        enemy1.setPosX((float)50.2);

        System.out.println(base);
        System.out.println(enemy1);
    }
}
