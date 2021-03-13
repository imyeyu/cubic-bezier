# CubicBezier

类似 CSS 3 的二次贝塞尔曲线生成器。可视化二次贝塞尔生成器
[CubicBezier-FX](https://github.com/imyeyu/cubic-bezier-fx)

> 线性动画是没有灵魂的，让 JavaFX 可以像 CSS3 那样快速制作非线性动画帧

#### 在 CSS3 中

```
transition: 1s cubic-bezier(.23, 1, .32, 1);
```

#### 在 JavaFX 的 CubicBezier 中

```java
new CubicBezier(.23, 1, .32, 1).precision(60).build();
```

#### 示例
```java
// 共 120 帧先快后慢向右平移 300 像素（时间决定于渲染 FPS）

long frame = 0; // 成员变量

Region region = new Region();
region.setPrefSize(100, 100);
region.setBackground(...);

List<BezierPoint> bps = new CubicBezier(.23, 1, .32, 1).precision(120).build();
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

#### 注意

> 目前 CubicBezier 只支持二次贝塞尔（CSS3 也是二次）