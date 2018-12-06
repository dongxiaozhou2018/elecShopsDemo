package com.neuedu.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

@WebServlet(name = "ImgUploadServlet",urlPatterns = "/ImgUploadServlet")
public class ImgUploadServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
        servletFileUpload.setHeaderEncoding("utf-8");
        try {
            List<FileItem> fileItems = servletFileUpload.parseRequest(req);

            for (FileItem f:fileItems) {
                if (!f.isFormField())
                {
                    System.out.println(f.getName() );
                    String s = f.getName().toLowerCase();
                    //判断文件格式
                    if (s.endsWith(".jpg")||s.endsWith(".png")||s.endsWith(".jpeg"))
                    {
                        //拿到文件的输入流
                        InputStream inputStream = f.getInputStream();
                        OutputStream outputStream = new FileOutputStream("D:\\Java\\javaeeworkspace\\servlet\\elecShopsDemo\\web\\WEB-INF\\photo\\"+f.getName());
                        //5kb*1024 =5122
                        byte[] cache = new byte[1024];
                        int length = 0;
                        while((length=inputStream.read(cache))!=-1)
                        {
                            outputStream.write(cache,0,length);
                        }
//                        req.getRequestDispatcher("/pageServlet").forward(req,resp);
//                        req.getRequestDispatcher("addsuccess.jsp").forward(req,resp);
                        String filename = f.getName();
                        req.setAttribute("shop_img",filename);
                        req.getRequestDispatcher("addProduct.jsp").forward(req,resp);
                        outputStream.flush();
                        outputStream.close();
                        inputStream.close();
                    }
                    else
                        {
                        req.setAttribute("message","不支持此格式，请重新上传");
                        req.getRequestDispatcher("addProduct.jsp").forward(req,resp);
                        }
                }
                else
                    {
                        if ("username".equals(f.getFieldName()))
                        {
                            System.out.println("用户名："+f.getString());
                        }
                        if ("password".equals(f.getFieldName()))
                        {
                            System.out.println("密码"+f.getString());
                        }

                        System.out.println(f.getString());
                    }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }
}
