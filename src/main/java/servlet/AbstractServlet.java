package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class AbstractServlet extends HttpServlet {
    protected final ObjectMapper objectMapper;

    protected AbstractServlet() {
        this.objectMapper = new ObjectMapper();
    }

    protected void sendResponse(HttpServletResponse response, Object data, int status) throws IOException {
        response.setStatus(status);
        response.setContentType("text/json");
        response.setCharacterEncoding("UTF-8");
        objectMapper.writeValue(response.getWriter(), data);
    }

    protected <T> T readRequestBody(HttpServletRequest request, Class<T> clazz) throws IOException {
        String body = request.getReader().lines().collect(Collectors.joining());
        return objectMapper.readValue(body, clazz);
    }
}