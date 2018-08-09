import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeightTest {

  @Test
  public void expectsTrueWhenOneKgEqualsOneKG() {
    Weight oneKg = new Weight(1, Unit.KILOGRAM);
    Weight otherOneKg = new Weight(1, Unit.KILOGRAM);

    assertEquals(true, oneKg.equals(otherOneKg));
  }

  @Test
  public void expectsFalseWhenOneKgEqualsTwoKg() {
    Weight oneKg = new Weight(1, Unit.KILOGRAM);

    Weight twoKg = new Weight(2, Unit.KILOGRAM);

    assertEquals(false, oneKg.equals(twoKg));
  }

  @Test
  public void expectsFalseWhenTwoKgEqualsOneKg() {
    Weight twoKg = new Weight(2, Unit.KILOGRAM);

    Weight oneKg = new Weight(1, Unit.KILOGRAM);

    assertEquals(false, twoKg.equals(oneKg));
  }

  @Test
  public void expectsTrueWhenOneKgEqualsThousandGrams() {
    Weight oneKg = new Weight(1, Unit.KILOGRAM);

    Weight thousandGrams = new Weight(1000, Unit.GRAM);

    assertEquals(true, oneKg.equals(thousandGrams));
  }

  @Test
  public void expectsTrueWhenHundredGramEqualsOneByTenKg() {
    Weight thousandGram = new Weight(100, Unit.GRAM);

    Weight zeroByTenKg = new Weight(0.1, Unit.KILOGRAM);

    assertEquals(true, thousandGram.equals(zeroByTenKg));
  }
}