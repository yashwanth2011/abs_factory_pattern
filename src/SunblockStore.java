public abstract class SunblockStore {

    protected abstract Sunblock prepareSunblock(String item);

    public Sunblock orderSunblock(String type) {
        Sunblock sunblock = prepareSunblock(type);
        System.out.println("--- Making a " + sunblock.getName() + " ---");
        sunblock.mix();
        sunblock.fill();
        sunblock.seal();
        return sunblock;
    }
}