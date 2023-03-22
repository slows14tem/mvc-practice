package org.example.mvc.view;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class JspView implements View{
    private final String name;

    public JspView(String name) {
        this.name = name;
    }

    @Override
    public void randor(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        //model에 값이 있으면 setArrtibute로 세팅
        model.forEach(request::setAttribute);
        //forwarding
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(name);
        requestDispatcher.forward(request, response);
    }
}
