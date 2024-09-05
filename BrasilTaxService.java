public class BrasilTaxService implements TaxService{
    public double tax(double price){
        if(price>=100){
            return price*0.35;
        }
        else{
            return price*0.2;
        }
    }
    
}
