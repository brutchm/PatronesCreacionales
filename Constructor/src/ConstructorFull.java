public class ConstructorFull extends Builder{

    public ConstructorFull() {}

    @Override
    public void construirNombre() {
        this.warr.setNombre("Arquero");
    }

    @Override
    public void construirAtaque() {
        this.warr.setAtaque(3);
    }

    @Override
    public void construirAlcance() {
        this.warr.setAlcance(5);
    }
}
