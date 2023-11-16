import java.util.Random;

public class RealEstateTransaction {
  // States
  private String streetNumberStr;
  private String streetName;
  private String city;
  private String purchasePriceStr;

  // Constructors
  public RealEstateTransaction() {
    this.streetNumberStr = "";
    this.streetName = "";
    this.city = "";
    this.purchasePriceStr = "";
  }

  public RealEstateTransaction(String streetNumberStr, String streetName, String city, String purchasePriceStr) {
    this.streetNumberStr = streetNumberStr;
    this.streetName = streetName;
    this.city = city;
    this.purchasePriceStr = purchasePriceStr;
  }

  // Getters
  public String getStreetNumber() {
    return streetNumberStr;
  }

  public String getStreetName() {
    return streetName;
  }

  public String getCity() {
    return city;
  }

  public String getPurchasePrice() {
    return purchasePriceStr;
  }

  // Setters
  public void setStreetNumber(String streetNumberStr) {
    this.streetNumberStr = streetNumberStr;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setPurchasePrice(String purchasePriceStr) {
    this.purchasePriceStr = purchasePriceStr;
  }

  // Methods
  public String toString() {
    return "Street Number: " + streetNumberStr.substring(0, streetNumberStr.length() / 2).toLowerCase()
        + streetNumberStr.substring(streetNumberStr.length() / 2, streetNumberStr.length()).toUpperCase()
        + "\nStreet Name: "
        + streetName.substring(0, streetName.length() / 2).toLowerCase()
        + streetName.substring(streetName.length() / 2, streetName.length()).toUpperCase() + "\nCity: "
        + city.substring(0, city.length() / 2).toLowerCase()
        + city.substring(city.length() / 2, city.length()).toUpperCase()
        + "\nPurchase Price: " + purchasePriceStr.substring(0, purchasePriceStr.length() / 2).toLowerCase()
        + purchasePriceStr.substring(purchasePriceStr.length() / 2, purchasePriceStr.length()).toUpperCase();
  }

  public String generateSubstring() {
    int strLength = this.toString().length();
    Random random = new Random();

    // Generate random indices for lowercase substring
    int lowerStart = random.nextInt(strLength);
    int lowerLength = random.nextInt(strLength - lowerStart) + 1;

    // Generate random indices for uppercase substring
    int upperStart = random.nextInt(strLength);
    int upperLength = random.nextInt(strLength - upperStart) + 1;

    // Check for overlap and valid indices
    while (lowerStart <= upperStart && upperStart < lowerStart + lowerLength ||
        upperStart <= lowerStart && lowerStart < upperStart + upperLength) {
      lowerStart = random.nextInt(strLength);
      lowerLength = random.nextInt(strLength - lowerStart) + 1;
      upperStart = random.nextInt(strLength);
      upperLength = random.nextInt(strLength - upperStart) + 1;
    }

    // Extract substrings
    String lowerSubstring = this.toString().substring(lowerStart, lowerStart + lowerLength).toLowerCase();
    String upperSubstring = this.toString().substring(upperStart, upperStart + upperLength).toUpperCase();

    // Concatenate and return the result
    return lowerSubstring + upperSubstring;
  }

  public String encryptString(int keyIndex, int startIndex) {
    // Validate indices
    if (keyIndex >= this.toString().length() || startIndex >= this.toString().length() || keyIndex >= startIndex) {
      return "1"; // Return error code
    }

    StringBuilder encryptedString = new StringBuilder(this.toString());
    char keyChar = encryptedString.charAt(keyIndex);

    // Encrypt characters starting from the specified index
    for (int i = startIndex; i < encryptedString.length(); i += 3) {
      encryptedString.setCharAt(i, keyChar);
    }

    return encryptedString.toString();
  }
}