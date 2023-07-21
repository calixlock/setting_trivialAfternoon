package Object;

public class Main {
    public static void main(String[] args) {

        // 기본정보 : 번호 / 차종 / 연비
        String carNumber = "123가3456";
        String carType = "카니발";
        double fuelEfficienty = 10.4;

        Car myCar = new Car(carNumber, carType, fuelEfficienty);
        System.out.println(myCar.toString());
        myCar.setCarType("캠핑카");

        System.out.println(myCar.toString());
        myCar.drive(100.4);
        myCar.stop(90.2);
        myCar.getTotalDistanceDriven();
        myCar.drive(90.2);
        myCar.stop(80.2);

    }
}
