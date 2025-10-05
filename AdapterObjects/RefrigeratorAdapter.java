package AdapterObjects;


import AdapteeObjects.Refrigerator;

public class RefrigeratorAdapter implements PowerOutlet{
   Refrigerator refrigerator;

   public RefrigeratorAdapter(Refrigerator refrigerator) {
       this.refrigerator = refrigerator;
   }

    @Override
    public void plugIn() {
        refrigerator.startCooling();
    }
}
