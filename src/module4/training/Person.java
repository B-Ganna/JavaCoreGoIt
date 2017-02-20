package module4.training;

public abstract class Person implements PersonOld{
    private Car car;

    public Person(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    //abstract void runDistance(int distance);


    @Override
    public void runDistance(int distance) {

    }
}
