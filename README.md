# this is one project in java that use some classes and polymorfizm 
> with use polymorfizm we niaz nadarim be if hay mokarar
# Masafat and pool Taxi
ma do no taxi darim ke masafat hara be shekl digar tey mikonad va ba zarb an dar 1 adad moshakhas poolo hesab mikoneh.
# nomoneh code
```java
public class TripHandler {
    public static BigDecimal getPrice(Point src, Point dest, Taxi taxi) {
        return taxi.getPrice(src,dest);
    }
}
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
}```
# for run
we sholde write main function and create object from this classes and initiolaz them and farakhany tavabeh
