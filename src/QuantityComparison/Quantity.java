package QuantityComparison;

import java.util.Objects;

// Represents amount/number of material
public class Quantity {

  private final double value;
  private final Unit unit;

  public Quantity(double value, Unit unit) {
    this.value = value;
    this.unit = unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Quantity quantity = (Quantity) o;
    return Double.compare(quantity.value, value) == 0 && Objects.equals(unit, quantity.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }
}