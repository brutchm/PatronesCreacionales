package rutch.brandon;

public class FabricaHamburgusa implements IHamburguesa {
    @Override
    public Hamburguesa crearHamburguesa(String iUno, String iDos, String iTres) {
        Hamburguesa tmpHamburguesa;
        if(iTres!= null){
            tmpHamburguesa = new Suprema(iUno, iDos, iTres);
        }else if (iDos!= null){
            tmpHamburguesa= new Queso(iUno, iDos);
        }else{
            tmpHamburguesa= new Sencilla(iUno);
        }
        return tmpHamburguesa;
    }
}
