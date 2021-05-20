package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.service.ProductoService;

@Controller 
public class ProductoController {
	
	
	@Autowired
	ProductoService iProductoService;
	
	
	@GetMapping("/producto/mostrar") 
	public String cargarProducto(Model model)
	{ 
		model.addAttribute("unProducto", iProductoService.obtenerProductoNuevo());
		return("producto");
	}

	@PostMapping("/producto/mostrar")
	public String guardarNuevoProducto(@ModelAttribute("unProducto") Producto nuevoProducto, Model model)
	{
		iProductoService.guardarProducto(nuevoProducto);
		System.out.println(iProductoService.obtenerTodosProductos().get(0).getMarca());
		model.addAttribute("productos", iProductoService.obtenerTodosProductos());
		return "producto";
	}
	
	@GetMapping("/ultimo")
	public String cargarUltimoProducto(Model model) {
		model.addAttribute("ultimoProducto", iProductoService.obtenerUltimoProducto());
		return("mostrar-ultimo");
	}
	
	@GetMapping("/volver")
	public String cargarNuevoProducto(Model model) {
		
		return("redirect:/producto/mostrar");
	}
	
	@GetMapping("/producto/tabla") 
	public String mostrarTabla(Model model)
	{ 
		System.out.println(iProductoService.obtenerTodosProductos().get(0).getMarca());
		model.addAttribute("productos", iProductoService.obtenerTodosProductos());
		model.addAttribute("unProducto", iProductoService.obtenerProductoNuevo());
		return("resultado");
	}
}