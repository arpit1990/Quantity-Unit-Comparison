package QuantityComparison.Weight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeightUnitTest {

  @Test
  void expectOneWhenFactorGram() {
    assertEquals(1, WeightUnit.GRAM.factor());
  }
}