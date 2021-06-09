
public class App {
    public static void main(String[] args) {

        HoneyBee queen = new Queen();
        HoneyBee drone = new Drone();
        HoneyBee worker = new Worker();


        ausgabe(queen.doYourJob());
        ausgabe(drone.doYourJob());
        ausgabe(worker.doYourJob());
        
        ausgabe("-----------------");

        Bird bird = new Bird();
        ausgabe(bird.fly());
        ausgabe(bird.hasFeathers());
        

        ausgabe("------Fliegerei--------");

        flyingCompertition(queen);
        flyingCompertition(worker);
        flyingCompertition(drone);
        flyingCompertition(bird);

        ;
    }

    public static void flyingCompertition(Flyable obj) {
        ausgabe(obj.fly());
    }


    private static void ausgabe(String outStr){
        System.out.println(outStr);
    }
}
