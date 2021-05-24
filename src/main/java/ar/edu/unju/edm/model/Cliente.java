package ar.edu.unju.edm.model;

import java.time.LocalDate;
//import java.util.Date;
import java.time.Period;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Entity //transforma en entidad 
@Table (name="CLIENTES")
@Component
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column
	private Integer IDcliente;

	@Column
	@Min(100000)
	@Max(9999999)
	private int nroDocumento;
	@Column
	@NotBlank(message="Debe incluir nombre completo")
	private String nomyApe;
	@Column
	private String tipoDocumento;
	@Column
	private int codigoAreaTelefono;
	@Column
	private int numTelefono;
	@Column
	private String email;
	@Column
	private String passwd;
	@Column
	private String otrosDatos;
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaNacimiento;
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaUltimaCompra;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	


	public Cliente(LocalDate fechaNacimiento, LocalDate fechaUltimaCompra, String nomyApe, String tipoDocumento,
			int nroDocumento, int codigoAreaTelefono, int numTelefono, String email, String passwd,
			String otrosDatos) {
		super();
		this.fechaNacimiento = fechaNacimiento;
		this.fechaUltimaCompra = fechaUltimaCompra;
		this.nomyApe = nomyApe;
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.codigoAreaTelefono = codigoAreaTelefono;
		this.numTelefono = numTelefono;
		this.email = email;
		this.passwd = passwd;
		this.otrosDatos = otrosDatos;
	}




	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public LocalDate getFechaUltimaCompra() {
		return fechaUltimaCompra;
	}


	public void setFechaUltimaCompra(LocalDate fechaUltimaCompra) {
		this.fechaUltimaCompra = fechaUltimaCompra;
	}


	public String getNomyApe() {
		return nomyApe;
	}


	public void setNomyApe(String nomyApe) {
		this.nomyApe = nomyApe;
	}


	public String getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public int getNroDocumento() {
		return nroDocumento;
	}


	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}


	public int getCodigoAreaTelefono() {
		return codigoAreaTelefono;
	}


	public void setCodigoAreaTelefono(int codigoAreaTelefono) {
		this.codigoAreaTelefono = codigoAreaTelefono;
	}


	public int getNumTelefono() {
		return numTelefono;
	}


	public void setNumTelefono(int numTelefono) {
		this.numTelefono = numTelefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getOtrosDatos() {
		return otrosDatos;
	}




	public void setOtrosDatos(String otrosDatos) {
		this.otrosDatos = otrosDatos;
	}





	



	public Integer getIDcliente() {
		return IDcliente;
	}




	public void setIDcliente(Integer iDcliente) {
		IDcliente = iDcliente;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoAreaTelefono;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + ((fechaUltimaCompra == null) ? 0 : fechaUltimaCompra.hashCode());
		result = prime * result + ((nomyApe == null) ? 0 : nomyApe.hashCode());
		result = prime * result + nroDocumento;
		result = prime * result + numTelefono;
		result = prime * result + ((otrosDatos == null) ? 0 : otrosDatos.hashCode());
		result = prime * result + ((passwd == null) ? 0 : passwd.hashCode());
		result = prime * result + ((tipoDocumento == null) ? 0 : tipoDocumento.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (codigoAreaTelefono != other.codigoAreaTelefono)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (fechaUltimaCompra == null) {
			if (other.fechaUltimaCompra != null)
				return false;
		} else if (!fechaUltimaCompra.equals(other.fechaUltimaCompra))
			return false;
		if (nomyApe == null) {
			if (other.nomyApe != null)
				return false;
		} else if (!nomyApe.equals(other.nomyApe))
			return false;
		if (nroDocumento != other.nroDocumento)
			return false;
		if (numTelefono != other.numTelefono)
			return false;
		if (otrosDatos == null) {
			if (other.otrosDatos != null)
				return false;
		} else if (!otrosDatos.equals(other.otrosDatos))
			return false;
		if (passwd == null) {
			if (other.passwd != null)
				return false;
		} else if (!passwd.equals(other.passwd))
			return false;
		if (tipoDocumento == null) {
			if (other.tipoDocumento != null)
				return false;
		} else if (!tipoDocumento.equals(other.tipoDocumento))
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Cliente [fechaNacimiento=" + fechaNacimiento + ", fechaUltimaCompra=" + fechaUltimaCompra + ", nomyApe="
				+ nomyApe + ", tipoDocumento=" + tipoDocumento + ", nroDocumento=" + nroDocumento
				+ ", codigoAreaTelefono=" + codigoAreaTelefono + ", numTelefono=" + numTelefono + ", email=" + email
				+ ", passwd=" + passwd + ", edad=" + ", otrosDatos=" + otrosDatos + "]";
	}
	
	
	public int getEdad(){
		LocalDate fechaAct = LocalDate.now();
		
		Period periodo =  Period.between(fechaAct, fechaNacimiento);
		
		return periodo.getYears()*-1;
	}
	
	public String getTiempoDesdeUltimaCompra() {
		LocalDate fechaAct2 = LocalDate.now();
		
		Period periodo =  Period.between(fechaUltimaCompra, fechaAct2);
		
		return " TUCompra  Año: " + periodo.getYears() + " Mes: " + periodo.getMonths() + " Dia: " + periodo.getDays() ;	
	}
	
	public String getTiempoHastaCumple() {
		int mes=0,dia=0;
		LocalDate fechaAct3 = LocalDate.now();
		
		Period periodo =  Period.between(fechaNacimiento,fechaAct3);
		
		mes=11-periodo.getMonths();
		dia=30-periodo.getDays();
		//en caso de que  la consulta este en el año anterior al nuevo cumpleaños
		
		if(fechaNacimiento.getMonthValue() == fechaAct3.getMonthValue() && fechaNacimiento.getDayOfMonth() == fechaAct3.getDayOfMonth()) {
			mes=11;
			dia=30;
		}//parche en caso de que hoy sea su cumpleaños
		else {
			if(fechaNacimiento.getMonthValue() > fechaAct3.getMonthValue()) {
				mes=fechaNacimiento.getMonthValue() - fechaAct3.getMonthValue();
				if(fechaNacimiento.getDayOfMonth() > fechaAct3.getDayOfMonth()) {
					dia=fechaNacimiento.getDayOfMonth() - fechaAct3.getDayOfMonth()-1;
				}
			}
			else {
				if(fechaNacimiento.getDayOfMonth() >= fechaAct3.getDayOfMonth()) {
					dia=fechaNacimiento.getDayOfMonth() - fechaAct3.getDayOfMonth()-1;
				}
			}
		}//en caso de que el nuevo cumpleaños este en el año de la consulta 
		
		Calendar hoy = Calendar.getInstance();
		int horas = hoy.get(Calendar.HOUR_OF_DAY);
		int minutos = hoy.get(Calendar.MINUTE);
		int segundos = hoy.get(Calendar.SECOND);
		//horas minutos y segundos
		
		horas = 24-horas-1;
		minutos = 60-minutos-1;
		segundos = 60-segundos;
		
		return " THCumpleaños Meses:" +mes+ " Dias:" +dia+" horas:"+horas+" min:"+segundos+" seg:"+segundos;	
	}
}