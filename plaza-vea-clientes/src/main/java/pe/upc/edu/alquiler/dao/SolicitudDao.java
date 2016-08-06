package pe.upc.edu.alquiler.dao;

import java.util.List;

import pe.upc.edu.alquiler.model.Solicitud;



public interface SolicitudDao {
	
	public List<Solicitud> listarSolicitudes() throws Exception;
	
	public Integer registrarSolicitud(Solicitud solicitud) throws Exception;
	
	public Integer actualizarSolicitud(long idSolicitud,String estado) throws Exception;
	
}
