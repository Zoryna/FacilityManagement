/*
    This class is for simulation of things breaking or not.
*/

package marsmission.simulation;

import java.util.Random;

public class Randomizer {
    Random r = new Random();
    private double d = 0; // Stores the setRandom() so it can be compared without mistakes
    private double percentage = 0.05;

    public void setRandom(){
        d = r.nextDouble();
    }

    public double getRandom(){
        return d; // ( ͡° ͜ʖ ͡°)
    }

    // Just for the sake of cheeky function naming for once
    public boolean wingardiumLeviosa(){
        // Half 1% percent probability at 0.005 for harder to break
        // 5% percent probability for better demonstration purposes, or higher
        if (d < percentage)
            return true;
        else
            return false;
    }
}
