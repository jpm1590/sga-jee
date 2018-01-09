/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm1590.sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import com.jpm1590.sga.domain.Persona;

/**
 *
 * @author jpm1590
 */
@Remote
public interface PersonaServiceRemote {
    
    public List<Persona> listarPersonas();
    
    public Persona encontrarPersonaPorID();
    
    public Persona encontrarPersonaPorEmail();
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
}
