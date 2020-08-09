package rutch.brandon;

public class Suprema extends Hamburguesa{
    public Suprema(String ingredianteUno, String ingredienteDos, String ingredienteTres) {
        super(ingredianteUno, ingredienteDos, ingredienteTres);
    }

    @Override
    public String obtenerInforamcion() {
        return "Nombre: "+getNombre()+", es del tipo hamburguesa suprema, sus ingrediente son: "+ingredianteUno+", "+ingredienteDos+", "+ingredienteTres+".";
    }
}
