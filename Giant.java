import java.awt.*;

public class Giant extends Critter{

    private int count = 0;
    private final int moves = 6;
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER)
            return Action.INFECT;
        else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        }
        else
            return Action.RIGHT;
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        if (count < 6) {
            count++;
            return "fee";
        }
        else if (count > 6 && count < 12) {
            count++;
            return "fie";
        }
        else if (count > 12 && count < 18) {
            count++;
            return "foe";
        }
        else {
            count++;
            if (count == 23)
                count = 0;
            return "fum";
        }

    }
}
