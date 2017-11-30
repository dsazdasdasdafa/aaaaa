package com.accp.demo;

import com.accp.com.accp.entity.Student;
import com.accp.com.accp.entity.User;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //  {"error":1,"message":"出错了"}
        User u = new User();
        u.setBirthDate(new Date());
        u.setError(1);
        u.setMessage("出错");
        u.setStudent(new Student(22,"张三"));
        List<Student> sts = new ArrayList<Student>();
        sts.add(new Student(44,"李四"));
        sts.add(new Student(55,"王五"));
        u.setStudents(sts);

        String jsonString = JSON.toJSONString(u);
        System.out.println(jsonString);
        System.out.println("------------------------------");

        User user = JSON.parseObject("{\"birthDate\":1511917239063,\"error\":1,\"message\":\"出错\",\"student\":{\"id\":22,\"name\":\"张三\"},\"students\":[{\"id\":44,\"name\":\"李四\"},{\"id\":55,\"name\":\"王五\"}]}",User.class);
        System.out.println(user.getMessage() +"   "+user.getStudent().getName());
    }
}
