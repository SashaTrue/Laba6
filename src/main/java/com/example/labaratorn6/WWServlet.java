//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.labaratorn6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/ww-servlet"})
public class WWServlet extends HttpServlet {
    Random rnd = new Random();
    int answer;
    private String message;

    public WWServlet() {
        this.answer = this.rnd.nextInt(1000);
        this.message = primerchik(this.answer, 1);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + this.message + "</h1>");
        out.println("<a href='WWR.jsp'>" + this.answer + "</a>");
        out.println("<a href='WWW.jsp'>" + (this.answer - this.rnd.nextInt(10)) + "</a>");
        out.println("</body></html>");
    }

    public static String primerchik(int num, int dif) {
        Random rnd = new Random(num);
        int res = rnd.nextInt(num);
        String temp = Integer.toString(res);
        int znak = 0;

        for(int i = 0; i < dif; i++) {
            int k = rnd.nextInt(num);
            znak = rnd.nextInt(2);
            switch (znak) {
                case 0:
                    temp += "+";
                    temp += Integer.toString(k);
                    res += k;
                    break;
                case 1:
                    temp = temp + "-";
                    temp = temp + Integer.toString(k);
                    res -= k;
            }
        }

        if (res > num) {
            temp = temp + "-";
            temp = temp + Integer.toString(res - num);
            res -= res - num;
        } else if (res < num) {
            temp = temp + "+";
            temp = temp + Integer.toString(num - res);
            res += num - res;
        }

        return temp;
    }
}
