import java.math.BigDecimal;

public class ManhattanTaxi implements Taxi {
    private static final int PRICE_COEFFICIENT=3;
    public int getPriceCoefficient(){
        return PRICE_COEFFICIENT;
    }
    public BigDecimal getPrice(Point src, Point dest){
        BigDecimal result1=new BigDecimal(dest.getX() - src.getX()).abs();
        BigDecimal result2=new BigDecimal(dest.getY() - src.getY()).abs();
        return (result1.add(result2)).multiply(new BigDecimal(PRICE_COEFFICIENT));
    }
}