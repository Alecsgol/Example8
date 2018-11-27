package ru.goluzov.se.player;

import ru.goluzov.se.constant.Dot;
import ru.goluzov.se.logic.Game;

import javax.swing.*;
import java.util.Random;

public class PC extends Player {

    public PC(String dot) {
        super(dot);
    }
    @Override
    public void turn(JButton btn) {
        btn.setText(dot);
    }
    private JButton randomAI() {
        int row;
        int col;
        Random random = new Random();
        return null;
    }
}
