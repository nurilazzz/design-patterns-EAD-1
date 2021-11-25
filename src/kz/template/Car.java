package kz.template;

public interface Car {
    default void createCar() {
        System.out.println("###################################################################");
        System.out.println("-------------------------------------------------------------------");
        preparationNewCarModel();
        System.out.println("-------------------------------------------------------------------");
        designModel();
        System.out.println("-------------------------------------------------------------------");
        engineering();
        System.out.println("-------------------------------------------------------------------");
        production();
        System.out.println("-------------------------------------------------------------------");
        launchMassProduction();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("###################################################################");
    }
    default void preparationNewCarModel() {
        System.out.println("Research of the domestic market as well as foreign markets");
        System.out.println("Determination of the main features of the new model");
        System.out.println("Identifying competitors and naturally target customers");
        System.out.println("Analytical assessment of the new project");
        System.out.println("Project budget");
    }
    void designModel();
    default void engineering() {
        System.out.println("Work with clients");
        System.out.println("Crash tests");
        System.out.println("Signing contracts");
    }
    void production();
    default void launchMassProduction() {
        System.out.println("Market research");
        System.out.println("Determination of the retail (market) price of the car");
        System.out.println("Development of marketing promotion");
        System.out.println("Creation of promotional materials");
        System.out.println("Debut of the car");
    }
}
