import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fina=0;
        String respost;
        Buying buy2;
        TaxService taxService;
        String country;
        
        
        String[] list = {"Blusa ", "Calça ", "Luvas ", "Meias ", "Sapato ", "Chinela "};
        String[] prices = {"30 ", "40", "50", "70 ", "100", "120"};


       
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println("Qual a sua compra");
        String item= scanner.nextLine().trim();
        
        for (String valor : prices) {
            System.out.println(valor);
        }
        System.out.println("Qual o preco? (A qualidade é melhor quanto maior o preco) ");
        double price=scanner.nextDouble();

        scanner.nextLine();
        
        
        Chest buy = new Chest(item, price);


        
        
        while (fina!=1){
            System.err.println("Selecione uma Taxa de Pais (Europa, Brasil, USA)");
            country = scanner.nextLine().trim();
            switch (country) {
                case "Brasil":
                    taxService = new BrasilTaxService();
                    buy2 = new Buying(buy, taxService);
                    System.out.println(buy2.toString());
                    System.out.println("Essa sao as informacoes da sua comprar, deseja finalizar? (Digite sim para encerrar)");
                    respost= scanner.nextLine().trim();
                    if(respost.equals("sim")){
                        fina=1;
                        break;
                    }
                    
                    break;
                case "USA":
                    taxService = new USTaxService();
                    buy2 = new Buying(buy, taxService);
                    System.out.println(buy2.toString());
                    System.out.println("Essa sao as informacoes da sua comprar, deseja finalizar? (Digite sim para encerrar)");
                    respost= scanner.nextLine().trim();
                    if(respost.equals("sim")){
                        fina=1;
                        break;
                    }
                    
                    break;
                case "Europa":
                    taxService = new EUTaxService();
                    buy2 = new Buying(buy, taxService);
                    System.out.println(buy2.toString());
                    System.out.println("Essa sao as informacoes da sua comprar, deseja finalizar? ( Digite sim para encerrar)");
                    respost= scanner.nextLine().trim();
                    if(respost.equals("sim")){
                        fina=1;
                        break;
                    }
                    break;
                    
                default:
                    throw new IllegalArgumentException("País desconhecido: " + country);

            
        }
    }
    System.err.println("COMPRA CONFIRMADA");
    scanner.close();


    }
}
