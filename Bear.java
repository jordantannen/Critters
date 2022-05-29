import java.awt.*;

public class Bear extends Critter {

    private boolean polar;
    private boolean onOff;

    public Bear (boolean polar){
        this.polar = polar;
        onOff = true;
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER)
            return Action.INFECT;
        else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        }
        else
            return Action.LEFT;
    }

    public Color getColor() {
        if (polar)
            return Color.WHITE;
        else
            return Color.BLACK;
    }

    public String toString() {
        if (onOff){
            onOff = false;
            return "/";
        }

        else {
            onOff = true;
            return "\\";
        }
    }
}
