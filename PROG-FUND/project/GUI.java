import java.awt.Color;
import java.awt.Font;

public class GUI {
  public static void main(String[] args) {
    Frame frame = new Frame("Cows and Bulls");
    // frame.setLayout(null);

    Label label = new Label("Welcome to Cows and Bulls", new Color(0x344e41), new Font("MV Boli", Font.PLAIN, 30));
    // label.setBounds(0, 0, 480, 100);
    frame.add(label);

  }
}