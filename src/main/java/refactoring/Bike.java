package refactoring;

public class Bike {

    public int maxSpeed;
    public int rearGearsCount;
    public int frontGearsCount;

    public Bike(int maxSpeed, int rearGearsCount, int frontGearsCount) {
        this.maxSpeed = maxSpeed;
        this.rearGearsCount = rearGearsCount;
        this.frontGearsCount = frontGearsCount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getGearsCount() {
        return rearGearsCount * frontGearsCount;
    }
}
