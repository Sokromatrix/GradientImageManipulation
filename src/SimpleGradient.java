class SimpleGradient extends Gradient {
  public SimpleGradient (int[] firstColor, int[] secondColor) {
    super(new int[][] {firstColor, secondColor}, new double[] {0, 1});
  }
}