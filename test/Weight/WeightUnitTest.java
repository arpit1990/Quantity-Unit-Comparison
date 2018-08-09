package Weight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightUnitTest {

  @Test
  void expectOneWhenFactorGram() {
    assertEquals(1, WeightUnit.GRAM.factor());
  }
}