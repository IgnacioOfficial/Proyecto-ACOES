package acoes;

import acoes.ENVIOS;
import acoes.HISTORIAL_APADRINAMIENTO;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-26T20:44:07")
@StaticMetamodel(SOCIO.class)
public class SOCIO_ extends USUARIO_ {

    public static volatile ListAttribute<SOCIO, ENVIOS> envios_enviados;
    public static volatile ListAttribute<SOCIO, HISTORIAL_APADRINAMIENTO> historiales_pert;
    public static volatile SingularAttribute<SOCIO, String> num_cuenta_bancaria;

}