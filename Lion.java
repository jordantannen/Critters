import java.awt.*;
import java.util.Random;

public class Lion extends Critter{

    private Random rand = new Random();
    int color = rand.nextInt(3) + 1;
    private int count = 0;
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER)
            return Action.INFECT;
        else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else
            return Action.HOP;
    }

    public Color getColor() {

        if (count == 2){
            color = rand.nextInt(3) + 1;
            count = 0;
        }

        if (color == 1){
            count++;
            return Color.RED;
        } else if (color == 2) {
            count++;
            return Color.BLUE;
        } else {
            count++;
            return Color.GREEN;
        }
    }

    public String toString() {
        return "L";
    }
}
