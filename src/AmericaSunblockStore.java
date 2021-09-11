public class AmericaSunblockStore extends SunblockStore {

    protected Sunblock prepareSunblock(String item) {
        Sunblock sunblock = null;
        SunblockIngredientFactory sunblockIngredientFactory = new AmericaSunblockIngredientFactory();
        switch (item) {
            case "chemical" -> {
                sunblock = new ChemicalSunblock(sunblockIngredientFactory);
                sunblock.setName("Chemical Sunblock Manufacturing in USA");
            }
            case "natural", "mineral" -> {
                sunblock = new MineralSunblock(sunblockIngredientFactory);
                sunblock.setName("Natural Sunblock Manufacturing in USA");
            }
            case "oils" -> {
                sunblock = new OilSunblock(sunblockIngredientFactory);
                sunblock.setName("Oil Sunblock Manufacturing in USA");
            }
        }
        return sunblock;
    }
}
