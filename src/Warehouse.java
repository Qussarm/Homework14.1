
public class Warehouse extends Thread {
  private int product;
    public void putProduct(){
      if(product>0){
          try {
              sleep(1000);
          }catch (InterruptedException ex ){
              ex.printStackTrace();
          }
      }
      product=product+5;
        System.out.println("Добавлено:  5 продуктов" );
        System.out.println("В складе " + product + " продуктов");
    }

    public void getProduct(){
        if(product<0){
            try {
                sleep(2000);
            }catch (InterruptedException ex ){
                ex.printStackTrace();
            }
        }
        product=product-5;
        System.out.println("Убавлено:  5 продуктов");
        System.out.println("В складе " +  product + " продуктов");
    }




}

