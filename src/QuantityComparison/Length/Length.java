package QuantityComparison.Length;

import QuantityComparison.Quantity;

import java.util.Objects;

// Represents the measurement of unit
public class Length {
  private double value;
  private LengthUnit unit;

  public Length(double value, LengthUnit unit) {
    this.value = value;
    this.unit = unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Length other = (Length) o;

    LengthUnit thisUnit = this.unit;
    LengthUnit otherUnit = other.unit;

    if (thisUnit.equals(otherUnit)) {
      return Double.compare(other.value, value) == 0;
    } else {
      double thisLengthInMeter = thisUnit.toMeter(this.value);
      double otherLengthInMeter = otherUnit.toMeter(other.value);

      return thisLengthInMeter == otherLengthInMeter;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }
}