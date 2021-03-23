/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Autenticación;

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

    public void setUsuario(USUARIO usuario) {
        this.usuario = usuario;
    }

    public USUARIO getUsuario() {
        return usuario;
    }

    public String home() {
        
        if(usuario instanceof acoes.ADMINISTRADOR){
            
            return "admin.xhtml";
            
        } else if(usuario instanceof acoes.USUARIO){
            
            return "normal.xhtml";
            
        } else {
            
            return "login.xhtml";
        }
        
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
