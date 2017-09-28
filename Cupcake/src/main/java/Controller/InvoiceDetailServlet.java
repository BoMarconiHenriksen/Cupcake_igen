/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import data.InfoToAdminMapper;
import domain.InfoToAdmin;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bo Henriksen
 */
@WebServlet(name = "InvoiceDetailServlet", urlPatterns = {"/InvoiceDetailServlet"})
public class InvoiceDetailServlet extends HttpServlet {

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

            //Parser den som int da den kommer som String
            int invId = Integer.parseInt(request.getParameter("id"));
            
            InfoToAdmin invoiceInfo = new InfoToAdmin();
            InfoToAdminMapper infoMapper = new InfoToAdminMapper();
            
            try {
                invoiceInfo = infoMapper.getODetail(invId);
                request.setAttribute("invoiceId", invoiceInfo);
                request.setAttribute("pricePrCc", invoiceInfo);
                request.setAttribute("totalPrice", invoiceInfo);
                request.setAttribute("quantity", invoiceInfo);
                
                InfoToAdmin cupcakeNameInvoice = infoMapper.getCupcakeName(invId);
                request.setAttribute("cupcakeName", cupcakeNameInvoice);
                
                if(invoiceInfo != null && cupcakeNameInvoice != null) {
                    
                    request.getRequestDispatcher("/invoice_detail.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("/error_page.jsp").forward(request, response);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(InvoiceDetailServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

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
