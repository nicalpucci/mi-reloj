/**
 * @author Nicolas Alfonso
 * @version 1.0
 */
public class PantallaHoraYFecha{
    //pantalla horas
    private PantallaDosDigitos pantallaHoras;
    //pantalla minutos
    private PantallaDosDigitos pantallaMinutos;
    //pantalla dia
    private PantallaDosDigitos pantallaDia;
    //pantalla mes
    private PantallaDosDigitos pantallaMes;
    //pantalla año
    private PantallaDosDigitos pantallaAno;
    
    /**
     * Constructor sin parámetros que predetermina la fecha a 
     * 1 de enero del año 1 a las 00:00
     */
    public PantallaHoraYFecha(){
        pantallaHoras = new PantallaDosDigitos(0, 24);
        pantallaMinutos = new PantallaDosDigitos(0, 60);
        pantallaDia = new PantallaDosDigitos(1, 30);
        pantallaMes = new PantallaDosDigitos(1, 12);
        pantallaAno = new PantallaDosDigitos(1, 99);
    }
}