package QuantityComparison.Length;

import QuantityComparison.Unit;

public enum LengthUnit implements Unit {
  KILOMETER(1000),
  METER(1), // Central Unit
  MILLIMETER(0.001);

  private final double factor;

  LengthUnit(double factor) {
    this.factor = factor;
  }

  @Override
  public double factor() {
    return this.factor;
  }

  public double toMeter(double value) {
    return this.factor * value;
  }
}