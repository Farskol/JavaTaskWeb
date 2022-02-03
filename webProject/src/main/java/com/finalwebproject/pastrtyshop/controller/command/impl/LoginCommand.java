package com.finalwebproject.pastrtyshop.controller.command.impl;

import com.finalwebproject.pastrtyshop.controller.Router;
import com.finalwebproject.pastrtyshop.controller.command.Command;
import com.finalwebproject.pastrtyshop.entity.Client;
import com.finalwebproject.pastrtyshop.exception.CommandException;
import com.finalwebproject.pastrtyshop.service.ClientService;
import com.finalwebproject.pastrtyshop.service.impl.ClientServiceImpl;
import jakarta.servlet.http.HttpServletRequest;

import static com.finalwebproject.pastrtyshop.controller.LinksToPages.MAIN_PAGE;

import java.util.Optional;

import static com.finalwebproject.pastrtyshop.controller.Parameters.*;

public class LoginCommand implements Command {
    @Override
    public Router execute(HttpServletRequest request) throws CommandException {
        String login = request.getParameter(LOGIN);
        String password = request.getParameter(PASSWORD);

        ClientService service = new ClientServiceImpl(); //todo
        Optional<Client> client = service.login(login, password);
        request.setAttribute("firstName", client.get().getFirstName());
        request.setAttribute("role", client.get().getRole().toString());
        Router router = new Router();
        router.setPagePath(MAIN_PAGE);
        return router;
    }
}
