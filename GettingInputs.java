import java.util.*;
public class GettingInputs {
    
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        
        String newYear;
        
        String Genre, Album, Title, Artist;

        System.out.print("Enter the year: ");
        newYear = console.nextLine();
        int Year = Integer.parseInt(newYear);

        System.out.print("Enter the genre: ");
        Genre = console.nextLine();

        System.out.print("Enter the Album: ");
        Album = console.nextLine();

        System.out.print("Enter the song title: ");
        Title = console.nextLine();

        System.out.print("Enter the artist: ");
        Artist = console.nextLine();

        System.out.println("-----------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("-----------------------------");

        System.out.println("Year Released: " + Year);
        System.out.println("Genre: " + Genre);
        System.out.println("Album: " + Album);
        System.out.println("Title: " + "\"" + Title + "\"");
        System.out.println("Artist: " + Artist);

        
        

    }
    
}
