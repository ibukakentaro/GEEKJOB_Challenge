/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ibuka kentaro
 */
@WebServlet(name = "challenge6", urlPatterns = {"/challenge6"})
public class challenge6 extends HttpServlet {

    String[] main(String str) {

        String[][] prof;
        prof = new String[3][4];

        //  ===================================================================
        //      プロフィールの準備
        //  ===================================================================
        prof[0][0] = "1234";
        prof[0][1] = "井深";
        prof[0][2] = "3月3日";
        prof[0][3] = "板橋区";

        prof[1][0] = "5678";
        prof[1][1] = "田中";
        prof[1][2] = "2月2日";
        prof[1][3] = "練馬区";

        prof[2][0] = "9876";
        prof[2][1] = "佐藤";
        prof[2][2] = "1月1日";
        prof[2][3] = "中野区";

        //  ===================================================================
        //      引数で受け取ったIDと一致しているかを if 文で判断して、
        //      一致する人物のプロフィール情報を戻り値として返す。
        //  ===================================================================
        if (str.equals(prof[0][0])) {
            return prof[0];
        } else if (str.equals(prof[1][0])) {
            return prof[1];
        } else if (str.equals(prof[2][0])) {

            return prof[2];
        }
        return null;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge6</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet challenge6 at " + request.getContextPath() + "</h1>");

            String[] main = main("1234");
            
            for (int i = 0; i < main.length; i++) {

                if (i == 0) {
                    continue;
                }

                out.print(main[i]);

            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
