import AdapteeObjects.*;
import AdapterObjects.*;

public class ApplianceApp {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        LaptopAdapter laptopAdapter = new LaptopAdapter(laptop);
        RefrigeratorAdapter refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        SmartphoneAdapter smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);

        laptopAdapter.plugIn();
        refrigeratorAdapter.plugIn();
        smartphoneAdapter.plugIn();


    }
}
