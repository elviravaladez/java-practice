package javaMasterClassSection6;

public class Mazda extends CarTwo {
    private int roadServiceMonths;

    public Mazda(int roadServiceMonths) {
        super("Mazda", "4WD", 4, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity ==0) {
            stop();
            setGear(1);
        } else if(newVelocity >0 && newVelocity <=10) {
            setGear(1);
        } else if(newVelocity >10 && newVelocity <=20) {
            setGear(2);
        } else if(newVelocity >20 && newVelocity <=30) {
            setGear(3);
        } else {
            setGear(4);
        }

        if(newVelocity > 0) {
            setVelocity(newVelocity, getCurrentDirection());
        }
    }
}
