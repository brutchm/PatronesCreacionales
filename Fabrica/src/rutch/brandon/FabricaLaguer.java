package rutch.brandon;

public class FabricaLaguer implements IBebidaCerveza {
    @Override
    public ICerveza crearCerveza() {
        CervezaLaguer tmpCervezaLaguer = new CervezaLaguer();
        return tmpCervezaLaguer;
    }
}
