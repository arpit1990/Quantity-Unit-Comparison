import java.util.Objects;

// Represents the mass of an Object
public class Weight {

  private final double value;
  private final String unit;

  public Weight(double value, String unit) {
    this.value = value;
    this.unit = unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Weight weight = (Weight) o;
    return Double.compare(weight.value, value) == 0 &&
      Objects.equals(unit, weight.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }
}