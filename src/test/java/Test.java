public class Test {

    Object obj = Object.newBuilder()
            .shape()
            .mass()
            .velocity()
            .direction()
            .create();

    Sim runSim = Sim.newBuilder()
            .createAndAddMars(height, width)
            .addObject(obj)
            .addObject(obj)
            .setRunTime(5)
            .run();
}
