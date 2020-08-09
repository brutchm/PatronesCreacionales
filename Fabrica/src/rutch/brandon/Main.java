package rutch.brandon;

import java.io.*;
import java.util.ArrayList;

public class Main {

    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static PrintStream out = System.out;

    public static void main(String[] args) throws IOException{
        int opcion = -1;
        do{
            opcion = menu();
            out.println(ejecutarOpcion(opcion));
        }while (opcion!= 0);

    }

    private static String ejecutarOpcion(int opcion) {
        String msj;
        IBebidaCerveza tmpCerveza;
        switch (opcion){
            case 1:
                tmpCerveza = new FabricaLaguer();
                msj = Cerveceria.crearCerveza(tmpCerveza);
                break;
            case 2:
                tmpCerveza = new FabricaPilsener();
                msj = Cerveceria.crearCerveza(tmpCerveza);
                break;
            case 3:
                tmpCerveza = new FabricaAle();
                msj = Cerveceria.crearCerveza(tmpCerveza);
                break;
            case 4:
                msj = Cerveceria.obtenerInformacion();
                break;
            case 0:
                msj = "Gracias por usar el programa";
                break;
            default:
                msj = "Digite una opción valida";
                break;
        }
        return msj;
    }

    private static int menu()throws IOException {
        out.println("Digite una opción");
        out.println("1. Cerveza Laguer");
        out.println("2. Cerveza Pilsener");
        out.println("3. Cerveza Ale");
        out.println("4. Listar todos");
        out.println("0. Salir");
        return Integer.parseInt(in.readLine());
    }
}
