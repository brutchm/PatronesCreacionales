package rutch.brandon;

public class Sencilla extends Hamburguesa {

    public Sencilla() {
    }

    public Sencilla(String ingredianteUno) {
        setIngredianteUno(ingredianteUno);
        setNombre("Hamburguesa sencilla");
    }

    @Override
    public String obtenerInforamcion() {
        return "Nombre: "+getNombre()+", es del tipo hamburguesa sencilla, sus ingrediente son: "+ingredianteUno+".";
    }


}
