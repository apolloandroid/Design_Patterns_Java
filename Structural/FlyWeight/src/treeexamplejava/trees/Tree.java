package treeexamplejava.trees;

import java.awt.Graphics;

public class Tree {
    private int x, y;
    private TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw(Graphics g) {
        treeType.draw(g, x, y);
    }
}
