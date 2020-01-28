import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Movies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> movies = new ArrayList<>();

        String userAnswer="";

        while(true){
            if(userAnswer.equalsIgnoreCase("Q")){
                break;
            } else {
                System.out.print("Enter your favorite movie: ");
                userAnswer=sc.nextLine();
                movies.add(userAnswer);
                System.out.println("Enter 'Q' to Quit, or 'Enter' to add another movie");
                userAnswer=sc.nextLine();
            }
        }
        //sort alphabetically
        Collections.sort(movies);

        //display list
        System.out.println("Your favorite movies: "+movies);

        //suggest a random movie from list
        System.out.println("Movie Suggestion: "+movies.get(randomNumber(movies.size())));

    }

    //random number generator
    public static int randomNumber(int x){
        Random rand = new Random();
        int randnum = rand.nextInt(x);
        return randnum;
    }
}
