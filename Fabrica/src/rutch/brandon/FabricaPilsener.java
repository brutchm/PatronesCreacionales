package rutch.brandon;

public class FabricaPilsener implements IBebidaCerveza {
    @Override
    public ICerveza crearCerveza() {
        CervezaPilsener tmpCervezaPilsener = new CervezaPilsener();
        return tmpCervezaPilsener;
    }
}
