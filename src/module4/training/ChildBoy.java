package module4.training;


public class ChildBoy extends Man {
    public ChildBoy(Car car) {
        super(car);
    }

    @Override
    public void runDistance(int distance) {
        if (distance < 35) {
            System.out.println("For distance " + distance + " I can run: " + RunTypes.BY_FOOT);
        }
        if (distance >= 35 && distance < 950) {
            System.out.println("For distance " + distance + " I can run: " + RunTypes.BY_CAR);
            System.out.println("Fuel spent: " + getCar().fuelNeeds());
        }
        if (distance >= 950) {
            System.out.println("For distance " + distance + " I can run: " + RunTypes.BY_PLANE);

        }
    }
}
