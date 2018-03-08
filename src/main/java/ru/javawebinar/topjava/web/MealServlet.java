package ru.javawebinar.topjava.web;

import org.slf4j.Logger;
import ru.javawebinar.topjava.model.MealWithExceed;
import ru.javawebinar.topjava.util.MealsUtil;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class MealServlet extends HttpServlet {

    private static final Logger log = getLogger(MealServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        log.debug("do Get MealServlet");

        PrintWriter pw = response.getWriter();



        List<MealWithExceed> mealsWithExceeded = MealsUtil.getFilteredWithExceeded(MealsUtil.MEAL_LIST, LocalTime.MIN,
                LocalTime.MAX, 2000);

        request.setAttribute("mealList", mealsWithExceeded);
        request.getRequestDispatcher("/meals.jsp").forward(request, response);
    }
}
