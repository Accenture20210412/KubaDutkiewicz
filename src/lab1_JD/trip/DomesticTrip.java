package lab1_JD.trip;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DomesticTrip extends Trip {

    private BigDecimal discount;

    public DomesticTrip(LocalDate startDate, LocalDate endDate, String destiny, BigDecimal price, BigDecimal discount) {
        super(startDate, endDate, destiny, price);
        this.discount = discount;
    }

    public DomesticTrip(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "DomesticTrip{" +
                "discount=" + getPrice() +
                '}';
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal priceWithDiscount = super.getPrice().subtract(discount);
        return priceWithDiscount;
    }
}
