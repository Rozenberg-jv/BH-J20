package by.belhard.j20.lessons.lesson14.testingExample.CarDriver.main.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Route {

	private List<Point> points;

	private Route(List<Point> points) {

		this.points = points;
	}

	/**
	 * @return distance between the first and the last points of route
	 */
	public double getDistance() {

		if (points.size() <= 1)
			return 0;

		return points.get(0).getDistance(points.get(points.size() - 1));
	}

	public double getRouteLength() {

		double length = 0;

		for (int i = 0; i < points.size() - 1; i++) {
			Point current = points.get(i);
			Point next = points.get(i + 1);

			length += current.getDistance(next);
		}

		return length;
	}

	public List<Point> getPoints() {

		return points;
	}

	@Override
	public String toString() {

		return points.stream().map(Point::toString).collect(Collectors.joining(",", "Route: ", ""));
	}

	// builder
	public static RouteBuilder newBuilder() {

		return new RouteBuilder();
	}

	public static class RouteBuilder {

		private List<Point> checkpoints = new ArrayList<>();

		public RouteBuilder addPoint(Point p) {

			checkpoints.add(p);

			return this;
		}

		public RouteBuilder addPoint(double x, double y) {

			checkpoints.add(new Point(x, y));

			return this;
		}

		public Route build() {

			return new Route(checkpoints);
		}

	}
}
