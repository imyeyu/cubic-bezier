package net.imyeyu.cb;

/**
 * 坐标点
 * 
 * 夜雨 创建于 2021/3/12 20:05
 */
public class BezierPoint {

	public double x;
	public double y;
	
	public BezierPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void boost(int v) {
		this.x *= v;
		this.y *= v;
	}
}