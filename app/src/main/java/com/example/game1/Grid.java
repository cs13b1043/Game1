package com.example.game1;

import android.content.Context;

/**
 * Created by USER on 2/7/2018.
 */

public class Grid {
    private Box[][] boxes;

    //box width, height and space between boxes
    private int width;
    private int height;
    private int space;

    //grid width and height
    private int grid_width;
    private int grid_height;

    //point for top left corner of box1
    private int leftX;
    private int topY;

    public Grid(Context context, int screenX, int screenY) {

        //setting box dimensions and space
        width = 20;
        height = 20;
        space = width / 2;

        //setting grid dimensions
        grid_width = 3*width + 4*space;
        grid_height = 3*height + 4*space;

        //setting corner point of box1
        leftX = (screenX - (3 * width + 2 * space)) / 2;
        topY = (screenY * 1 / 4);

        //initializing boxes and fixing their positions in the grid
        boxes = new Box[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boxes[i][j] = new Box(context, leftX + i * (width + space), topY + j * (height + space), width, height);
            }
        }

    }

    //method to update boxes(basically colors)
    public void update() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boxes[i][j].update();
            }
        }
    }

    public int getGrid_width() {
        return grid_width;
    }

    public int getGrid_height() {
        return grid_height;
    }

    public int getLeftX() {
        return leftX;
    }

    public int getTopY() {
        return topY;
    }

    public Box[][] getBoxes() {
        return boxes;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getSpace() {
        return space;
    }
}
