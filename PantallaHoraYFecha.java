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
        pantallaDia = new PantallaDosDigitos(1, 31);
        pantallaMes = new PantallaDosDigitos(1, 13);
        pantallaAno = new PantallaDosDigitos(1, 100);
    }
    
    /**
     * Devuelve la hora actual de esta pantalla en el formato 
     * HH:MM dd-mm-aa
     */
    public String getFechaYHora() {
        return pantallaHoras.getTextoDeLaPantalla() + ":" + pantallaMinutos.getTextoDeLaPantalla() + " "
        + pantallaDia.getTextoDeLaPantalla() + "-" + pantallaMes.getTextoDeLaPantalla() + "-" +
        pantallaAno.getTextoDeLaPantalla();
    }       
    
    /**
     * Avanza el tiempo un minuto
     */
    public void AvanzarMinuto(){
        pantallaMinutos.incrementaValorAlmacenado();
        if (pantallaMinutos.getValorAlmacenado() == 0) {
            pantallaHoras.incrementaValorAlmacenado();
            if(pantallaHoras.getValorAlmacenado() == 0) {
                pantallaDia.incrementaValorAlmacenado();
                if(pantallaDia.getValorAlmacenado() == 1){
                    pantallaMes.incrementaValorAlmacenado();
                    if(pantallaMes.getValorAlmacenado() == 1){
                        pantallaAno.incrementaValorAlmacenado();
                    }
                }
            }           
        }
        
    }
    
    /**
     * Fija la fecha y la hora con los números que se requieran 
     */
    public void setTiempo(int horas, int minutos, int dia, int mes, int ano) {
        pantallaHoras.setValorAlmacenado(horas);
        pantallaMinutos.setValorAlmacenado(minutos);
        pantallaDia.setValorAlmacenado(dia);
        pantallaMes.setValorAlmacenado(mes);
        pantallaAno.setValorAlmacenado(ano);
    }
}