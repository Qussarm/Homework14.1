public class Maker extends Warehouse{
  Warehouse warehouse;
  public Maker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
    public void run(){
        warehouse.putProduct();
    }
}
