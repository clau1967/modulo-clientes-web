package com.santiagobarrera.clinicaveterinaria;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClienteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String direccion = req.getParameter("direccion");
        String telefono = req.getParameter("telefono");

        // Aquí podrías procesar los datos, por ahora solo los imprimiremos.
        System.out.println("Datos del cliente recibidos:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        
        // Redirigimos al usuario a una página de confirmación.
        resp.getWriter().println("<h1>¡Datos del cliente recibidos correctamente!</h1>");
        resp.getWriter().println("<p>Nombre: " + nombre + "</p>");
        resp.getWriter().println("<p>Dirección: " + direccion + "</p>");
        resp.getWriter().println("<p>Teléfono: " + telefono + "</p>");
    }
}