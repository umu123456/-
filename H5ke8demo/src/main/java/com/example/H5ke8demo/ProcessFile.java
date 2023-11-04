package com.example.H5ke8demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.util.Collection;

@WebServlet(name = "ProcessFile", value = "/process-file")
@MultipartConfig
public class ProcessFile extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Collection<Part> parts=request.getParts();
        for(Part part:parts){
            System.out.println("\n");
            String header=part.getHeader("content-disposition");
            System.out.println(header);
            System.out.println(part.getContentType());
            System.out.println(part.getSize());
            System.out.println(part.getName());

            String fileName=header.substring(header.lastIndexOf("=")+2,header.lastIndexOf("\""));
//            System.out.println(fileName);
            ServletContext context =request.getServletContext();
            String savePath=context.getRealPath("/file");
            savePath += File.separator+fileName;
//            System.out.println(savePath);
            part.write(savePath);//写入文件
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
