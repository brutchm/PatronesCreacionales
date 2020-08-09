package rutch.brandon;

public class Magnetico extends Disco {
    public Magnetico(String capacidad, String marca, String velocidadTransferencia, String tipo, String conexion) {
        this.capacidad= capacidad;
        this.marca= marca;
        this.velocidadTransferencia=velocidadTransferencia;
        this.tipo=tipo;
        this.conexion=conexion;
    }

    @Override
    public Disco clone() {
        return new Magnetico(this.getCapacidad(), this.getMarca(), this.velocidadTransferencia, this.tipo, this.getConexion());
    }

    @Override
    public String toString() {
        return "Magnetico{" +
                "capacidad='" + capacidad + '\'' +
                ", marca='" + marca + '\'' +
                ", velocidadTransferencia='" + velocidadTransferencia + '\'' +
                ", tipo='" + tipo + '\'' +
                ", conexion='" + conexion + '\'' +
                '}';
    }
}
