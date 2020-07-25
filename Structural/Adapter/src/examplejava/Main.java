package examplejava;

import examplejava.adapters.SquarePegAdapter;
import examplejava.round.RoundHole;
import examplejava.round.RoundPeg;
import examplejava.square.SquarePeg;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) System.out.println("Round peg r5 fits round r5.");

        SquarePeg smallPeg = new SquarePeg(2);
        SquarePeg largePeg = new SquarePeg(20);

        SquarePegAdapter smallAdapter = new SquarePegAdapter(smallPeg);
        SquarePegAdapter largeAdapter = new SquarePegAdapter(largePeg);

        if (hole.fits(smallAdapter)) System.out.println("Square peg w2 fits round hole r5.");
        if (!hole.fits(largeAdapter)) System.out.println("Square peg w20 does not fit int round hole r5.");
    }
}
