
public class Vehicle {


    private boolean isCar;
    private int wheelCount;
    private int doorCount;



    public Vehicle(boolean isCar, int wheelCount, int doorCount, String brand, String type) {
        this.isCar = isCar;
        this.wheelCount = wheelCount;
        this.doorCount = doorCount;
    }

    public boolean getIsCar() {
        return isCar;
    }

    public void setIsCar(boolean isCar) {
        this.isCar = isCar;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }


}
