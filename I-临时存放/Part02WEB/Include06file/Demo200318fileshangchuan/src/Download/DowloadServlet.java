package Download;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;


public class DowloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         //1.获取下载的文件名
        String newname="file\\a.jpg";
        //2.读取要下载的内容及类型
        ServletContext servletContext = getServletContext();
        String mimeType = servletContext.getMimeType("/file/" + newname);
        //4.通过响应头告诉客户端返回的类型
        response.setContentType(mimeType);
        //5.用于下载
        response.setHeader("Content-Disposition","attachment; fileName=22.jpg");
        //3.把下载内容回传给客户端
           //获取输出流、输入流
        InputStream resourceAsStream = servletContext.getResourceAsStream("/file/" + newname);
        ServletOutputStream outputStream = response.getOutputStream();
        IOUtils.copy(resourceAsStream,outputStream);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
