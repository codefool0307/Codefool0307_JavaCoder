package Download;

import org.apache.commons.io.IOUtils;
import sun.misc.BASE64Encoder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;


public class DowloadoneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         //1.获取下载的文件名
        String newname="a.jpg";
        //2.读取要下载的内容及类型
        ServletContext servletContext = getServletContext();
        String mimeType = servletContext.getMimeType("/file/" + newname);
        //4.通过响应头告诉客户端返回的类型
        response.setContentType(mimeType);
        //5.用于下载
        String str1 = "attachment; fileName=" + "=?utf-8?B?"
                + new BASE64Encoder().encode("中文.jpg".getBytes("utf-8")) + "?=";
        response.setHeader("Content-Disposition", str1);
        String str="attachment; fileName=" + URLEncoder.encode("中文.jpg", "UTF-8");
        response.setHeader("Content-Disposition",str);
        //3.把下载内容回传给客户端
           //获取输出流、输入流
        InputStream resourceAsStream = servletContext.getResourceAsStream("/file/" + newname);
        ServletOutputStream outputStream = response.getOutputStream();
        IOUtils.copy(resourceAsStream,outputStream);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
