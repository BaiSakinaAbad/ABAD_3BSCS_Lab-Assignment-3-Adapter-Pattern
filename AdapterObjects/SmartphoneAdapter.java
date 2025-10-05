package AdapterObjects;
import AdapteeObjects.SmartphoneCharger;

public class SmartphoneAdapter implements PowerOutlet {
    SmartphoneCharger smartphoneCharger;

    public SmartphoneAdapter (SmartphoneCharger smartphoneCharger) {
        this.smartphoneCharger = smartphoneCharger;
    }

    @Override
    public void plugIn() {
        smartphoneCharger.chargePhone();
    }
}
