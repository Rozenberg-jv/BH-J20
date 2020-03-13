package by.belhard.j20.lessons.lesson14.testingExample.CarDriver.main;

import by.belhard.j20.lessons.lesson14.testingExample.CarDriver.main.exceptions.InvalidRouteException;
import by.belhard.j20.lessons.lesson14.testingExample.CarDriver.main.model.Point;
import by.belhard.j20.lessons.lesson14.testingExample.CarDriver.main.model.Route;

import java.util.ArrayList;
import java.util.List;

public class MarsDriver {

	private String name;

	private Point position;

	private List<Route> routesPassed;

	private double distancePassed;

	public MarsDriver(String name) {

		this.name = name;
		this.position = new Point(0, 0);
		this.routesPassed = new ArrayList<>();
		this.distancePassed = 0;
	}

	public void passRoute(Route route) {

		if (route.getPoints().size() == 0)
			throw new InvalidRouteException();

		position.setPosition(route.getPoints().get(route.getPoints().size() - 1));
		distancePassed += position.getDistance(route.getPoints().get(0)) + route.getRouteLength();
		routesPassed.add(route);
	}

	public double distanceFromStart() {

		return position.getDistance(new Point(0, 0));
	}

	public int stepsCount() {

		int stepsCount = 0;

		if (routesPassed.size() > 0 && !routesPassed.get(0).getPoints().get(0).equals(new Point(0, 0)))
			stepsCount++;

		for (int i = 0; i < routesPassed.size() - 1; i++) {

			Point last = routesPassed.get(i).getPoints().get(routesPassed.get(i).getPoints().size() - 1);
			Point next = routesPassed.get(i + 1).getPoints().get(0);

			if (!last.equals(next))
				stepsCount++;
		}

		stepsCount += routesPassed.stream().mapToLong(r -> r.getPoints().size() - 1).sum();

		return stepsCount;
	}

	// common
	public String getName() {

		return name;
	}

	@Override
	public String toString() {

		return String.format("%s: passed %d routes(%d steps) with route length %.2f. Distance from start: %.2f",
				name, routesPassed.size(), stepsCount(), distancePassed, distanceFromStart());
	}

}
