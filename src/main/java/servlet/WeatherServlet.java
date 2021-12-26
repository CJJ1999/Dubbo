package servlet;

import beans.Weather;
import service.ServiceWeather;
import service.impl.ServiceWeatherImpl;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/qwservlet")
public class WeatherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cityCode = req.getParameter("cityCode");
        ServiceWeather sw=new ServiceWeatherImpl();
        Weather weather = sw.queryCity(cityCode);
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.print(weather.toString());
        writer.flush();
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
