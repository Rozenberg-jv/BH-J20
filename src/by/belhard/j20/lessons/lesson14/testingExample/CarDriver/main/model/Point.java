package by.belhard.j20.lessons.lesson14.testingExample.CarDriver.main.model;

import java.util.Objects;

public class Point {

	private double x;
	private double y;

	public Point(double x, double y) {

		this.x = x;
		this.y = y;
	}

	public void setPosition(double x, double y) {

		this.x = x;
		this.y = y;
	}

	public void setPosition(Point p) {

		this.setPosition(p.x, p.y);
	}

	public double getDistance(Point another) {

		if (this.equals(another))
			return 0;

		return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof Point))
			return false;
		Point point = (Point) o;
		return Double.compare(point.x, x) == 0 &&
				Double.compare(point.y, y) == 0;
	}

	@Override
	public int hashCode() {

		return Objects.hash(x, y);
	}

	@Override
	public String toString() {

		return String.format("[%.2f:%.2f]", x, y);
	}
}
