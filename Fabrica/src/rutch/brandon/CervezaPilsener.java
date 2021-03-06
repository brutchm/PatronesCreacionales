package rutch.brandon;

public class CervezaPilsener implements ICerveza {
    private final String  NOMBRE = "La Brandon Cerveza";
    private final String TIPO = "Pilsener";
    private final int PORCENTAJE = 6;

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getTIPO() {
        return TIPO;
    }

    public int getPORCENTAJE() {
        return PORCENTAJE;
    }


    @Override
    public String obtenerInformacionCerveza() {
        return "La cerveza seleccionada tiene el nombre: "+getNOMBRE()+", cuyo tipo es: "+getTIPO()+" tiene un porcentaje de alcohol del "+getPORCENTAJE()+"%";
    }
}
