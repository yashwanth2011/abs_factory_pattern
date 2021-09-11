public class SunblockMain {

    public static void main(String[] args) {

        SunblockStore indianStore = new IndiaSunblockStore();
        SunblockStore americanStore = new AmericaSunblockStore();

        System.out.println("Joey placed an order\nMain ingredient used is:");
        Sunblock sunblock = indianStore.orderSunblock("chemical");
        System.out.println("Delivered " + sunblock.getName() + " to Joey \n");

        System.out.println("Chandler placed an order.\nMain Ingredient used is:");
        sunblock = indianStore.orderSunblock("natural");
        System.out.println("Delivered " + sunblock.getName() + " to Chandler\n");

        System.out.println("Ross placed an order.\nMain Ingredient used is:");
        sunblock = indianStore.orderSunblock("oils");
        System.out.println("Delivered " + sunblock.getName() + " to Ross\n");

        System.out.println("Rachel placed an order.\nMain Ingredient used is:");
        sunblock = americanStore.orderSunblock("chemical");
        System.out.println("Delivered " + sunblock.getName() + " to Rachel\n");

        System.out.println("Monica placed an order.\nMain Ingredient used is:");
        sunblock = americanStore.orderSunblock("natural");
        System.out.println("Delivered " + sunblock.getName() + " to Monica\n");

        System.out.println("Phoebe placed an order.\nMain Ingredient used is:");
        sunblock = americanStore.orderSunblock("oils");
        System.out.println("Delivered " + sunblock.getName() + " to Phoebe\n");
    }
}
