package acoes;

import acoes.JOVEN_NIÑO;
import acoes.SOCIO;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-26T20:44:07")
@StaticMetamodel(HISTORIAL_APADRINAMIENTO.class)
public class HISTORIAL_APADRINAMIENTO_ { 

    public static volatile SingularAttribute<HISTORIAL_APADRINAMIENTO, Date> fecha_inicio;
    public static volatile SingularAttribute<HISTORIAL_APADRINAMIENTO, Date> fecha_fin;
    public static volatile SingularAttribute<HISTORIAL_APADRINAMIENTO, SOCIO> socio_apadrina;
    public static volatile SingularAttribute<HISTORIAL_APADRINAMIENTO, Long> id;
    public static volatile SingularAttribute<HISTORIAL_APADRINAMIENTO, JOVEN_NIÑO> niño_apadrinado;
    public static volatile SingularAttribute<HISTORIAL_APADRINAMIENTO, Boolean> apadrinado;

}