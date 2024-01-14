class Gradient {
  public int[][] colors;
  public double[] positions;

  public Gradient(int[][] colors, double[] positions) {
    this.colors = colors;
    this.positions = positions;
  }

  public int[] getColorAt(int u) {
    int[] color = new int[3];
    for (int i = 0; i < 3; i++) {
      
    }
  }
  
  public static int hexDigitToInt(char hex) {
    if (hex >= 48 && hex <= 57)
      return hex - '0';
    if (hex >= 97 && hex <= 102)
      return hex - 87;
    if (hex >= 65 && hex <= 70)
      return hex - 55;
    throw new IllegalArgumentException("Invalid hexadecimal digit");
  }

  public static char intToHexDigit(int value) {
    if (value >= 0 && value <= 9)
      return (char) (value + '0');
    if (value >= 10 && value <= 15)
      return (char) (value - 10 + 'A');
    throw new IllegalArgumentException("Enter a value between 0 and 15");
  }

  public static int hexToInt(String hex) {
    int number = 0;
    for (int x = 0; x < hex.length(); x++)
      number += (int) (hexDigitToInt(hex.charAt(hex.length() - x - 1)) * Math.pow(16, x));
    return number;
  }

  public static String intToHex(int number) {
    StringBuilder hex = new StringBuilder();
    int n = (int) (Math.log(number) / Math.log(16));
    for (int x = 0; x <= n; x++) {
      int power = (int) Math.pow(16, n - x);
      hex.append(intToHexDigit((int) (number / power)));
      number %= power;
    }
    return hex.toString();
  }

  public static int[] toRGB(String hex) {
    int[] RGB = new int[3];
    for (int x = 0; x < 3; x++)
      RGB[x] = hexToInt(hex.substring(2 * x, 2 * x + 2));
    return RGB;
  }

  public static String toHex(int[] RGB) {
    StringBuilder hex = new StringBuilder();
    for (int color : RGB) {
      StringBuilder partHex = new StringBuilder(intToHex(color));
      while (partHex.length() < 2)
        partHex.insert(0, "0");
      hex.append(partHex.toString());
    }
    return hex.toString();
  }
}