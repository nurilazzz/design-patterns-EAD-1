package kz.template;

public class Coupe implements Car{
    @Override
    public void designModel() {
        System.out.println("Development of external design of coupe");
    }

    @Override
    public void production() {
        System.out.println("Create three-volume body with two doors");
        System.out.println("Making cars more dynamic");
    }
}
