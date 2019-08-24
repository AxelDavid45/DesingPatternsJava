package PatronesCreacionales.AbstractFactory;

public interface IAbstractFactory {
    //Aqui se van a definir las familias de objetos que las fabricas podran crear
    //Las fabricas van a poder crear computadoras y no va importar de que tipo ya que
    // implementamos interfaces utilizando principios SOLID

    IComputadora CrearComputadora();

    ITablet CrearTablet();

}
