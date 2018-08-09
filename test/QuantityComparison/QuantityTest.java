package QuantityComparison;

import QuantityComparison.Length.LengthUnit;
import QuantityComparison.Weight.WeightUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

  @Test
  public void expectsTrueWhenTwoKgsEqualsTwoThousandGrams() {
    Quantity twoKg = new Quantity(2, WeightUnit.KILOGRAM);
    Quantity otherTwoKm = new Quantity(2, WeightUnit.KILOGRAM);

    assertEquals(true, twoKg.equals(otherTwoKm));
  }

  @Test
  public void expectsTrueWhenTwoKmsEqualsTwoThousandMeter() {
    Quantity twoKm = new Quantity(2, LengthUnit.KILOMETER);
    Quantity otherTwoKm = new Quantity(2, LengthUnit.KILOMETER);

    assertEquals(true, twoKm.equals(otherTwoKm));
  }
}