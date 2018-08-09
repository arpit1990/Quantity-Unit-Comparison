package QuantityComparison.Length;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthUnitTest {

  @Test
  void expectOneWhenFactorMeter() {
    assertEquals(1, LengthUnit.METER.factor());
  }
}