import java.math.BigDecimal;

public class TripHandler {
    public static BigDecimal getPrice(Point src, Point dest, Taxi taxi) {
        return taxi.getPrice(src,dest);
    }
}

