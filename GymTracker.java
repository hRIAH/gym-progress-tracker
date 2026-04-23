import java.util.Scanner;

public class GymTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter exercise name:");
        String exercise = sc.nextLine();

        System.out.println("Enter weight (kg):");
        double weight = sc.nextDouble();

        System.out.println("Enter reps:");
        int reps = sc.nextInt();

        System.out.println("\n--- Workout Log ---");
        System.out.println("Exercise: " + exercise);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Reps: " + reps);

        sc.close();
    }
}
