package static1;

public class Car {

    private static int totalCars;
    private final String name;

    public Car(String name) {
        System.out.println("차량 구입, 이름: " + name);
        this.name = name;
        totalCars++;
    }

    public String getName() {
        return name;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + Car.totalCars);
    }
}
