package rutch.brandon;

import java.util.ArrayList;

public class Cerveceria {
    private static ArrayList<ICerveza> cervezas = new ArrayList<>();

    public static String crearCerveza(IBebidaCerveza tmpCerveza){
        ICerveza cerveza = tmpCerveza.crearCerveza();
        agregarCerveza(cerveza);
        return cerveza.obtenerInformacionCerveza();
    }

    private static void agregarCerveza(ICerveza cerveza){
        cervezas.add(cerveza);
    }

    public static String obtenerInformacion(){
        String msDatos="";

        for (int i=0 ; i < cervezas.size() ; i++)
            msDatos = msDatos + cervezas.get(i).obtenerInformacionCerveza() + "\n";
        return msDatos;
    }
}
