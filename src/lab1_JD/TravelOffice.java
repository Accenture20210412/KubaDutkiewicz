package lab1_JD;

public class TravelOffice {

    private Customer[] customerTab = new Customer[2];
    private boolean isFull = false;

    public void addCustomer(Customer customer){
        for (int i = 0; i < customerTab.length; i++) {
            if (customerTab[i] == null){
                isFull = true;
            }
            if (!isFull){
                customerTab = new Customer[customerTab.length + 2];
            }
        }
    }
}
