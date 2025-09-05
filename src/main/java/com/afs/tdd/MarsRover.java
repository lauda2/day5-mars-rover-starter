package com.afs.tdd;

public class MarsRover {
    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command command) {
        if (location.direction() == Direction.N) {
            location = new Location(0, 1, Direction.N);
        } else if (location.direction() == Direction.E) {
            location = new Location(1, 0, Direction.E);
        } else if (location.direction() == Direction.S) {
            location = new Location(0, -1, Direction.S);
        } else if (location.direction() == Direction.W) {
            location = new Location(-1, 0, Direction.W);
        }
    }

    public Location getLocation() {
        return location;
    }
}
