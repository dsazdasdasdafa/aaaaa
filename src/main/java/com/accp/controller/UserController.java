package com.accp.controller;

import com.accp.com.accp.entity.UserMessage;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class UserController {

    @RequestMapping(value = "/showJson")
    public String showJson(HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        //{"error":1,"message":"出错了"}
        out.print("{\"error\":1,\"message\":\"出错了\"}");
        out.flush();
        out.close();
        return null;
    }

    @RequestMapping(value = "/showJson2",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String showJson2(){
        return "{\"error\":1,\"message\":\"出错了\"}";
    }

    @RequestMapping(value = "/showJson3")
    @ResponseBody
    public String showJson3(){
        return "{\"error\":1,\"message\":\"出错了\"}";
    }

    @RequestMapping(value = "/showJson4")
    public @ResponseBody String showJson4(){
        return JSON.toJSONString(new UserMessage(1,"出错了"));
    }

    @RequestMapping(value = "/showJson5")
    @ResponseBody
    public Object showJson5(){
        return new UserMessage(1,"出错了");
    }
}
