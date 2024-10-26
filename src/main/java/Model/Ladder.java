package Model;

public class Ladder implements Teleporter{
    private final int startingPosition ;
    private final int endingPosition;

    public Ladder(int startingPosition, int endingPosition) {
        this.startingPosition = startingPosition;
        this.endingPosition = endingPosition;
    }

    public int getStartingPosition() {
        return startingPosition;
    }

    public int getEndingPosition() {
        return endingPosition;
    }
}
