package com.example.H5ke8demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
//ProcessJson/process-json
@WebServlet(name = "ProcessJson",value = "/ProcessJson")
public class ProcessJson extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getHeader("content-type"));

        BufferedReader reader=request.getReader();
        String line=null;
        while ((line=reader.readLine())!=null){
            System.out.println(line);
        }
        reader.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);//zhuyile
    }
}
