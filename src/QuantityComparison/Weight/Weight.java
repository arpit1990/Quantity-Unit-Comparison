package QuantityComparison.Weight;

import QuantityComparison.Quantity;

import java.util.Objects;

// Represents the mass of an Object
public class Weight {

  private final double value;
  private final WeightUnit unit;

  public Weight(double value, WeightUnit unit) {
    this.value = value;
    this.unit = unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Weight other = (Weight) o;

    WeightUnit thisUnit = this.unit;
    WeightUnit otherUnit = ((Weight) o).unit;

    if(thisUnit.equals(otherUnit)) {
      return Double.compare(other.value, value) == 0;
    } else {
      double thisWeightInGrams = thisUnit.toGram(this.value);
      double otherWeightInGrams = otherUnit.toGram(other.value);

      return thisWeightInGrams == otherWeightInGrams;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }
}