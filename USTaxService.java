public class  USTaxService implements TaxService{
    public double tax(double price){
        if(price>=100){
            return price*0.5;
        }
        else{
            return 0;
        }
    }
}
