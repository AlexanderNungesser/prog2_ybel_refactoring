package refactoring;

public class EBike extends Bike {

    private int batteryCapacity;

    public EBike(int maxSpeed, int rearGearsCount, int frontGearsCount, int batteryCapacity) {
        super(maxSpeed, rearGearsCount, frontGearsCount);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
