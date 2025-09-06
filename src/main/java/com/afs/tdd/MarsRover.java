package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command command) {
        switch (command) {
            case M -> location = new Location(
                    location.x() + (location.direction() == Direction.E ? 1 : location.direction() == Direction.W ? -1 : 0),
                    location.y() + (location.direction() == Direction.N ? 1 : location.direction() == Direction.S ? -1 : 0),
                    location.direction()
            );
            case B -> location = new Location(
                    location.x() + (location.direction() == Direction.E ? -1 : location.direction() == Direction.W ? 1 : 0),
                    location.y() + (location.direction() == Direction.N ? -1 : location.direction() == Direction.S ? 1 : 0),
                    location.direction()
            );
            case L -> location = new Location(location.x(), location.y(), location.direction().left());
            case R -> location = new Location(location.x(), location.y(), location.direction().right());
        }
    }

    public Location getLocation() {
        return location;
    }

    public void executeBatchCommand(Command[] commands) {
        Arrays.stream(commands).forEach(this::executeCommand);
    }
}
