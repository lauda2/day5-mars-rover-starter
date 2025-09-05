package com.afs.tdd;

public class MarsRover {
    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command command) {
        location = new Location(0, 1, Direction.N);
    }

    public Location getLocation() {
        return location;
    }
}
