package by.belhard.j20.lessons.lesson14.testingExample.CarDriver;

import by.belhard.j20.lessons.lesson14.testingExample.CarDriver.main.model.Route;

public class RandomRouteFactory {

	public static Route getRandomRoute(int stepsCount, double maxAxisDelta) {

		Route.RouteBuilder routeBuilder = Route.newBuilder();

		for (int i = 0; i < stepsCount; i++) {

			routeBuilder.addPoint(Math.random() * maxAxisDelta, Math.random() * maxAxisDelta);
		}

		return routeBuilder.build();
	}
}
