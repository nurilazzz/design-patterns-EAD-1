package kz.factoryMethod.problem1;

public class WorkoutFactory {

    public static Workout getWorkout(WorkoutType workoutType) {

        switch (workoutType) {
            case UPPERBODY:
                return new Upperbody();
            case LOWERBODY:
                return new Lowerbody();
        }
        return null;
    }
}
