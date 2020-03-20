package com.javarush.games.minesweeper;

public class GameObject {
    public int x, y;
    public boolean isMine;

    public GameObject(int a, int b, boolean isMine) {
        this.x = a;
        this.y = b;
        this.isMine=isMine;
    }
}
