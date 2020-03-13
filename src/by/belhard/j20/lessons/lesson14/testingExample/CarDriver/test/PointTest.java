package by.belhard.j20.lessons.lesson14.testingExample.CarDriver.test;

import by.belhard.j20.lessons.lesson14.testingExample.CarDriver.main.model.Point;
import org.junit.*;

public class PointTest {

	private Point startPoint;

	@BeforeClass
	public static void beforeClass() {

	}

	@Before
	public void setUp() {

		startPoint = new Point(0, 0);
	}

	@After
	public void tearDown() {

	}

	@AfterClass
	public static void afterClass() {

	}

	@Test
	public void testPointDistance() {

		double asserted = startPoint.getDistance(new Point(3, 4));
		double expected = 5.0;

		Assert.assertEquals(expected, asserted, 0.01);
	}

	@Test
	public void testPointEquality() {

		Point point = new Point(0, 0);

		Assert.assertEquals(startPoint, point);
	}

	@Test
	public void testPointSetPosition() {

		Point point = new Point(1, 1);
		point.setPosition(startPoint);

		Assert.assertEquals(startPoint, point);
	}

}
