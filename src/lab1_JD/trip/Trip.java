package lab1_JD.trip;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Trip {

    private LocalDate startDate;
    private LocalDate endDate;
    private String destiny;
    private BigDecimal price;

    public Trip(LocalDate startDate, LocalDate endDate, String destiny, BigDecimal price) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.destiny = destiny;
        this.price = price;
    }

    public Trip() {
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getDestiny() {
        return destiny;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", destiny='" + destiny + '\'' +
                ", price=" + getPrice() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trip)) return false;

        Trip trip = (Trip) o;

        if (!Objects.equals(startDate, trip.startDate)) return false;
        if (!Objects.equals(endDate, trip.endDate)) return false;
        if (!Objects.equals(destiny, trip.destiny)) return false;
        return Objects.equals(price, trip.price);
    }

    @Override
    public int hashCode() {
        int result = startDate != null ? startDate.hashCode() : 0;
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (destiny != null ? destiny.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
