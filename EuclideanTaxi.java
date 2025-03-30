import java.math.BigDecimal;

public class EuclideanTaxi implements Taxi {
    private static final int PRICE_COEFFICIENT=4;
    public int getPriceCoefficient(){
        return PRICE_COEFFICIENT;
    }
    public BigDecimal getPrice(Point src,Point dest){
        return new BigDecimal(Math.sqrt(Math.pow(dest.getX() - src.getX(), 2) + Math.pow(dest.getY() - src.getY(), 2)))
                .multiply(new BigDecimal(PRICE_COEFFICIENT));
    }
}
