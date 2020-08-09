public class ConstructorMedio extends Builder{

    public ConstructorMedio() {}

    @Override
    public void construirNombre() {
        this.warr.setNombre("Espadachin");
    }

    @Override
    public void construirAtaque() {
        this.warr.setAtaque(5);
    }

    @Override
    public void construirAlcance() {
        this.warr.setAlcance(1);
    }
}
