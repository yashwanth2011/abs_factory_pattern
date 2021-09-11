public abstract class Sunblock {
    String name;
    Minerals minerals;
    Chemicals chemicals;
    Oils oils;

    abstract void prepare();

    void mix() {
        System.out.println("Mixing ingredients");
    }

    void fill() {
        System.out.println("Filling cream in bottles");
    }

    void seal() {
        System.out.println("Seal the bottles");
    }

    void setName(String Name){
        this.name = Name;
    }

    String getName() {
        return name;
    }

}
