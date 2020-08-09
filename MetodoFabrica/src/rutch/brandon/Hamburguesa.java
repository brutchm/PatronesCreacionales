package rutch.brandon;

public abstract class Hamburguesa {
    protected String nombre;
    protected String ingredianteUno;
    protected String ingredienteDos;
    protected String ingredienteTres;

    public Hamburguesa(String ingredianteUno, String ingredienteDos, String ingredienteTres) {
        this.nombre = "Hamburguesa";
        this.ingredianteUno = ingredianteUno;
        this.ingredienteDos = ingredienteDos;
        this.ingredienteTres = ingredienteTres;
    }

    public Hamburguesa() {
        this.nombre="Hamburguesa";
        this.ingredianteUno="";
        this.ingredienteDos = "";
        this.ingredienteTres="";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredianteUno() {
        return ingredianteUno;
    }

    public void setIngredianteUno(String ingredianteUno) {
        this.ingredianteUno = ingredianteUno;
    }

    public String getIngredienteDos() {
        return ingredienteDos;
    }

    public void setIngredienteDos(String ingredienteDos) {
        this.ingredienteDos = ingredienteDos;
    }

    public String getIngredienteTres() {
        return ingredienteTres;
    }

    public void setIngredienteTres(String ingredienteTres) {
        this.ingredienteTres = ingredienteTres;
    }

    public abstract String obtenerInforamcion();
}
