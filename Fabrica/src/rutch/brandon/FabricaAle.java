package rutch.brandon;

public class FabricaAle implements IBebidaCerveza {

    @Override
    public ICerveza crearCerveza() {
        CervezaAle tmpCervezaAle = new CervezaAle();
        return tmpCervezaAle;
    }
}
