package Weight;

import QuantityComparison.Weight.Weight;
import QuantityComparison.Weight.WeightUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeightTest {

  @Test
  public void expectsTrueWhenOneKgEqualsOneKG() {
    Weight oneKg = new Weight(1, WeightUnit.KILOGRAM);
    Weight otherOneKg = new Weight(1, WeightUnit.KILOGRAM);

    assertEquals(true, oneKg.equals(otherOneKg));
  }

  @Test
  public void expectsFalseWhenOneKgEqualsTwoKg() {
    Weight oneKg = new Weight(1, WeightUnit.KILOGRAM);

    Weight twoKg = new Weight(2, WeightUnit.KILOGRAM);

    assertEquals(false, oneKg.equals(twoKg));
  }

  @Test
  public void expectsFalseWhenTwoKgEqualsOneKg() {
    Weight twoKg = new Weight(2, WeightUnit.KILOGRAM);

    Weight oneKg = new Weight(1, WeightUnit.KILOGRAM);

    assertEquals(false, twoKg.equals(oneKg));
  }

  @Test
  public void expectsTrueWhenOneKgEqualsThousandGrams() {
    Weight oneKg = new Weight(1, WeightUnit.KILOGRAM);

    Weight thousandGrams = new Weight(1000, WeightUnit.GRAM);

    assertEquals(true, oneKg.equals(thousandGrams));
  }

  @Test
  public void expectsTrueWhenHundredGramEqualsOneByTenKg() {
    Weight thousandGram = new Weight(100, WeightUnit.GRAM);

    Weight zeroByTenKg = new Weight(0.1, WeightUnit.KILOGRAM);

    assertEquals(true, thousandGram.equals(zeroByTenKg));
  }

  @Test
  public void expectsTrueWhenTwoGramsEqualsOneByThousandMilligram() {
    Weight twoGram = new Weight(2, WeightUnit.GRAM);

    Weight oneByThousandMilligram = new Weight(2000, WeightUnit.MILLIGRAM);

    assertEquals(true, twoGram.equals(oneByThousandMilligram));
  }
}