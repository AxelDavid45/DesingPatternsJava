package PatronesEstructurales.composite;


public class Main {
    public static void main(String[] args) {
        //Creamos el menu principal

        MenuVegetariano menu = new MenuVegetariano();

        MenuVegetariano menu1 = new MenuVegetariano();
        MenuVegetariano menu2 = new MenuVegetariano();

        MenuVegetariano menu3 = new MenuVegetariano();
        MenuVegetariano menu4 = new MenuVegetariano();

        MenuVegetariano menu5 = new MenuVegetariano();


        menu.AnidarMenu(menu1);
        menu.AnidarMenu(menu2);

        menu3.AnidarMenu(menu4);

        menu4.AnidarMenu(menu5);

    }
}
