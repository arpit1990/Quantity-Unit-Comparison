package Weight;

public enum WeightUnit {
  KILOGRAM(1000),
  GRAM(1), // Central Unit
  MILLIGRAM(0.001);

  private final double factor;

  WeightUnit(double factor) {
    this.factor = factor;
  }

  public double factor() {
    return this.factor;
  }

  public double toGram(double value) {
    return value * this.factor;
  }
}
