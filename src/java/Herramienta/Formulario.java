/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramienta;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import Factory.Factoryselector;
import Factory.Herramienta;

import progra.selector;

/**
 *
 * @author David
 */
public class Formulario extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if (!ServletFileUpload.isMultipartContent(request)) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "BadRequest");
        }
        try {
            //OutputStream out = response.getOutputStream();
            
            
            /* Si no funciona el Factory selector poner esto
            selector sel = new selector();
            
            */
            
            
            
            Factoryselector fs = new Factoryselector();
            //Iniciación de las variabls a utilizar a null.
            String origen = null; String destino = null;String fichName = null; String ruta = null;
            FileItem fichero = null;
            File fich = null; File salida = null; 
            
            OutputStream outs = response.getOutputStream();
            
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            List<FileItem> items = upload.parseRequest(request);

         // Se recorren todos los items, que son de tipo FileItem, para leer los parametros del Form
        for (FileItem item : items) {
          //Lectura de los parametros
          String campoN = item.getFieldName();
           if (item.isFormField()) { //Si es un parametro normal
              if(campoN.equals("origen")){
                  System.out.println("Entra en origen");
                  origen = item.getString("UTF-8");
              }
              else if (campoN.equals("destino")){
                  System.out.println("Entra en destino");
                  destino = item.getString("UTF-8");
              }
           //Comprobamos el fichero que no sea vacio y que tenga nombre
           } else if (campoN.equals("fich") && item.getName() != null && item.getName().trim().length() > 0){
                  System.out.println("entra aqui");
                
                //Creamos el path para ver donde guardamos el archivo que nos deja en el formulario.
                fichName = item.getName();
                String root = getServletContext().getRealPath("/");
                File path = new File(root + "/temp");
                if (!path.exists()) {
                    boolean status = path.mkdirs();
                }

                fich = new File(path + "/" + fichName);
                System.out.println(fich.getAbsolutePath());
                item.write(fich);

            } 
        }
        if (fichero!= null){
            System.out.println("Fichero bien entregado");          
        }
        
        //Llamada a la funcion para devolver el fichero de salida
        
        
        /*Si no funciona el Factory selector quitar esto.
        salida = sel.elegir(origen,destino, fich);
        */
        
        Herramienta herraSal = fs.getHerramientaEntrada(origen, fich);
        File XML = herraSal.XML();
       
        Herramienta herraEnt = fs.getHerramientaSalida(destino, XML);
        salida = herraEnt.XSL();
        
        //Proceso para la salida del fichero
        response.setContentType("application/txt");
        response.setHeader("Cache-Control", "no-cache"); // HTTP 1.1
        response.setHeader("Cache-Control", "max-age=0");
        response.setHeader("Content-disposition","attachment; filename=fichero.txt");
        ServletOutputStream stream = response.getOutputStream();
        //FileInputStream input = new FileInputStream("C:\\Users\\David\\Desktop\\TFG\\Pruebas\\Pruebas\\build\\web\\temp\\test_arlequin.txt");
        
        FileInputStream input = new FileInputStream(salida);
        BufferedInputStream buf = new BufferedInputStream(input);
        int readBytes = 0;

        while ((readBytes = buf.read()) != -1) {
            stream.write(readBytes);
        }

        stream.flush();
        stream.close();
        //Finaliza el proceso de la salida del fichero
        
        
        System.out.println("Llega aqui");
        //response.sendRedirect("redirect.jsp");
        
        
        /*response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet formulario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>"+origen+" "+destino+" " + fichero + "</p>");
            out.println("<h1>Servlet formulario at " + request.getContextPath() + "</h1>");
            out.println("<a href="+ "redirect.jsp" +">pagina</a>");
            out.println("</body>");
            out.println("</html>");
            
            
        }*/
            
        } catch (Exception ex){
            throw new ServletException(ex);
        }
        
    }

}
