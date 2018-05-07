package com.wjj.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 作者：wangjj
 * @version 版本：
 * @createTime 创建时间：2018-05-07 14:11
 * @discription 类说明：login_servlet
 */
public class LoginServlet extends HttpServlet{

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("content-type", "text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if ("wjj".equals(username) && "123456".equals(password)) {
            writer.print("登录成功！");
        } else {
            writer.print("登录失败！");
        }
    }

}
