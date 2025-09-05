package com.afs.tdd;

public class MarsRover {
    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command command) {
        if (command == Command.M) {
            if (location.direction() == Direction.N) {
                location = new Location(location.x(), location.y() + 1, Direction.N);
            } else if (location.direction() == Direction.E) {
                location = new Location(location.x() + 1, location.y(), Direction.E);
            } else if (location.direction() == Direction.S) {
                location = new Location(location.x(), location.y() - 1, Direction.S);
            } else if (location.direction() == Direction.W) {
                location = new Location(location.x() - 1, location.y(), Direction.W);
            }
        } else if (command == Command.L) {
            if (location.direction() == Direction.N) {
                location = new Location(location.x(), location.y(), Direction.W);
            } else if (location.direction() == Direction.E) {
                location = new Location(location.x(), location.y(), Direction.N);
            } else if (location.direction() == Direction.S) {
                location = new Location(location.x(), location.y(), Direction.E);
            } else if (location.direction() == Direction.W) {
                location = new Location(location.x(), location.y(), Direction.S);
            }
        } else if (command == Command.R) {
            if (location.direction() == Direction.N) {
                location = new Location(location.x(), location.y(), Direction.E);
            } else if (location.direction() == Direction.E) {
                location = new Location(location.x(), location.y(), Direction.S);
            } else if (location.direction() == Direction.S) {
                location = new Location(location.x(), location.y(), Direction.W);
            } else if (location.direction() == Direction.W) {
                location = new Location(location.x(), location.y(), Direction.N);
            }
        } else if (command == Command.B) {
            if (location.direction() == Direction.N) {
                location = new Location(location.x(), location.y() - 1, Direction.N);
            } else if (location.direction() == Direction.E) {
                location = new Location(location.x() - 1, location.y(), Direction.E);
            } else if (location.direction() == Direction.S) {
                location = new Location(location.x(), location.y() + 1, Direction.S);
            } else if (location.direction() == Direction.W) {
                location = new Location(location.x() + 1, location.y(), Direction.W);
            }
        }
    }

    public Location getLocation() {
        return location;
    }
}
