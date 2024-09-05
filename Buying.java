


public class Buying {
    private Chest chest;
    private TaxService taxService;
    private double tax;
    
    public Buying(Chest chest, TaxService taxService){
        this.chest=chest;
        this.taxService=taxService;
        this.tax=taxService.tax(chest.getPrice());
    }
    
    public double Total(){
        double price=chest.getPrice();
        return price+tax;
    }

    @Override
    public String toString() {
        
        return String.format(
            "Buying Compra= [%s, taxa= %s, total= %.2f]",
            chest.toString(),
            tax,
            Total()
        );
    }

    




}
