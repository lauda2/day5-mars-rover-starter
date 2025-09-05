package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMarsRover {
    @Test
    public void should_return_y_plus_when_command_M() {
        Location location = new Location(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.M);

        Location expectLocation = new Location(0, 1, Direction.N);
        assertEquals(marsRover.getLocation().toString(), expectLocation.toString());
    }

    @Test
    public void should_return_x_plus_when_command_M() {
        Location location = new Location(0, 0, Direction.E);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.M);

        Location expectLocation = new Location(1, 0, Direction.E);
        assertEquals(marsRover.getLocation().toString(), expectLocation.toString());
    }

    @Test
    public void should_return_y_minus_when_command_M() {
        Location location = new Location(0, 0, Direction.S);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.M);

        Location expectLocation = new Location(0, -1, Direction.S);
        assertEquals(marsRover.getLocation().toString(), expectLocation.toString());
    }
}
