import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Gradient gradient = new SimpleGradient(new int[] {0, 0, 0}, new int[] {255, 255, 255});
    for (int[] color : gradient.colors) {
      System.out.println(Arrays.toString(color));
    }
  }
}