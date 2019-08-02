public class Сlient extends Warehouse {
    Warehouse warehouse;

    public Сlient(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
    public void run(){
        warehouse.getProduct();

    }
}


