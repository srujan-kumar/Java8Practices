package Java8Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Java8PracticeWithMovieClass_MultipleSortings {
    public static void main(String[] args) {
       List<Movie>movieNames= Arrays.asList(
               new Movie(true,"Bahubali",8.8,2020),
                new Movie(true,"Salaar",6.5,2010),
                new Movie(true,"FamilyMan",6.8,1999),
                new Movie(false,"180 hours",8.5,2005),
                new Movie(true,"Anji",5.7,1997),
                new Movie(false,"Ambaajipeta",7.5,2023));
       // *****this is double sorting based on star rated (start hero Movie) verify and Ratings
        movieNames.sort(Comparator.comparing(Movie::isStarRated).reversed().
                thenComparing(Comparator.comparing(Movie::getrating).reversed()));
        movieNames.forEach(System.out::println);

        // ***** Understand what is Optional and get() purpose
        Optional<Movie> oldMovie=movieNames.stream().min((m1,m2)->m1.getReleaseYear()-m2.getReleaseYear());
                if(oldMovie.isPresent()){
                    System.out.println("Old Movie"+oldMovie.get());
                }

        Optional<Movie> latestMovie=movieNames.stream().max((m1,m2)->m1.getReleaseYear()-m2.getReleaseYear());
        if(latestMovie.isPresent()){
            System.out.println("Latest Movie"+latestMovie.get());
        }

        System.out.println(movieNames.stream().min((m1,m2)->m1.getReleaseYear()-m2.getReleaseYear()).get().toString());
        //Movie mov=movieNames.stream().min((m1,m2)->m1.getReleaseYear()-m2.getReleaseYear()).get();

        //System.out.println("Old Movie fetching in diff way -->"+mov);
    }
}
