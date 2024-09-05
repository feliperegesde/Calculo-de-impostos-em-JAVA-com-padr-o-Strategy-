public class EUTaxService implements TaxService {
    public double tax(double price){
        if(price>=100){
            return price*0.2;
        }
        else{
            return price*0.1;
        }
    }
}
