package PatronesEstructurales.composite;

import java.util.ArrayList;

public class MenuVegetariano implements IMenu
{
    private ArrayList<IMenu> MenuAnidados;

    public void AnidarMenu(IMenu menu)
    {
        this.MenuAnidados.add(menu);
    }

    public IMenu ObtenerMenu(int pos)
    {
        return this.MenuAnidados.get(pos);
    }
}
