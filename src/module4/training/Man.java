package module4.training;


public class Man extends Person{
    public Man(Car car) {
        super(car);
    }

    @Override
    public void runDistance(int distance) {
        if (distance < 50) {
            System.out.println(getClass().getSimpleName()+": "+"For distance " + distance + " I can run: " + RunTypes.BY_FOOT);
        }
        if (distance >= 50 && distance < 1500) {
            System.out.println(getClass().getSimpleName()+": "+"For distance " + distance + " I can run: " + RunTypes.BY_CAR);
            System.out.println("Fuel spent: " + getCar().fuelNeeds());
        }
        if (distance >= 1500) {
            System.out.println(getClass().getSimpleName()+": "+"For distance " + distance + " I can run: " + RunTypes.BY_PLANE);
        }
    }
}
