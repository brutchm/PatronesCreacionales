public class Director {
    public Director() {

    }

    public void construir( Builder builder ){
        builder.crearNuevoGuerrero();
        builder.construirNombre();
        builder.construirAlcance();
        builder.construirAtaque();
    }
}
