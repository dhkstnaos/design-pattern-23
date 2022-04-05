package com.programmers.command;

import java.util.Stack;

public class Button {
    private Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if(!commands.isEmpty()) {
            Command pop = commands.pop();
            pop.undo();
        }
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.press(new GameCommand(new Game()));
        button.press(new LightCommand(new Light()));
        button.undo();
        button.undo();
    }
}
