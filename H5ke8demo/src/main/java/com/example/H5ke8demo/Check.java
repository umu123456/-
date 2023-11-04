//package com.example.H5ke8demo;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebS
//public class Check extends javax.servlet.http.HttpServlet {
//    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//
//    }
//
//    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        String user=request.getParameter("user");
//        String[] users={"alice","bob","mark","jack"};
//        String msg="正确";
//                for(String cur:users){
//                    if(cur.equals(user))
//                    {
//                        msg="用户名已存在";
//                        break;
//                    }
//                }
//                response.setContentType("text/plain;charset=UTF-8");
//        PrintWriter out=response.getWriter();
//        out.println(msg);
//    }
//}
