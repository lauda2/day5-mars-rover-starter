package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private Location location;
    private final int FORWARD = 1;
    private final int BACKWARD = -1;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command command) {
        switch (command) {
            case M -> move(FORWARD);
            case B -> move(BACKWARD);
            case L -> location = new Location(location.x(), location.y(), location.direction().left());
            case R -> location = new Location(location.x(), location.y(), location.direction().right());
        }
    }

    public void move(int movement) {
        location = new Location(
                location.x() + (location.direction() == Direction.E ? movement : location.direction() == Direction.W ? -movement : 0),
                location.y() + (location.direction() == Direction.N ? movement : location.direction() == Direction.S ? -movement : 0),
                location.direction()
        );
    }

    public Location getLocation() {
        return location;
    }

    public void executeBatchCommand(Command[] commands) {
        Arrays.stream(commands).forEach(this::executeCommand);
    }
}
