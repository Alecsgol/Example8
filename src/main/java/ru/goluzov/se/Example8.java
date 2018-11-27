package ru.goluzov.se;

import ru.goluzov.se.constant.Dot;
import ru.goluzov.se.logic.Game;
import ru.goluzov.se.player.Human;
import ru.goluzov.se.player.PC;

import javax.swing.*;

/**

 * <p>
 * Сделать крестики-нолики 3x3 с использованием Swing
 */
public class Example8 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Game(new Human(Dot.X.getDot()), new PC(Dot.O.getDot())));
    }
}