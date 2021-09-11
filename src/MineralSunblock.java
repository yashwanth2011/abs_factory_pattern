public class MineralSunblock extends Sunblock {
    SunblockIngredientFactory ingredientFactory;

    public MineralSunblock(SunblockIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        prepare();
    }

    void prepare() {
        minerals =  ingredientFactory.prepareMinerals();
    }
}