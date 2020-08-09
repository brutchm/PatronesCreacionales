package rutch.brandon;

public class Queso extends Hamburguesa {
    public Queso(String ingredianteUno, String ingredienteDos) {
        setIngredianteUno(ingredianteUno);
        setIngredienteDos(ingredienteDos);
        setNombre("Hamburguesa con queso");
    }


    @Override
    public String obtenerInforamcion() {
        return "Nombre: "+getNombre()+", es del tipo hamburguesa con queso, sus ingrediente son: "+ingredianteUno+", "+ingredienteDos+"." ;
    }
}
