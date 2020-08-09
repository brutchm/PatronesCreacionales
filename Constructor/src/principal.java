import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class principal {

    static PrintStream out = System.out;
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<guerrero> guerreros = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Director objDirector = new Director();
        Builder base  = new ConstructorBajo();
        Builder medio = new ConstructorMedio();
        Builder full  = new ConstructorFull();

        int opcion;


        do{
            out.println("DIgite una opcion");
            out.println("1. Bajo");
            out.println("2. Medio");
            out.println("3. Alto");
            out.println("4. Ver todos");
            out.println("0. Salir");
            out.println("Para generar un guerrero");
            opcion= Integer.parseInt(in.readLine());

            switch (opcion){
                case 1:
                    objDirector.construir( base );
                    guerrero cocheBase = base.getCarro();
                    mostrarCaracteristicas( cocheBase );
                    guerreros.add(cocheBase);
                    break;
                case 2:
                    objDirector.construir( medio );
                    guerrero cocheMedio = medio.getCarro();
                    mostrarCaracteristicas( cocheMedio );
                    guerreros.add(cocheMedio);
                    break;
                case 3:
                    objDirector.construir( full );
                    guerrero cocheFull = full.getCarro();
                    mostrarCaracteristicas( cocheFull );
                    guerreros.add(cocheFull);
                    break;
                case 4:
                    for (guerrero dato: guerreros) {
                        out.println(dato.toString());
                    }
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

    public static void mostrarCaracteristicas( guerrero coche ) {
        System.out.println( "Nombre: " + coche.getNombre() );
        System.out.println( "Ataque: " + coche.getAtaque() );
        System.out.println( "Alcance: " + coche.getAlcance() );
        System.out.println("=================================== \n");
    }
}