public class Environment {
    protected double gravity;
    protected double height;
    protected double width;

    public Environment(double gravity, double height, double width)
    {
        this.gravity = gravity;
        this.height = height;
        this.width = width;
    }

    public double getGravity() { return gravity;}
    public double getHeight() { return height;}
    public double getWidth() { return width;}
}
