package marsmission.test;
import marsmission.habcontrol.TimeController;

public class TestTimeController {
    public static void main (String[] args){
        TimeController tc = new TimeController();
        int functions = 2; // Functions in TimeControler, starting at 0
        tc.setHours(8);
        tc.setMinutes(59);
        tc.setSeconds(59);

        if (tc.getHours() == 8 && tc.getMinutes() == 59 && tc.getSeconds() == 59){
            System.out.println("TOBEEEE FLYYYYYY HIIIIIGH");
        } else {
            System.out.println("SHIRATORIZAWA! SHIRATORIZAWA! SHIRATORIZAWA");
        }
    }
}
