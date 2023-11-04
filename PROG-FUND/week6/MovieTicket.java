class MovieTicket {
  // States
  private static float ticketPrice = 100;

  private String movieName;
  private long ticketNumber;
  private int theatreNumber;

  // Methods
  public static float getTicketPrice() {
    return ticketPrice;
  }

  public static float getTax() {
    return ticketPrice * 0.13f;
  }

  public String getMovieName() {
    return this.movieName;
  }

  public long getTicketNumber() {
    return this.ticketNumber;
  }

  public int getTheatreNumber() {
    return this.theatreNumber;
  }

  public String getMovieRunDate(String mainActor) {
    switch (mainActor.toLowerCase()) {
      case "brad":
        return "2023-10-15 / 1:00 PM / Spy Game";
      case "tom":
        return "2023-10-21 / 2:00 PM / Colateral";
      case "leonardo":
        return "2023-10-22 / 6:00 PM / Revenant";
      case "will":
        return "2023-10-19 / 9:00 PM / Pursuit of happiness";
      default:
        return "No movies match the entered name";
    }
  }

  public String getMovieRunDate(int startTime) {
    switch (startTime) {
      case 13: // 1:00 PM
        return "2023-10-15 / 1:00 PM / Spy Game";
      case 14: // 2:00 PM
        return "2023-10-21 / 2:00 PM / Colateral";
      case 17: // 6:00 PM
        return "2023-10-22 / 6:00 PM / Revenant";
      case 21: // 9:00 PM
        return "2023-10-19 / 9:00 PM / Pursuit of happiness";
      default:
        return "No movies available at this time";
    }
  }

  public void setMovieName(String movieName) {
    this.movieName = movieName;
  }

  public void setTicketNumber(long ticketNumber) {
    this.ticketNumber = ticketNumber;
  }

  public void setTheatreNumber(int theatreNumber) {
    this.theatreNumber = theatreNumber;
  }
}