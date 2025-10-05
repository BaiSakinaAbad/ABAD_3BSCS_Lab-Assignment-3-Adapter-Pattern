package AdapterObjects;

import AdapteeObjects.Laptop;

public class LaptopAdapter implements PowerOutlet {
    private Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    public void powerOutlet() {
        laptop.charge();
    }

}

