package ar.edu.unju.edm.service.imp;

import java.util.List;
import java.util.Optional;

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
	public Cliente encontrarUnCliente(Integer idcliente) throws Exception {
		// TODO Auto-generated method stub
		return clienteDAO.findById(idcliente).orElseThrow(()->new Exception("El cliente NO existe"));
	}

	private void cambiarCliente(Cliente desde, Cliente hacia) {
		//observen que vamos a pasar todos los atributos del cliente que viene, hacia el cliente que ya está en la BD
		hacia.setNroDocumento(desde.getNroDocumento());
		hacia.setNomyApe(desde.getNomyApe());
		hacia.setTipoDocumento(desde.getTipoDocumento());
		hacia.setFechaNacimiento(desde.getFechaNacimiento());
		hacia.setCodigoAreaTelefono(desde.getCodigoAreaTelefono());
		hacia.setNumTelefono(desde.getNumTelefono());
		hacia.setEmail(desde.getEmail());
	}
	@Override
	public void modificarCliente(Cliente clienteModificado) throws Exception {
		
		// TODO Auto-generated method stub
		Cliente clienteAModificar = clienteDAO.findById(clienteModificado.getIDcliente()).orElseThrow(()->new Exception("El Cliente no fue encontrado"));
		cambiarCliente(clienteModificado, clienteAModificar);
		clienteDAO.save(clienteAModificar);
		
	}
	
	

	@Override
	public void eliminarCliente(int dni)  throws Exception{
		// TODO Auto-generated method stub
		Cliente clienteEliminar = clienteDAO.findByNroDocumento(dni).orElseThrow(()->new Exception("El Cliente no fue encontrado"));
		clienteDAO.delete(clienteEliminar);
	}

}
