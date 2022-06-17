/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_car;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class data extends HttpServlet {

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

            String Brand = request.getParameter("brand");
            String Model = request.getParameter("model");
            String Chassis = request.getParameter("chassis");
            String Number = request.getParameter("number");
            String Color = request.getParameter("color");
            String Type = request.getParameter("type");
            String Consumption = request.getParameter("consumption");
            
            
            if ("".equals(Brand)){
                out.println("<SCRIPT>");
                out.println("alert(' Please select the car brand ')");
                out.println("window.location.href =\"index.html\";");
                out.println("</SCRIPT>");
                
            } else if("".equals(Model)){
                out.println("<SCRIPT>");
                out.println("alert(' Please Enter Car model ')");
                out.println("window.location.href =\"index.html\";");
                out.println("</SCRIPT>");
                
            } else if("".equals(Chassis)){
                out.println("<SCRIPT>");
                out.println("alert(' Please Enter Car chassis number ')");
                out.println("window.location.href =\"index.html\";");
                out.println("</SCRIPT>");
                
            } else if("".equals(Number)){
                out.println("<SCRIPT>");
                out.println("alert(' Please Enter car registration number ')");
                out.println("window.location.href =\"index.html\";");
                out.println("</SCRIPT>");
                
             } else if("".equals(Color)){
                out.println("<SCRIPT>");
                out.println("alert(' Please Enter car color ')");
                out.println("window.location.href =\"index.html\";");
                out.println("</SCRIPT>");
            
            } else if("".equals(Type)){
                out.println("<SCRIPT>");
                out.println("alert(' Please select car type ')");
                out.println("window.location.href =\"index.html\";");
                out.println("</SCRIPT>");
                
            } else if("".equals(Consumption)){
                out.println("<SCRIPT>");
                out.println("alert(' Please Enter car fuel consumption type ')");
                out.println("window.location.href =\"index.html\";");
                out.println("</SCRIPT>");
                
            
                
            }else{ 
                out.println("<SCRIPT>");
                out.println("alert(' Sucessfully Validate Info for : " + Model + "')");
                out.println("</SCRIPT>");
            }
             
            

            /* TODO output your page here. You may use following sample code. */
            out.println("<script>");
            out.println("function confirmBack(){");
            out.println("var remove=confirm(\"Back to Main Menu?\");");
            out.println("if(remove===true){");
            out.println("alert(\"System set back to main menu\");");
            out.println("window.location.href =\"index.html\";");
            out.println("}else{");
            out.println("alert(\"Back function is Canceked\");");
            out.println("return false;");
            out.println("}");
            out.println("}");
            out.println("</script>");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletOne - Basic Data" + "Validation and Displaying A Pop-Up Message</title>");
            out.println("<style>");
            out.println("td,th{border: opx solid #ddd; text-align: left;}");
            out.println("border-collapse: collapse; width: 24.5%;" + "border-style:solid;border-width: 2px; border-color:" + "appworkspace;");
            out.println(" th, td{padding: 5px;}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<table align=\"center\">");
            out.println("<tr>");
            out.println("<td colspan=\"3\">");
            out.println("<div style=\"font-size: larger; color: pink\"><u>" + "Data You Have Submitted<u></div>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");

            out.println("<td>Car Brand</td>");
            out.println("<td>:</td>");
            out.println("<td>" + Brand + "</td>");
            out.println("</tr>");
            out.println("<tr>");

            out.println("<td>Car model</td>");
            out.println("<td>:</td>");
            out.println("<td>" + Model + "</td>");
            out.println("</tr>");
            out.println("<tr>");

            out.println("<td>Car chassis number</td>");
            out.println("<td>:</td>");
            out.println("<td>" + Chassis + "</td>");
            out.println("</tr>");
            out.println("<tr>");

            out.println("<td>car Registration Number :</td>");
            out.println("<td>:</td>");
            out.println("<td>" + Number + "</td>");
            out.println("</tr>");
            out.println("<tr>");

            out.println("<td>Car Color is </td>");
            out.println("<td>:</td>");
            out.println("<td>" + Color + "</td>");
            out.println("</tr>");
            out.println("<tr>");

            out.println("<td>Car Type is </td>");
            out.println("<td>:</td>");
            out.println("<td>" + Type + "</td>");
            out.println("</tr>");
            out.println("<tr>");

            out.println("<td>Car Fuel Consumption Car is </td>");
            out.println("<td>:</td>");
            out.println("<td>" + Consumption + "</td>");
            out.println("</tr>");
            out.println("<tr>");

          
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
