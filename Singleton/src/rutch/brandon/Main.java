package rutch.brandon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args)throws IOException {
        int opcion;

        do {
            out.println("Digite una opcion");
            out.println("1. Crear conexion");
            out.println("2. Obtener conexion");
            out.println("0. Salir");
            opcion = Integer.parseInt(in.readLine());
            switch (opcion) {
                case 1:
                    Conexion.getMiConexion();
                    break;
                case 2:
                    Conexion.getMiConexion();
                    break;
                case 0:
                    out.println("Gracias por usar el programa");
                    break;
                default:
                    out.println("Digite una opcion valida");

            }
        }while (opcion!=0);

    }
}
