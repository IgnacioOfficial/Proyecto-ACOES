/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Autenticación;

import acoes.ADMINISTRADOR;
import acoes.SOCIO;
import acoes.USUARIO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;

/**
 *
 * @author francis
 */
@Named(value = "controlAutorizacion")
@SessionScoped
public class ControlAutorizacion implements Serializable {

    private USUARIO usuario;
    
    private SOCIO socio;
    
    private ADMINISTRADOR admin;

    public void setUsuario(USUARIO usuario) {
        this.usuario = usuario;
    }

    public USUARIO getUsuario() {
        return usuario;
    }

    public ADMINISTRADOR getAdmin() {
        return admin;
    }

    public void setAdmin(ADMINISTRADOR admin) {
        this.admin = admin;
    }

    public SOCIO getSocio() {
        return socio;
    }

    public void setSocio(SOCIO socio) {
        this.socio = socio;
    }
    
    
    public String getClase(){
        
        String clase = "";
        
        if(admin != null){
        
            clase = "ADMINISTRADOR";
            
        } else if (socio != null){
            
            clase = "SOCIO";
            
        } else if (usuario != null){
            
            clase = "USUARIO";  
        
        } else {
            
            clase = "USUARIO";
        }
   
        return clase;
    }
    
     public String ccj(){
        return "CCJ.xhtml";
    }
    
    public String populorum(){
        return "populorum.xhtml";
    }
    
    public String ninios(){
        return "ninios.xhtml";
    }
    
    public String conocenos (){
        return "conocenos.xhtml";
    }
    
    public String login(){
        return "login.xhtml";
    }
    
    public String envios(){
        return "envios.xhtml";
    }
    
    public String registro(){
        return "registro.xhtml";
    }
    
    public String apadrinar(){
        return "apadrinar.xhtml";
    }

    public String home() {
        
        if(admin != null){
            
            return "admin.xhtml";
            
        } else if(socio != null){
            
            return "socio.xhtml";
            
        } else if(usuario != null){
            
            return "normal.xhtml";
            
        }else{
            return "Home.xhtml";
        }
    }
    
    public String becas(){
        return "becas.xhtml";
    }
    
    public String historiales(){
        return "historiales.xhtml";
    }
    
    public String logout()
    {
        // Destruye la sesión (y con ello, el ámbito de este bean)
        FacesContext ctx = FacesContext.getCurrentInstance();
        ctx.getExternalContext().invalidateSession();
        usuario = null;
        return "login.xhtml";
    }

    /**
     * Creates a new instance of ControlAutorizacion
     */
    public ControlAutorizacion() {
        
        
    }
}
