package lab1_JD;

import java.util.Arrays;

public class TravelOffice {

    private Customer[] customerTab = new Customer[2];

    public TravelOffice(Customer[] customerTab) {
        this.customerTab = customerTab;
    }

    public TravelOffice() {
    }

    public Customer[] getCustomerTab() {
        return customerTab;
    }

    @Override
    public String toString() {
        return "TravelOffice{" +
                "customerTab=" + Arrays.toString(customerTab) +
                '}';
    }

    public void addCustomer(Customer customer) {
        if (customerTab[customerTab.length-1] != null) {
            extendArray();
        }
        for (int i=0; i < customerTab.length; i++) {
            if(customerTab[i] == null) {
                customerTab[i] = customer;
                break;
            }
        }
    }

    private void extendArray() {
        Customer[] tmpCustomerTable = customerTab;
        customerTab = new Customer[customerTab.length * 2];
        for (int i = 0; i < tmpCustomerTable.length; i++) {
            customerTab[i] = tmpCustomerTable[i];
        }
    }

    public String getCustomersInfo() {
        StringBuffer newString = new StringBuffer();
        for (int i = 0; i < customerTab.length; i++) {
            newString.append(customerTab[i]);
        }
        String str = newString.toString();
        return str;
    }
}
