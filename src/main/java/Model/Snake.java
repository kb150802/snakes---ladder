package Model;

public class Snake implements Teleporter{
    private final int startingPosition ;
    private final int endingPosition;

    public Snake(int startingPosition, int endingPosition) {
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
