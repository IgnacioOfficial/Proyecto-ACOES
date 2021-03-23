/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Autenticación;

import acoes.ADMINISTRADOR;
import acoes.USUARIO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author francis
 */
@Named(value = "login")
@RequestScoped
public class Login {

    private String usuario;
    private String contrasenia;
    private List<USUARIO> usuarios;
    
    @Inject
    private ControlAutorizacion ctrl;

    /**
     * Creates a new instance of Login
     */
    public Login() {
        usuarios = new ArrayList<USUARIO>();
        usuarios.add(new USUARIO("Igna", "Pa", "Gu", "igna@uma.es", "834534", "admin", "aijsdioa9", "Igna9", new Date(1999, 10, 19)));
        usuarios.add(new ADMINISTRADOR("Andrés", "Suárez", "Mediavilla", "and@uma.es", "9823423", "admin", "89374329", "Andres9", new Date(1999, 10, 19), "8397428932", new Date(2019, 10, 19), 1200, 1000, "Despacho"));
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String autenticar() {  // Pasar parámetros del login
        
        
        for(int i = 0; i < usuarios.size(); i++){
            
            if(usuarios.get(i).getUser_name().equals(usuario)){
                if( usuarios.get(i).getPassword().equals(contrasenia)){
                    
                    USUARIO usuario = usuarios.get(i);
                    
                    if(usuario instanceof acoes.ADMINISTRADOR){
                    
                        
                        
                        
                    } else {
                    
                        ctrl.setUsuario(usuario);
                        return ctrl.home();
                    
                    }
                    
                }
            }
        }
        
        // Implementar este método
        FacesContext ctx = FacesContext.getCurrentInstance();
        ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "El usuario especificado no existe o la constraseña es incorrecta", "El usuario especificado no existe o la constraseña es incorrecta"));
        
        
        
        return null;
    }
}
