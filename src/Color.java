public class Color {
    public int[] colorCode;
    public String name;
    public Color(int[] colorCode) {
        this(colorCode, "Unnamed");
    }
    public Color(String hex) {
        this(Gradient.toRGB(hex), "Unnamed");
    }
    public Color(String hex, String name) {
        this(Gradient.toRGB(hex), name);
    }
    public Color(int[] colorCode, String name) {
        if (colorCode.length != 3) {
            throw new IllegalArgumentException("Color must have three byte values to be an RGB format");
        }
        this.colorCode = colorCode;
        this.name = name;
    }
}
