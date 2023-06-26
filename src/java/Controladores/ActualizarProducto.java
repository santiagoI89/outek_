package Controladores;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import ModeloDAO.ProductoDAO;
import ModeloVO.ProductoVO;
import ModeloVO.ProductoVO;


@MultipartConfig
@WebServlet("/ActualizarProducto")
public class ActualizarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductoDAO custCtr = new ProductoDAO();
	private String pathFiles = "C:\\Users\\juand\\OneDrive\\Documentos\\Outek\\web\\files";
	private File uploads = new File(pathFiles);
	private String[] extens = {".ico", ".png", ".jpg", ".jpeg"};
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
            
             String ProNombre = request.getParameter("proNombre");
             String ProImagen = request.getParameter("proImagen");
             String proId = request.getParameter("proId");
             String proModelo = request.getParameter("proModelo");
             String proDescripcion = request.getParameter("proDescripcion");
             String proCategoria = request.getParameter("proCategoria");
             String proEstado = request.getParameter("proEstado");
             String proCantidad = request.getParameter("proCantidad");
             String proPrecioVenta = request.getParameter("proPrecioVenta");
                ProductoVO proVO = new ProductoVO(proId, proModelo, proDescripcion, ProNombre, proCategoria, proEstado, ProImagen, proCantidad, proPrecioVenta);
                ProductoDAO proDAO = new ProductoDAO(proVO);
		String action = request.getParameter("opcion");
		
		switch (action) 
                {
		case "2":
			saveCustomer(request, response);
			break;
                        default:
			break;
            }
		
	}
	
	private void saveCustomer(HttpServletRequest req, HttpServletResponse res) throws IOException {
                    try {
                        // Obtener información del formulario
                        String ProNombre = req.getParameter("proNombre");
                        Part part = req.getPart("proImagen");
                        String proId = req.getParameter("proId");
                        String proModelo = req.getParameter("proModelo");
                        String proDescripcion = req.getParameter("proDescripcion");
                        String proCategoria = req.getParameter("proCategoria");
                        String proEstado = req.getParameter("proEstado");
                        String proCantidad = req.getParameter("proCantidad");
                        String proPrecioVenta = req.getParameter("proPrecioVenta");

                        if (part == null) {
                            System.out.println("No ha seleccionado un archivo");
                            return;
                        }

                        if (isExtension(part.getSubmittedFileName(), extens)) {
                            // Guardar el archivo en la carpeta
                            String fileName = saveFile(part, uploads);

                            // Guardar solo el nombre del archivo en la base de datos
                            ProductoVO cust = new ProductoVO(proId, proModelo, proDescripcion, ProNombre, proCategoria, proEstado, fileName, proCantidad, proPrecioVenta);
                            custCtr.addCustomer2(cust);
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    res.sendRedirect("ConsultarProducto.jsp");
                }

                private String saveFile(Part part, File pathUploads) {
                    String fileName = "";

                    try {
                        Path path = Paths.get(part.getSubmittedFileName());
                        fileName = path.getFileName().toString();
                        InputStream input = part.getInputStream();

                        if (input != null) {
                            File file = new File(pathUploads, fileName);
                            String pathAbsolute = file.getAbsolutePath();
                            Files.copy(input, file.toPath());
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    return fileName;
                }
	
	
	private boolean isExtension(String fileName, String[] extensions) {
		for(String et : extensions) {
			if(fileName.toLowerCase().endsWith(et)) {
				return true;
			}
		}
		
		return false;
	}
        
}
