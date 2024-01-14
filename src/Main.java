import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    SimpleGradient gradient = new SimpleGradient(new int[] {0, 0, 0}, new int[] {255, 255, 255});
    System.out.println(Arrays.toString(gradient.getColorAt(0.5)));
  }
}