package by.belhard.j20.lessons.lesson14.testingExample.CarDriver.test;

import by.belhard.j20.lessons.lesson14.testingExample.CarDriver.main.model.Point;
import by.belhard.j20.lessons.lesson14.testingExample.CarDriver.main.model.Route;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RouteTest {

	@Test
	public void testRouteBuilderNewBuild() {

		Route asserted = Route.newBuilder().addPoint(0, 0).addPoint(1, 1).addPoint(0, 0).build();

		List<Point> points = asserted.getPoints();

		Assert.assertEquals(3, points.size());
	}

	@Test
	public void testRouteGetDistance() {

		Route asserted = Route.newBuilder().addPoint(0, 0).addPoint(13, 5).addPoint(3, 4).build();

		Assert.assertEquals(5.0, asserted.getDistance(), 0.001);
	}

	@Test
	public void testRouteGetDistanceZero() {

		Route asserted = Route.newBuilder().addPoint(0, 0).addPoint(1, 1).addPoint(0, 0).build();

		Assert.assertEquals(0.0, asserted.getDistance(), 0.0001);
	}

	@Test
	public void testRouteGetRouteLength() {

		Route asserted = Route.newBuilder().addPoint(0, 0).addPoint(3, 4).addPoint(-3, -4).addPoint(0, 0).build();

		Assert.assertEquals(20.0, asserted.getRouteLength(), 0.0001);
	}

	@Test
	public void testRouteGetRouteLengthZero() {

		Route asserted = Route.newBuilder().addPoint(0, 0).addPoint(0, 0).addPoint(0, 0).addPoint(0, 0).build();

		Assert.assertEquals(0.0, asserted.getRouteLength(), 0.0001);
	}

	@Test
	public void testRouteGetRouteLengthNoPoints() {

		Route asserted = Route.newBuilder().build();

		Assert.assertEquals(0.0, asserted.getRouteLength(), 0.0001);
	}

}
