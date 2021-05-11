package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.service.ProductoService;

@Controller
public class VentasController {
	
	@Autowired
	ProductoService iProductoService;
	
	@GetMapping("/producto/ventas") 
	public String cargarProducto(Model model)
	{ 
		model.addAttribute("productos", iProductoService.obtenerTodosProductos());
		return("ventas");
	}
}
