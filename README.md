# cubic-bezier
类似 CSS 3 的二次贝塞尔曲线生成器

### 示例
```java
// 共 120 帧先快后慢向右平移 300 像素（时间决定于渲染 FPS）
// 成员变量
long frame = 0;

Region region = new Region();
region.setPrefSize(100, 100);
region.setBackground(...);

List&lt;BezierPoint&gt; bps = new CubicBezier(.23, 1, .32, 1).precision(120).build();
AnimationTimer timer = new AnimationTimer() {
    public void handle(long now) {
        if (frame < bps.size()) {
            region.setTranslateX(bps.get(frame).y * 300);
            frame++;
        } else {
            timer.stop();
        }
    }
};
timer.start();
```