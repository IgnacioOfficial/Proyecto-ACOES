package acoes;

import acoes.JOVEN_NIÑO;
import acoes.SOCIO;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-26T20:44:07")
@StaticMetamodel(ENVIOS.class)
public class ENVIOS_ { 

    public static volatile SingularAttribute<ENVIOS, JOVEN_NIÑO> niño_envio;
    public static volatile SingularAttribute<ENVIOS, SOCIO> socio_envio;
    public static volatile SingularAttribute<ENVIOS, String> Descripcion;
    public static volatile SingularAttribute<ENVIOS, Long> id;
    public static volatile SingularAttribute<ENVIOS, String> Estado;

}