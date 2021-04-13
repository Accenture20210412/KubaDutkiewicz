package lab1_JD.trip;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DomesticTrip)) return false;
        if (!super.equals(o)) return false;

        DomesticTrip that = (DomesticTrip) o;

        return Objects.equals(discount, that.discount);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        return result;
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal priceWithDiscount = super.getPrice().subtract(discount);
        return priceWithDiscount;
    }
}
