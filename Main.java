public class Main {

    public static void main(String[] args) {

        Appliance ac = new AirConditioner("LG");
        ac.displayBrand();
        ac.turnOn();
        ac.operate();
        ac.turnOff();

        System.out.println();

        Appliance wm = new WashingMachine("Samsung");
        wm.displayBrand();
        wm.turnOn();
        wm.operate();
        wm.turnOff();

        System.out.println();

        Appliance mw = new Microwave("Panasonic");
        mw.displayBrand();
        mw.turnOn();
        mw.operate();
        mw.turnOff();

        System.out.println();

        Appliance tv = new Television("Sony");
        tv.displayBrand();
        tv.turnOn();
        tv.operate();
        tv.turnOff();

        System.out.println();

        Appliance rf = new Refrigerator("Sharp");
        rf.displayBrand();
        rf.turnOn();
        rf.operate();
        rf.turnOff();
    }
}