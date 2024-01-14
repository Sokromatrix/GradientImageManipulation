class SimpleGradient extends Gradient {
  public SimpleGradient (int[] firstColor, int[] secondColor) {
    super(new int[][] {firstColor, secondColor}, new double[] {0, 1});
  }
  public int[] getColorAt(double u) {
    if (u > 1 || u < 0) {
      throw new IllegalArgumentException("'u' must be between 0 and 1 (inclusive)");
    }
    return lerpColors(u, this.colors[0], this.colors[1]);
  }
}