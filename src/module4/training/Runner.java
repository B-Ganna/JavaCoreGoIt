package module4.training;


public class Runner {
    public static void main(String[] args) {
        Car carHonda = new Honda();
        Car carTesla = new Tesla();

        Person person1 = new Woman(carHonda);
        person1.runDistance(400);

        Person person2 = new Man(carTesla);
        person2.runDistance(1700);

        Person boy = new ChildBoy(carHonda);
        Person girl = new ChildGirl(carTesla);

    }
}
