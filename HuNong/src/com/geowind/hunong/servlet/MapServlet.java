package com.geowind.hunong.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Kui on 2016/7/22.
 */
@WebServlet(name = "MapServlet")
public class MapServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String methodName = request.getHeader("method");
        String resultJson = "";
        System.out.println(methodName);
        if (methodName == null) {
            resultJson = null;
        } else {
            // 根据请求的方法，返回对应信息 resultJson
            resultJson = dealWithRequest(methodName, request);
        }
        //response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        System.out.println(resultJson);
        response.getWriter().write(resultJson);
    }

    private String dealWithRequest(String methodName, HttpServletRequest request) {
        String resultJson = "";

        switch (methodName) {
            case "map":
          
        }
        return resultJson;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
