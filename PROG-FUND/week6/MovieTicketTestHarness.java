import java.util.Scanner;

class MovieTicketTestHarness {

  public static void main(String[] args) {
    MovieTicket mt = new MovieTicket();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the movie name: ");
    mt.setMovieName(scanner.nextLine());

    System.out.println("Enter ticket number: ");
    mt.setTicketNumber(scanner.nextLong());

    System.out.println("Enter theatre number: ");
    mt.setTheatreNumber(scanner.nextInt());

    System.out.println("-------------------------");
    System.out.println("MOVIE NAME: " + mt.getMovieName());
    System.out.println("TICKET NUMBER: " + mt.getTicketNumber());
    System.out.println("THEATRE NUMBER: " + mt.getTheatreNumber());

    float total = MovieTicket.getTicketPrice() + MovieTicket.getTax();
    System.out
        .println("TOTAL PRICE: $" + MovieTicket.getTicketPrice() + " + $" + MovieTicket.getTax() + " = $" + total);

    System.out.println("-------------------------");

    System.out.println("Enter an actor name: ");
    String movieDate1 = mt.getMovieRunDate(scanner.next());
    System.out.println("The movie date is: " + movieDate1);

    System.out.println("-------------------------");

    System.out.println("Enter the start time: ");
    String movieDate2 = mt.getMovieRunDate(scanner.nextInt());
    System.out.println("The movie date is: " + movieDate2);

    scanner.close();
  }
}