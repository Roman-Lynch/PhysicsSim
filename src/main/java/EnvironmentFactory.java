public class EnvironmentFactory {
    public Environment createEnvironment(String EnvironmentType, double height, double width) {
        if ("Earth".equals(EnvironmentType)) {
            return new Earth(height, width);
        } else if ("Mars".equals(EnvironmentType)) {
            return new Mars(height, width);
        } else if ("Jupiter".equals(EnvironmentType)) {
            return new Jupiter(height, width);
        } else if ("Neptune".equals(EnvironmentType)) {
            return new Neptune(height, width);
        } else if ("Moon".equals(EnvironmentType)) {
            return new Moon(height, width);
        } else if ("Venus".equals(EnvironmentType)) {
            return new Venus(height, width);
        } else if ("Saturn".equals(EnvironmentType)) {
            return new Saturn(height, width);
        } else if ("Mercury".equals(EnvironmentType)) {
            return new Mercury(height, width);
        } else if ("Uranus".equals(EnvironmentType)) {
            return new Mercury(height, width);
        } else if ("BlackHole".equals(EnvironmentType)) {
            return new BlackHole(height, width);
        } else if ("Sun".equals(EnvironmentType)) {
            return new Sun(height, width);
        }else {
            throw new IllegalArgumentException("Invalid environment type");
        }
    }
}
