package QuantityComparison;

import java.util.Objects;

// Represents amount/number of material
public class Quantity {

  private double value;
  private Unit unit;

  public Quantity() {}

  public Quantity(double value, Unit unit) {
    this.value = value;
    this.unit = unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Quantity other = (Quantity) o;

    Unit thisUnit = this.unit;
    Unit otherUnit = other.unit;

    if(thisUnit.getClass().getSimpleName().equals(otherUnit.getClass().getSimpleName())) {
      double thisValue = thisUnit.factor();
      double otherValue = otherUnit.factor();

      return (thisValue * this.value) == (otherValue * other.value);
    } else {
      throw new IllegalStateException("Incompatible Units.");
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }
}