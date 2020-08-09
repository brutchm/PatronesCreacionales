public abstract class Builder {
    protected guerrero warr;
    public guerrero getCarro() {
        return this.warr;
    }

    public void crearNuevoGuerrero() {
        this.warr = new guerrero();
    }


    // Métodos que deberán ser construídos por las clases que hereden de ésta
    public abstract void construirNombre();
    public abstract void construirAtaque();
    public abstract void construirAlcance();

}
