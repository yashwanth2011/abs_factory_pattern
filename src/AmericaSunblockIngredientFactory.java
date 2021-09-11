public class AmericaSunblockIngredientFactory implements SunblockIngredientFactory {

    public Chemicals prepareChemicals() {
        return new ZincOxide();
    }

    public Minerals prepareMinerals() {
        return new AloeveraGel();
    }

    public Oils prepareOils(){
        return new WalnutOil();
    }
}
