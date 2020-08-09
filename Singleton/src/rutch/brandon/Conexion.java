package rutch.brandon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Conexion {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;


    private String url;
    private static Conexion miConexion = null;

    private Conexion(String url) {
        this.url = url;
    }

    public static Conexion getMiConexion() throws IOException {
        if (miConexion==null){
            out.println("No existe una conexion crearemos una");
            miConexion=  definirURL();
            out.println("Su conexion es: "+miConexion.getUrl()+" y se ubica en la posicion de memoria: "+miConexion.hashCode());
            return miConexion;
        }
        out.println("Existe una conexion es la siguiente:"+miConexion.getUrl()+" y se ubica en la posicion de memoria: "+miConexion.hashCode());
        return miConexion;
    }

    private static Conexion definirURL()throws IOException {
        out.println("Digite el url de coneccion");
        miConexion= new Conexion(in.readLine());
        return miConexion;
    }

    public String getUrl() {
        return url;
    }

    private void setUrl(String purl) {
        this.url = purl;
    }

    public static void setMiConexion(Conexion miConexion) {
        Conexion.miConexion = miConexion;
    }
}
