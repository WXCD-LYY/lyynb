package cn.itcast.web.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet("/ServletContextDemo5")
public class ServletContextDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            ServletContext功能：
		       1. 获取MIME类型：

		       2. 域对象：共享数据

	           3. 获取文件的真实(服务器)路径

         */



        // 2. 通过HttpServlet获取
        ServletContext context = this.getServletContext();

        // 获取文件的真实服务器路径
        String realPath = context.getRealPath("/b.txt"); // web目录下资源访问
        System.out.println(realPath);
//        File file = new File(realPath);

        String realPath1 = context.getRealPath("/WEB-INF/c.txt"); // WEB-INF目录下的资源访问
        System.out.println(realPath1);

        String realPath2 = context.getRealPath("/WEB-INF/class/a.txt"); // src目录下的资源路径访问
        System.out.println(realPath2);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
