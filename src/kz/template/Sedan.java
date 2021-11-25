package kz.template;

public class Sedan implements Car {
    @Override
    public void designModel() {
        System.out.println("Development of external design of sedan");
    }

    @Override
    public void production() {
        System.out.println("Create four doors and two rows of full-size seats.");
        System.out.println("Make an even distribution of mass along the axes");
    }
}
