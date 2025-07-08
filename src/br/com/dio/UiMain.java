package br.com.dio;

import ui.custom.button.frame.MainFrame;
import ui.custom.button.panel.MainPanel;
import ui.custom.button.screen.MainScreen;

import javax.swing.*;
import java.awt.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class UiMain {
    public static void main(String[] args) {
        final var gameConfig = Stream.of(args)
                .collect(toMap(
                        k -> k.split(";")[0],
                        v -> v.split(";")[1]));
        var mainScreen = new MainScreen(gameConfig);
        mainScreen.buildMainScreen();

    }
}
