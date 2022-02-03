package com.finalwebproject.pastrtyshop.controller.factory;

import com.finalwebproject.pastrtyshop.controller.command.Command;
import com.finalwebproject.pastrtyshop.controller.command.impl.LoginCommand;


import java.util.Optional;

public enum CommandType {
    LOGIN(new LoginCommand()),
    REGISTRATION(new LoginCommand());

    private final Command command;

    CommandType (Command command){
        this.command = command;
    }

    public Command getCommand(){
        return this.command;
    }

    public static Optional<Command> provideCommand(String command){
        Optional<Command> resultCommand;
        if( command == null || command.isEmpty()){
            return Optional.empty();
        }
        try{
            CommandType commandType = CommandType.valueOf(command.toUpperCase());
            resultCommand = Optional.of(commandType.getCommand());
        }
        catch (IllegalArgumentException e){
            return Optional.empty();
        }
        return resultCommand;
    }
}
