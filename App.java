
public class App {
    public static void main(String[] args) {

        HoneyBee queen = new Queen();
        HoneyBee drone = new Drone();
        HoneyBee worker = new Worker();


        ausgabe(queen.doYourJob());
        ausgabe(drone.doYourJob());
        ausgabe(worker.doYourJob());
        
        ausgabe("-----------------");

        ausgabe(queen.fly());
        ausgabe(drone.fly());
        ausgabe(worker.fly());

        ausgabe("-----------------");


    }

    private static void ausgabe(String outStr){
        System.out.println(outStr);
    }
}
