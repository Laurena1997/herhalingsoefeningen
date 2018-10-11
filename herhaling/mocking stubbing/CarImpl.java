package com.practicalunittesting.chp10;

import java.awt.*;

public class CarImpl implements Car {

	private Engine engine;
	private Color color;
	private Manufacturer manufacturer;

	public Engine getEngine() {
		return engine;
	}

	public Color getColor() {
		return color;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}


}
