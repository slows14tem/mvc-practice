package org.example.mvc;

import org.example.mvc.controller.*;
import org.example.reflection.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

public class RequsetMappingHandlerMapping implements HandlerMapping {
    // [key] : /users, [value] : UserController
    private Map<HandlerKey, Controller> mappings = new HashMap<>();

    void init(){
        //경로가 없으면 HomeController를 리턴
//        mappings.put(new HandlerKey(RequestMethod.GET, "/"), new HomeController());
        mappings.put(new HandlerKey(RequestMethod.GET, "/users"), new UserListController());
        mappings.put(new HandlerKey(RequestMethod.POST, "/users"), new UserCreateController());
        mappings.put(new HandlerKey(RequestMethod.GET, "/user/form"), new ForwardController("/user/form"));
    }

    public Controller findHandler(HandlerKey handlerKey){
        //url path와 일치하는 controller를 리턴
        return mappings.get(handlerKey);
    }
}
