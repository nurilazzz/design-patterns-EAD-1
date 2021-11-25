package kz.template;

public class Van implements Car {
    @Override
    public void designModel() {
        System.out.println("Development of external design of van");
    }

    @Override
    public void production() {
        System.out.println("Making a car for more than eight seats");
        System.out.println("Create a total lifting capacity of over 1000 kg");
    }
}
