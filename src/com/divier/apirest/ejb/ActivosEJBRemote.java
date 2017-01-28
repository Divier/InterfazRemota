package com.divier.apirest.ejb;

import com.divier.apirest.dto.ActivoDTO;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Divier
 */
@Remote
public abstract interface ActivosEJBRemote {

    /**
     * Permite consultar todos los activos fijos registrados
     * 
     * @return
     * @throws Exception
     */
    public abstract List<ActivoDTO> getAllActivos() throws Exception;

    /**
     * Permite consultar un activo fijo de acuerdo con los parametros de consulta
     * 
     * @param activoDTO
     * @return
     * @throws Exception
     */
    public abstract ActivoDTO getActivo(ActivoDTO activoDTO) throws Exception;

    /**
     * Permite registrar un activo fijo
     * 
     * @param activoDTO
     * @return
     * @throws Exception
     */
    public abstract Boolean registrarActivo(ActivoDTO activoDTO) throws Exception;

    /**
     * Permite actualizar un activo fijo
     * 
     * @param activoDTO
     * @return
     * @throws Exception
     */
    public abstract Boolean actualizarActivo(ActivoDTO activoDTO) throws Exception;
}