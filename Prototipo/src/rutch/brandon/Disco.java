package rutch.brandon;

public  abstract class Disco {
    String capacidad;
    String marca;
    String velocidadTransferencia;
    String tipo;
    String conexion;


    public abstract Disco clone();

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVelocidadTransferencia() {
        return velocidadTransferencia;
    }

    public void setVelocidadTransferencia(String velocidadTransferencia) {
        this.velocidadTransferencia = velocidadTransferencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "capacidad='" + capacidad + '\'' +
                ", marca='" + marca + '\'' +
                ", velocidadTransferencia='" + velocidadTransferencia + '\'' +
                ", tipo='" + tipo + '\'' +
                ", conexion='" + conexion + '\'' +
                '}';
    }
}
