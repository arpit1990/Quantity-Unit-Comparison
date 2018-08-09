package Length;

import QuantityComparison.Length.Length;
import QuantityComparison.Length.LengthUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LengthTest {

  @Test
  public void expectsTrueWhenOneKmEqualsOneKm() {
    Length oneKm = new Length(1, LengthUnit.KILOMETER);
    Length otherOneKm = new Length(1, LengthUnit.KILOMETER);

    assertTrue(oneKm.equals(otherOneKm));
  }

  @Test
  public void expectsFalseWhenOneKmEqualsTwoKm() {
    Length oneKm = new Length(1, LengthUnit.KILOMETER);
    Length twoKm = new Length(2, LengthUnit.KILOMETER);

    assertFalse(oneKm.equals(twoKm));
  }

  @Test
  public void expectsFalseWhenTwoKmEqualsOneKm() {
    Length twoKm = new Length(2, LengthUnit.KILOMETER);
    Length oneKm = new Length(1, LengthUnit.KILOMETER);

    assertFalse(twoKm.equals(oneKm));
  }

  @Test
  public void expectsTrueWhenOneKmEqualsThousandMeter() {
    Length oneKm = new Length(1, LengthUnit.KILOMETER);
    Length thousandMeter = new Length(1000, LengthUnit.METER);

    assertTrue(oneKm.equals(thousandMeter));
  }

  @Test
  public void expectsTrueWhenHundredMeterEqualsOneByTenKm() {
    Length thousandMeter = new Length(100, LengthUnit.METER);
    Length zeroByTenKm = new Length(0.1, LengthUnit.KILOMETER);

    assertTrue(thousandMeter.equals(zeroByTenKm));
  }

  @Test
  public void expectsTrueWhenTwoMeterEqualsOneByThousandMillimeter() {
    Length twoMeter = new Length(2, LengthUnit.METER);
    Length oneByThousandMillimeter = new Length(2000, LengthUnit.MILLIMETER);

    assertTrue(twoMeter.equals(oneByThousandMillimeter));
  }
}
