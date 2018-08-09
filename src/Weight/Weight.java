package Weight;

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
    Weight weight = (Weight) o;

    WeightUnit thisUnit = this.unit;
    WeightUnit otherUnit = ((Weight) o).unit;

    if(thisUnit.equals(otherUnit)) {
      return Double.compare(weight.value, value) == 0 && Objects.equals(unit, weight.unit);
    } else {
      double thisWeightInGrams = this.value * thisUnit.factor();
      double otherWeightInGrams = ((Weight) o).value * otherUnit.factor();

      if(thisWeightInGrams == otherWeightInGrams) {
        return true;
      }
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }
}