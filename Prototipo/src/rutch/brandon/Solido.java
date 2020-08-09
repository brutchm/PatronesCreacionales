package rutch.brandon;

public class Solido extends Disco {

    public Solido(String capacidad, String marca, String velocidadTransferencia, String tipo, String conexion) {
        this.capacidad= capacidad;
        this.marca= marca;
        this.velocidadTransferencia=velocidadTransferencia;
        this.tipo=tipo;
        this.conexion=conexion;
    }

    @Override
    public Disco clone() {
        return new Solido(this.getCapacidad(), this.getMarca(), this.velocidadTransferencia,this.tipo, this.getConexion());
    }

    @Override
    public String toString() {
        return "Solido{" +
                "capacidad='" + capacidad + '\'' +
                ", marca='" + marca + '\'' +
                ", velocidadTransferencia='" + velocidadTransferencia + '\'' +
                ", tipo='" + tipo + '\'' +
                ", conexion='" + conexion + '\'' +
                '}';
    }
}
