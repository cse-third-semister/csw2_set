package set;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Movie {
    private String title;
    private double rating;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return title + " (Rating: " + rating + ")";
    }
}

public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Movie> movieSet = new TreeSet<>(Comparator.comparingDouble(Movie::getRating).reversed());

        while (true) {
            System.out.println("1. Add a movie");
            System.out.println("2. Get top-rated movies");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the title of the movie: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the rating of the movie: ");
                    double rating = scanner.nextDouble();
                    movieSet.add(new Movie(title, rating));
                    break;
                case 2:
                    System.out.println("Top-rated movies:");
                    int count = 0;
                    for (Movie movie : movieSet) {
                        System.out.println(movie);
                        count++;
                        if (count == 5) 
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
    
}
