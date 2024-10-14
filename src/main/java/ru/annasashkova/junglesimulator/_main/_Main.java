package ru.annasashkova.junglesimulator._main;

import ru.annasashkova.junglesimulator.entity.Capybara;
import ru.annasashkova.junglesimulator.util.EventMaker;

public class _Main {
    public static void main(String[] args) {
        Capybara capybara = new Capybara();
        EventMaker eventMaker = new EventMaker();
        eventMaker.activateEvent(capybara);
    }
}
