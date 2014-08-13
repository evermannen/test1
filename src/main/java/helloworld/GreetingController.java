package helloworld;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import org.joda.time.LocalTime;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingController implements Controller
{

   @Override
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
   {
      String userName = request.getParameter("user");
      String result = "";
      
      if (userName != null)
      {
      
        LocalTime currentTime = new LocalTime();
      
        result = "Hello, " + userName + "! Time is " + currentTime;
      }

      ModelAndView view = new ModelAndView("hello_view");
      view.addObject("greeting", result);
      return view;
   }
}
