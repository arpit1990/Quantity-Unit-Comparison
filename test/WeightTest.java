import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WeightTest {

  @Test
  public void expectsTrueWhenOneKgEqualsOneKG() {
    Weight oneKg = new Weight(1, "KILOGRAM");
    Weight otherOneKg = new Weight(1, "KILOGRAM");

    assertEquals(true, oneKg.equals(otherOneKg));
  }

  @Test
  public void expectsFalseWhenOneKgEqualsTwoKg() {
    Weight oneKg = new Weight(1, "KILOGRAM");

    Weight twoKg = new Weight(2, "KILOGRAM");

    assertEquals(false, oneKg.equals(twoKg));
  }

  @Test
  public void expectsFalseWhenTwoKgEqualsOneKg() {
    Weight twoKg = new Weight(2, "KILOGRAM");

    Weight oneKg = new Weight(1, "KILOGRAM");

    assertEquals(false, twoKg.equals(oneKg));
  }
}