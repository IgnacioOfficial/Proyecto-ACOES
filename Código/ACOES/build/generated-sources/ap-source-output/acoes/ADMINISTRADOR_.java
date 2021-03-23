package acoes;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-26T20:44:07")
@StaticMetamodel(ADMINISTRADOR.class)
public class ADMINISTRADOR_ extends USUARIO_ {

    public static volatile SingularAttribute<ADMINISTRADOR, String> num_SS;
    public static volatile SingularAttribute<ADMINISTRADOR, Double> importeBruto;
    public static volatile SingularAttribute<ADMINISTRADOR, String> seccion_operativa;
    public static volatile SingularAttribute<ADMINISTRADOR, Double> sueldo;
    public static volatile SingularAttribute<ADMINISTRADOR, Date> fecha_Entrada;

}