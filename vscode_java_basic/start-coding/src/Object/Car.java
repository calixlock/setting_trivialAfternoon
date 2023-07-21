package Object;

public class Car {
    // 필드선언 > method에서 사용하기 위해서
    // private로 선언 capsule화
    private String carNumber;
    private String carType;
    private double fuelEfficienty;

    private double startOil;
    private double endOil;
    private double totalDistanceDriven;

    public Car(String carNumber, String carType, double fuelEfficienty) {
        this.carNumber = carNumber;
        this.carType = carType;
        this.fuelEfficienty = fuelEfficienty;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarType() {
        return this.carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public double getFuelEfficienty() {
        return this.fuelEfficienty;
    }

    public void setFuelEfficienty(double fuelEfficienty) {
        this.fuelEfficienty = fuelEfficienty;
    }

    @Override
    public String toString() {
        return "{" +
                " carNumber='" + getCarNumber() + "'" +
                ", carType='" + getCarType() + "'" +
                ", fuelEfficienty='" + getFuelEfficienty() + "'" +
                "}";
    }

    public void drive(double startOil) {
        this.startOil = startOil;
    }

    public void stop(double endOil) {
        this.endOil = endOil;
        double consumedOil = this.startOil - this.endOil;
        this.totalDistanceDriven += consumedOil * this.fuelEfficienty;
    }

    public double getTotalDistanceDriven() {
        return this.totalDistanceDriven;
    }
}
