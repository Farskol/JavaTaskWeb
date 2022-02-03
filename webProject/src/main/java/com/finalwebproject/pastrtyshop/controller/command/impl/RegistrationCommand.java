package com.finalwebproject.pastrtyshop.controller.command.impl;

import com.finalwebproject.pastrtyshop.controller.Router;
import com.finalwebproject.pastrtyshop.controller.command.Command;
import com.finalwebproject.pastrtyshop.exception.CommandException;
import jakarta.servlet.http.HttpServletRequest;

public class RegistrationCommand implements Command {
    @Override
    public Router execute(HttpServletRequest request) throws CommandException {
        return null;
    }
}
