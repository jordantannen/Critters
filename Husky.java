import java.awt.*;
import java.util.Random;

public class Husky extends Critter {
    private final Random rand = new Random();

    public Action getMove(CritterInfo info) {
        int leftRight = rand.nextInt(2) + 1;

        if (info.getFront() == Neighbor.OTHER)
            return Action.INFECT;
        else if (info.backThreat()) {
            return Action.HOP;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            if (leftRight == 1)
                return Action.RIGHT;
            else
                return Action.LEFT;
        }
    }

    public Color getColor() {
        return Color.MAGENTA;
    }

    public String toString() {
        return "H";
    }

}
