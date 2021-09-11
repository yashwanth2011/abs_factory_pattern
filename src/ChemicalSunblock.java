public class ChemicalSunblock extends Sunblock {
    SunblockIngredientFactory ingredientFactory;

    public ChemicalSunblock(SunblockIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        prepare();
    }

    void prepare() {
        chemicals = ingredientFactory.prepareChemicals();
    }
}
