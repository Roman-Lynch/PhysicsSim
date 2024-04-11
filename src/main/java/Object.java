import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Object
{
    double height;
    double width;
    double velocity;
    double mass;
    Direction direction;

    public Object(double height, double width, double velocity, double mass, Direction direction)
    {
        this.height = height;
        this.width = width;
        this.velocity = velocity;
        this.mass = mass;
        this.direction = direction;
    }

    public static Builder newBuilder()
    {
        return new Builder();
    }

    public static class Builder
    {
        double height;
        double width;
        double velocity;
        double mass;
        Direction direction;

        public Builder shape(double height, double width)
        {
            this.height = height;
            this.width = width;
            return this;
        }
        public Builder velocity(double velocity)
        {
            this.velocity = velocity;
            return this;
        }
        public Builder mass(double mass)
        {
            this.mass = mass;
            return this;
        }
        public Builder direction(Direction direction)
        {
            this.direction = direction;
            return this;
        }
        public Object create()
        {
            Object obj = new Object(height, width, velocity, mass, direction);
            return obj;
        }

    }
}
