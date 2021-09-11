public class IndiaSunblockStore extends SunblockStore {

    protected Sunblock prepareSunblock(String item) {
        Sunblock sunblock = null;
        SunblockIngredientFactory sunblockIngredientFactory = new IndiaSunblockIngredientFactory();
        if (item.equals("chemical")) {
            sunblock = new ChemicalSunblock(sunblockIngredientFactory);
            sunblock.setName("Chemical Sunblock Manufactured in India");
        }
        else if (item.equals("natural") || item.equals("mineral")){
            sunblock = new MineralSunblock(sunblockIngredientFactory);
            sunblock.setName("Natural Sunblock Manufactured in India");
        }
        else if (item.equals("oils")) {
            sunblock = new OilSunblock(sunblockIngredientFactory);
            sunblock.setName("Sunblock Oil Manufactured in India");
        }
        return sunblock;
    }
}