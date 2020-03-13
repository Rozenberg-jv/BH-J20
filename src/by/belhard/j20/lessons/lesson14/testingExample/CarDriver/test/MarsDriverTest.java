package by.belhard.j20.lessons.lesson14.testingExample.CarDriver.test;

import by.belhard.j20.lessons.lesson14.testingExample.CarDriver.main.MarsDriver;
import by.belhard.j20.lessons.lesson14.testingExample.CarDriver.main.model.Route;
import org.junit.Assert;
import org.junit.Test;

public class MarsDriverTest {

	@Test
	public void testMarsDriverStepsCountFromStartPosition() {

		MarsDriver marsDriver = new MarsDriver("TestMarsDriver");

		Route testRoute1 = Route.newBuilder().addPoint(0, 0).addPoint(2, 2).addPoint(1, 1).build();
		Route testRoute2 = Route.newBuilder().addPoint(1, 1).addPoint(3, 3).addPoint(0, 0).build();

		marsDriver.passRoute(testRoute1);
		marsDriver.passRoute(testRoute2);

		int stepsCount = marsDriver.stepsCount();

		Assert.assertEquals(4, stepsCount);
	}

	@Test
	public void testMarsDriverStepsCountMultipleRoutes() {

		MarsDriver marsDriver = new MarsDriver("TestMarsDriver");

		Route testRoute1 = Route.newBuilder().addPoint(1, 1).addPoint(2, 2).addPoint(0, 0).build();
		Route testRoute2 = Route.newBuilder().addPoint(1, 1).addPoint(2, 2).addPoint(0, 0).build();

		marsDriver.passRoute(testRoute1);
		marsDriver.passRoute(testRoute2);

		int stepsCount = marsDriver.stepsCount();

		Assert.assertEquals(6, stepsCount);
	}

}
