package by.belhard.j20.lessons.lesson14.testingExample.CarDriver;

import by.belhard.j20.lessons.lesson14.testingExample.CarDriver.main.MarsDriver;
import by.belhard.j20.lessons.lesson14.testingExample.CarDriver.main.model.Route;

public class Main {

	public static void main(String[] args) {

		Route testRoute = Route.newBuilder().addPoint(1, 2).addPoint(2, 2).addPoint(4, 10).addPoint(1, 10).addPoint(1, 1).build();
		System.out.println(testRoute);
		Route randomRoute1 = RandomRouteFactory.getRandomRoute(5, 10);
		System.out.println(randomRoute1);
		Route randomRoute2 = RandomRouteFactory.getRandomRoute(5, 10);
		System.out.println(randomRoute2);
		Route randomRoute3 = RandomRouteFactory.getRandomRoute(5, 10);
		System.out.println(randomRoute3);
		System.out.println();

		MarsDriver driver1 = new MarsDriver("MarsDriverOne");
		System.out.println(driver1.toString());

		driver1.passRoute(testRoute);
		System.out.println(driver1.toString());
		driver1.passRoute(randomRoute1);
		System.out.println(driver1.toString());
		driver1.passRoute(randomRoute2);
		System.out.println(driver1.toString());
		driver1.passRoute(randomRoute3);

		System.out.println(driver1.toString());
	}
}
