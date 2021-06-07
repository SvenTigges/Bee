import java.io.OutputStream;

public class App {
    public static void main(String[] args) {

        Queen queen = new Queen();
        Drone drone = new Drone();
        Worker worker = new Worker();


        ausgabe(queen.doYourJob());
        ausgabe(drone.doYourJob());
        ausgabe(worker.doYourJob());
        
        ausgabe("-----------------");

        ausgabe(queen.fly());
        ausgabe(drone.fly());
        ausgabe(worker.fly());
    }

    private static void ausgabe(String outStr){
        System.out.println(outStr);
    }

}
