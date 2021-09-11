public class OilSunblock extends Sunblock {
    SunblockIngredientFactory ingredientFactory;

    public OilSunblock(SunblockIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        prepare();
    }

    void prepare() {
        oils = ingredientFactory.prepareOils();
    }
}
