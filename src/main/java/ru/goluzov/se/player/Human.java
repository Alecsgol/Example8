package ru.goluzov.se.player;

import ru.goluzov.se.constant.Dot;

import javax.swing.*;

public class Human extends Player {
    public Human(String dot) {
        super(dot);
    }
    @Override
    public void turn(JButton btn) {
        btn.setText(dot);
    }
}