public class Bird implements Flyable, IFeathers {

    @Override
    public String hasFeathers() {
        
        return "I have some feathers!";
    }

    @Override
    public String fly() {
        
        return "I´m a bird,  I fly at 25 mph!";
    }

    
}
   
    

