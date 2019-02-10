import java.util.Random;

public class Randomizer {
    Random r = new Random();
    private double d = 0;

    public void setRandom(){
        d = r.nextDouble();
    }

    public double getRandom(){
        return d;
    }

    // Allow us to be cheeky for once in function naming, come on
    public boolean wingardiumLeviosa(){
        // Checks for half 1% percent probability
        if (d < 0.005)
            return true;
        else
            return false;
    }

    public static void main (String[] args){
        Randomizer r = new Randomizer();
        for(int i = 0; i < 300; i++){
            r.setRandom();
            System.out.println("Value was: " + r.getRandom() + " which is " + r.wingardiumLeviosa());
        }
    }
}
