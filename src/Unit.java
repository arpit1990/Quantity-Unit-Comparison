// Represents the standard unit
public enum Unit {
  KILOGRAM(1000),
  GRAM(1);

  private final double factor;

  Unit(double factor) {
    this.factor = factor;
  }

  public double factor() {
    return this.factor;
  }
}