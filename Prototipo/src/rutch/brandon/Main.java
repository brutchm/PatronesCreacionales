package rutch.brandon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Disco> discos = new ArrayList<>();
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
	    int opcion;
	    do {
	        out.println("Digite una opcion");
	        out.println("1. Disco solido");
	        out.println("2. Disco magnetico");
	        out.println("0. Salir");
	        opcion = Integer.parseInt(in.readLine());
	        switch (opcion){
                case 1:
                    menuSolido();
                    break;
                case 2:
                    menuMagnetico();
                    break;
                case 0:
                    out.println("Gracias por usar el programa");
                    break;
                default:
                    out.println("Digite una opcion valida");
                    break;
            }
        }while (opcion!=0);
    }

    private static void menuMagnetico()throws IOException {
        String capacidad;
        String marca;
        String velocidadTransferencia;
        String tipo;
        String conexion;
        int cantidad;

        out.println("Digte la capacidad");
        capacidad= in.readLine();
        out.println("Digte la marca");
        marca= in.readLine();
        out.println("Digte la velocidad de tranferencia");
        velocidadTransferencia= in.readLine();
        out.println("Digte la tipo");
        tipo= in.readLine();
        out.println("Digte la conexion");
        conexion= in.readLine();

        Disco mag =  new Magnetico(capacidad, marca, velocidadTransferencia, tipo, conexion);

        out.println("Digite la cantidad");
        cantidad= Integer.parseInt(in.readLine());

        for (int i = 0; i <cantidad ; i++) {
            discos.add(mag.clone());
            imprimir();
        }
    }

    private static void imprimir() {
        for (Disco dato: discos) {
            out.println(dato.toString());
        }
    }

    private static void menuSolido() throws IOException{
        String capacidad;
        String marca;
        String velocidadTransferencia;
        String tipo;
        String conexion;
        int cantidad;

        out.println("Digte la capacidad");
        capacidad= in.readLine();
        out.println("Digte la marca");
        marca= in.readLine();
        out.println("Digte la velocidad de tranferencia");
        velocidadTransferencia= in.readLine();
        out.println("Digte la tipo");
        tipo= in.readLine();
        out.println("Digte la conexion");
        conexion= in.readLine();
        
        Disco solido =  new Solido(capacidad, marca, velocidadTransferencia, tipo, conexion);
        
        out.println("Digite la cantidad");
        cantidad= Integer.parseInt(in.readLine());

        for (int i = 0; i <cantidad ; i++) {
            discos.add(solido.clone());
            imprimir();
        }
    }
}
