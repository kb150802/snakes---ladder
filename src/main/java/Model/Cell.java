package Model;

public class Cell {
    private int position;
    private Teleporter teleporter;
    public Cell(int position) {
        this.position = position;
    }

    public void setTeleporter(Teleporter teleporter) {
        this.teleporter = teleporter;
    }

    public int getPosition() {
        return position;
    }

    public Teleporter getTeleporter() {
        return teleporter;
    }
}
