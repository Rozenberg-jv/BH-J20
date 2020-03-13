package by.belhard.j20.lessons.lesson14.testingExample.CarDriver.test;

import by.belhard.j20.lessons.lesson14.testingExample.CarDriver.main.MarsDriver;
import by.belhard.j20.lessons.lesson14.testingExample.CarDriver.main.exceptions.InvalidRouteException;
import by.belhard.j20.lessons.lesson14.testingExample.CarDriver.main.model.Route;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MarsDriverTest {

	private MarsDriver marsDriver;

	private static Route testRoute1;
	private static Route testRoute2;
	private static Route testRoute3;
	private static Route testRoute4;

	@BeforeClass
	public static void beforeClass() {

		testRoute1 = Route.newBuilder().addPoint(0, 0).addPoint(2, 2).addPoint(1, 1).build();
		testRoute2 = Route.newBuilder().addPoint(1, 1).addPoint(3, 3).addPoint(0, 0).build();
		testRoute3 = Route.newBuilder().addPoint(1, 1).addPoint(2, 2).addPoint(0, 0).build();
		testRoute4 = Route.newBuilder().build();
	}

	@Before
	public void setUp() {

		marsDriver = new MarsDriver("TestMarsDriver");
	}

	@Test
	public void testMarsDriverStepsCountFromStartPosition() {

		marsDriver.passRoute(testRoute1);
		marsDriver.passRoute(testRoute3);

		int stepsCount = marsDriver.stepsCount();

		Assert.assertEquals(4, stepsCount);
	}

	@Test
	public void testMarsDriverStepsCountMultipleRoutes() {

		MarsDriver marsDriver = new MarsDriver("TestMarsDriver");

		marsDriver.passRoute(testRoute2);
		marsDriver.passRoute(testRoute2);

		int stepsCount = marsDriver.stepsCount();

		Assert.assertEquals(6, stepsCount);
	}

	@Test(expected = InvalidRouteException.class)
	public void testMarsDriverPassRouteInvalidRouteException() {

		marsDriver.passRoute(testRoute4);
	}

}
