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
        assertEquals(expectLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    public void should_return_x_plus_when_command_M() {
        Location location = new Location(0, 0, Direction.E);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.M);

        Location expectLocation = new Location(1, 0, Direction.E);
        assertEquals(expectLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    public void should_return_y_minus_when_command_M() {
        Location location = new Location(0, 0, Direction.S);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.M);

        Location expectLocation = new Location(0, -1, Direction.S);
        assertEquals(expectLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    public void should_return_x_minus_when_command_M() {
        Location location = new Location(0, 0, Direction.W);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.M);

        Location expectLocation = new Location(-1, 0, Direction.W);
        assertEquals(expectLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    public void should_return_W_when_command_L() {
        Location location = new Location(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.L);

        Location expectLocation = new Location(0, 0, Direction.W);
        assertEquals(expectLocation.toString() , marsRover.getLocation().toString());
    }
}
