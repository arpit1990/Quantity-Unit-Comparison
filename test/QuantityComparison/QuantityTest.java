package QuantityComparison;

import QuantityComparison.Length.LengthUnit;
import QuantityComparison.Weight.WeightUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

  @Test
  public void expectsTrueWhenTwoKgEqualsTwoKg() {
    Quantity twoKg = new Quantity(2, WeightUnit.KILOGRAM);
    Quantity otherTwoKm = new Quantity(2, WeightUnit.KILOGRAM);

    assertEquals(true, twoKg.equals(otherTwoKm));
  }

  @Test
  public void expectsTrueWhenTwoKmsEqualsTwoKms() {
    Quantity twoKm = new Quantity(2, LengthUnit.KILOMETER);
    Quantity otherTwoKm = new Quantity(2, LengthUnit.KILOMETER);

    assertEquals(true, twoKm.equals(otherTwoKm));
  }

  @Test
  public void expectsTrueWhenTwoKmsEqualsTwoThousandMeter() {
    Quantity twoKm = new Quantity(2, LengthUnit.KILOMETER);
    Quantity twoKg = new Quantity(2, WeightUnit.KILOGRAM);

    try {
      twoKm.equals(twoKg);
      assertFalse(true);
    } catch(Exception e) {
      assertEquals("Incompatible Units.", e.getMessage());
    }
  }

  @Test
  public void expectTrueWhenTwoKgEqualsTwoThousandGrams() {
    Quantity twoKg = new Quantity(2, WeightUnit.KILOGRAM);
    Quantity twoThousandGrams = new Quantity(2000, WeightUnit.GRAM);

    assertEquals(true, twoKg.equals(twoThousandGrams));
  }

  @Test
  public void expectTrueWhenTwoKmEqualsTwoThousandMeters() {
    Quantity twoKm = new Quantity(2, LengthUnit.KILOMETER);
    Quantity twoThousandMeter = new Quantity(2000, LengthUnit.METER);

    assertEquals(true, twoKm.equals(twoThousandMeter));
  }
}