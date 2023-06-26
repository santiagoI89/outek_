<%-- 
    Document   : GenerarReporte
    Created on : 15/06/2023, 08:34:36 AM
    Author     : APRENDIZ
--%>

<%@page import="util.ConexionBd"%>
<%@page import="net.sf.jasperreports.engine.JasperPrint"%>
<%@page import="net.sf.jasperreports.engine.JasperFillManager"%>
<%@page import="net.sf.jasperreports.engine.JasperFillManager"%>
<%@page import="net.sf.jasperreports.engine.JasperRunManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outek</title>
        <script>
    document.addEventListener('keydown', function(event) {
      if (event.key === 'ArrowLeft' || event.key === 'ArrowRight') {
        event.preventDefault(); // Evitar la acción predeterminada del evento
      }
    });
  </script>
    </head>
    <body>
         <%
            String reportName = request.getParameter("reportName");

            if (reportName != null && !reportName.isEmpty()) {

                String jaspFilePath = application.getRealPath("REPORTES/" + reportName + ".jasper");
                File reporte = new File(jaspFilePath);
                Map<String, Object> parametros = new HashMap<String, Object>();
                ConexionBd conexion = new ConexionBd();
                Connection objetoConexion = conexion.obtenerConexion();
                byte[] bytes = JasperRunManager.runReportToPdf(reporte.getPath(), parametros, objetoConexion);
                response.setContentType("application/pdf");
                response.setContentLength(bytes.length);
                response.setHeader("Content-Disposition", "attachment; filename=\"Listado.pdf\";");
                ServletOutputStream salida = response.getOutputStream();
                salida.write(bytes, 0, bytes.length);
                salida.flush();
                salida.close();
            } else {
            }

        %> 
</html>
