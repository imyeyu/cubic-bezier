package net.imyeyu.cb;

import org.junit.Test;

import java.util.List;

public class CubicBezierTest {

	/** 线性 */
	@Test
	public void linear() {
		List<BezierPoint> points = new CubicBezier(.33, .33, .67, .67).precision(8).build();
		print(points);
	}

	/** 线性，放大 */
	@Test
	public void linearBoost() {
		List<BezierPoint> points = new CubicBezier(.33, .33, .67, .67).precision(8).boost(10).build();
		print(points);
	}

	/** 先快后慢 */
	@Test
	public void easeOutCubic() {
		List<BezierPoint> points = new CubicBezier(.23, 1, .32, 1).precision(8).build();
		print(points);
	}

	private void print(List<BezierPoint> list) {
		for (BezierPoint p : list) {
			System.out.print(p.y + ", ");
		}
	}
}