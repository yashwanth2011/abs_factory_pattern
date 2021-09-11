public class IndiaSunblockIngredientFactory implements SunblockIngredientFactory {

    public Chemicals prepareChemicals() {
        return new TitaniumOxide();
    }

    public Minerals prepareMinerals() {
        return new Turmeric();
    }

    public Oils prepareOils(){
        return new SaffronOil();
    }

}
