package ar.edu.unju.edm.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Cliente;
import ar.edu.unju.edm.repository.IclienteDAO;
import ar.edu.unju.edm.service.IClienteService;

@Service
@Qualifier("otraIMP")
public class ClienteServiceMySQL implements IClienteService {

	@Autowired
	Cliente unCliente;
	
	@Autowired
	IclienteDAO clienteDAO;
	
	@Override
	public void guardarCliente(Cliente unCliente) {
		// TODO Auto-generated method stub
		clienteDAO.save(unCliente);
	}

	@Override
	public Cliente crearCliente() {
		// TODO Auto-generated method stub
		return unCliente;
	}

	@Override
	public List<Cliente> obtenerTodosClientes() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDAO.findAll();
	}

	@Override
	public Cliente encontrarUnCliente(int dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modificarCliente(Cliente clienteModificado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarCliente(int id) {
		// TODO Auto-generated method stub
		
	}

}
