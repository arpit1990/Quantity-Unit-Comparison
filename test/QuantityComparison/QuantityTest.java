package QuantityComparison;

import QuantityComparison.Weight.WeightUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

  @Test
  public void expectsTrueWhenTwoKgsEqualsTwoThousandGrams() {
    Quantity twoKg = new Quantity(2, WeightUnit.KILOGRAM);
    Quantity twoThousandGram = new Quantity(2, WeightUnit.KILOGRAM);

    assertEquals(true, twoKg.equals(twoThousandGram));
  }
}