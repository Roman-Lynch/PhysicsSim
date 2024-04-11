public class Test {

    double height = 5;
    double width = 5;
    double velocity = 1000; // m/s
    double mass = 100; // kg

    Object obj = Object.newBuilder()
            .shape(height, width)
            .mass(mass)
            .velocity(velocity)
            .direction(Direction.RIGHT)
            .create();

    Sim runSim = Sim.newBuilder()
            .createAndAddMars(height, width)
            .addObject(obj)
            .addObject(obj)
            .setRunTime(5)
            .run();
}
