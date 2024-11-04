public class Ball {
    private float x, y;
    private int radius;
    private float xDelta, yDelta;


    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;


        this.xDelta = (float) (speed * Math.cos(Math.toRadians(direction)));
        this.yDelta = (float) (speed * Math.sin(Math.toRadians(direction)));
    }


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }


    public float getY() {
        return y;
    }

    public void setY(float y) {


    }
}
