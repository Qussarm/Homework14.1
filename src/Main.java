public class Main {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Maker maker = new Maker(warehouse);
        Сlient client = new Сlient(warehouse);
        Thread thread = new Thread(maker);
        Thread thread1 = new Thread(client);
        thread.start();
        thread1.start();
    }
}
