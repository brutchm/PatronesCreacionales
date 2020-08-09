public class guerrero {
    private String nombre;
    private int alcance;
    private int ataque;


    public guerrero(String nombre, int alcance, int ataque) {
        this.nombre = nombre;
        this.alcance = alcance;
        this.ataque = ataque;
    }

    public guerrero() {
        this.nombre="na";
        this.alcance=0;
        this.ataque=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "guerrero{" +
                "nombre='" + nombre + '\'' +
                ", alcance=" + alcance +
                ", ataque=" + ataque +
                '}';
    }
}
