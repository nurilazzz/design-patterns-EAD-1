package kz.factoryMethod.problem1;

public class Main {

    public static void main(String[] args) {
        Workout workout = WorkoutFactory.getWorkout(WorkoutType.LOWERBODY);
        workout.createWorkout();

        workout = WorkoutFactory.getWorkout(WorkoutType.UPPERBODY);
        workout.createWorkout();
    }
}
