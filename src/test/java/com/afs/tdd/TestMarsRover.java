package com.afs.tdd;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMarsRover {
    private final Random rand = new Random();
    int x = rand.nextInt();
    int y = rand.nextInt();

    @Test
    public void should_return_y_plus_when_command_M() {
        Location location = new Location(x, y, Direction.N);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.M);

        Location expectLocation = new Location(x, y + 1, Direction.N);
        assertEquals(expectLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    public void should_return_x_plus_when_command_M() {
        Location location = new Location(x, y, Direction.E);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.M);

        Location expectLocation = new Location(x + 1, y, Direction.E);
        assertEquals(expectLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    public void should_return_y_minus_when_command_M() {
        Location location = new Location(x, y, Direction.S);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.M);

        Location expectLocation = new Location(x, y - 1, Direction.S);
        assertEquals(expectLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    public void should_return_x_minus_when_command_M() {
        Location location = new Location(x, y, Direction.W);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.M);

        Location expectLocation = new Location(x - 1, y, Direction.W);
        assertEquals(expectLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    public void should_return_W_when_command_L() {
        Location location = new Location(x, y, Direction.N);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.L);

        Location expectLocation = new Location(x, y, Direction.W);
        assertEquals(expectLocation.toString() , marsRover.getLocation().toString());
    }

    @Test
    public void should_return_N_when_command_L() {
        Location location = new Location(x, y, Direction.E);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.L);

        Location expectLocation = new Location(x, y, Direction.N);
        assertEquals(expectLocation.toString() , marsRover.getLocation().toString());
    }

    @Test
    public void should_return_E_when_command_L() {
        Location location = new Location(x, y, Direction.S);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.L);

        Location expectLocation = new Location(x, y, Direction.E);
        assertEquals(expectLocation.toString() , marsRover.getLocation().toString());
    }

    @Test
    public void should_return_S_when_command_L() {
        Location location = new Location(x, y, Direction.W);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.L);

        Location expectLocation = new Location(x, y, Direction.S);
        assertEquals(expectLocation.toString() , marsRover.getLocation().toString());
    }

    @Test
    public void should_return_E_when_command_R() {
        Location location = new Location(x, y, Direction.N);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.R);

        Location expectLocation = new Location(x, y, Direction.E);
        assertEquals(expectLocation.toString() , marsRover.getLocation().toString());
    }

    @Test
    public void should_return_S_when_command_R() {
        Location location = new Location(x, y, Direction.E);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.R);

        Location expectLocation = new Location(x, y, Direction.S);
        assertEquals(expectLocation.toString() , marsRover.getLocation().toString());
    }

    @Test
    public void should_return_W_when_command_R() {
        Location location = new Location(x, y, Direction.S);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.R);

        Location expectLocation = new Location(x, y, Direction.W);
        assertEquals(expectLocation.toString() , marsRover.getLocation().toString());
    }

    @Test
    public void should_return_N_when_command_R() {
        Location location = new Location(x, y, Direction.W);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.R);

        Location expectLocation = new Location(x, y, Direction.N);
        assertEquals(expectLocation.toString() , marsRover.getLocation().toString());
    }

    @Test
    public void should_y_minus_when_command_B() {
        Location location = new Location(x, y, Direction.N);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.B);

        Location expectLocation = new Location(x, y - 1, Direction.N);
        assertEquals(expectLocation.toString() , marsRover.getLocation().toString());
    }

    @Test
    public void should_x_minus_when_command_B() {
        Location location = new Location(x, y, Direction.E);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.B);

        Location expectLocation = new Location(x - 1, y, Direction.E);
        assertEquals(expectLocation.toString() , marsRover.getLocation().toString());
    }

    @Test
    public void should_y_plus_when_command_B() {
        Location location = new Location(x, y, Direction.S);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.B);

        Location expectLocation = new Location(x, y + 1, Direction.S);
        assertEquals(expectLocation.toString() , marsRover.getLocation().toString());
    }

    @Test
    public void should_x_plus_when_command_B() {
        Location location = new Location(x, y, Direction.W);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.B);

        Location expectLocation = new Location(x + 1, y, Direction.W);
        assertEquals(expectLocation.toString() , marsRover.getLocation().toString());
    }

    @Test
    public void should_turn_left_and_move_when_command_LM() {
        Location location = new Location(x, y, Direction.N);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeBatchCommand(new Command[]{Command.L, Command.M});

        Location expectLocation = new Location(x - 1, y, Direction.W);
        assertEquals(expectLocation.toString() , marsRover.getLocation().toString());
    }

    @Test
    public void should_turn_right_and_move_when_command_RM() {
        Location location = new Location(x, y, Direction.N);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeBatchCommand(new Command[]{Command.R, Command.M});

        Location expectLocation = new Location(x + 1, y, Direction.E);
        assertEquals(expectLocation.toString() , marsRover.getLocation().toString());
    }
}
