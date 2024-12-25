package servlet;

import db.ConnectionManagerDB;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.AuthorsService;
import service.impl.AuthorsServiceImpl;
import servlet.dto.AuthorsDto;
import java.io.IOException;
import java.sql.*;
import java.util.List;


@WebServlet(urlPatterns = "/authors")
public class AuthorsServlet extends AbstractServlet {

    AuthorsService authorService = new AuthorsServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        List<AuthorsDto> authors = authorService.findAll();
        sendResponse(response, authors, HttpServletResponse.SC_OK);
    }

}
