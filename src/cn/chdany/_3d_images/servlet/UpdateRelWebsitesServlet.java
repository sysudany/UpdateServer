package cn.chdany._3d_images.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import cn.chdany._3d_images.bean.RelWebsite;

@WebServlet("/UpdateRelWebsitesServlet")
public class UpdateRelWebsitesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateRelWebsitesServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Content-Type", "text/html;charset=UTF-8");
		ArrayList<RelWebsite> websites = new ArrayList<RelWebsite>();
		Random random = new Random();
		for(int i = 0; i < 100; i++){
			RelWebsite website = new RelWebsite();
			website.setId(random.nextLong() + "地址的写法");
			websites.add(website);
		}
		response.getWriter().write("h地址的写法.avia\n");
		response.getWriter().write(JSON.toJSONString(websites));
		response.getWriter().write(request.getParameter("version"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
