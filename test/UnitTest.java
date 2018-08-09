import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {

  @Test
  void expectOneWhenFactorGram() {
    assertEquals(1, Unit.GRAM.factor());
  }
}