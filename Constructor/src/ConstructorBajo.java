public class ConstructorBajo extends Builder{

    public ConstructorBajo(){}


    @Override
    public void construirNombre() {
        this.warr.setNombre("Lancero");
    }

    @Override
    public void construirAtaque() {
        this.warr.setAtaque(2);
    }

    @Override
    public void construirAlcance() {
        this.warr.setAlcance(2);
    }
}
