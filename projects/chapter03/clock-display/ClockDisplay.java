
/**
* La clase ClockDisplay implemento una pantalla de reloj digital para
* un reloj de 24 horas, estilo europeo. El reloj muestra las horas
* y los minutos. El rango del reloj es de 00:00 (medianoche) a 23:59
* (un minuto antes de la medianoche).
*
* La pantalla del reloj recibe "pulsos" (a través del método timeTick)
* cada minuto y reacciona incrementando la pantalla. Esto se hace de
* la forma habitual en los relojes: la hora se incrementa cuando
* los minutos pasan de nuevo a cero.
*
* @author Michael Kólling y David J. Barnes
* Aversion 2016.02.29
*/
public class ClockDisplay
{
     private NumberDisplay hours;
     private NumberDisplay minutes;
     private String displaystring;
     
//
// Constructor para los objetos ClockDisplay. Este constructor
// crea un nuevo reloj inicializado con 00:00.
//V
public ClockDisplay()
{
    hours = new NumberDisplay(24);
    minutes = new NumberDisplay(60);
    updateDisplay();
}
// * *
//* Constructor para los objetos ClockDisplay. Este constructor
//* crea un nuevo reloj inicializado con la hora especificada
//* mediante los parámetros.
//* /
public ClockDisplay(int hour, int minute)
{
    if (hour < 0 && minute < 0){
        
        throw new IllegalStateException("las horas en la casa de la abuela del Feli y los minutos no deben ser menores que 0");
        
    }
     hours = new NumberDisplay(24);
     minutes = new NumberDisplay(60);
     setTime(hour, minute);
     assert repOK();
}
//y * *
// Este método debe invocarse una vez cada minuto - hace
// que la pantalla del reloj avance un minuto.
//
public void timeTick()
{
    minutes.increment();
    if(minutes.getValue() == 0) { // a vuelto a 0
        
      hours.increment();
      
}
updateDisplay();
}

//Fija Ya hora de la pantalla con la hora y los minutos
//especificados.

public void setTime(int hour, int minute)
{
    if (hour < 0 && minute < 0){
        
        throw new IllegalStateException("las horas no pueden ser negativas la concha de tu madre hacemela facil infeliz gato.");
        
    }
    hours.setValue(hour);
    minutes.setValue(minute);
    updateDisplay();
    assert repOK();
}

//Devuelve la hora actual de esta pantalla en el formato HH:M

public String getTime()
{
    return displaystring;
}

//Actualiza la cadena interna que representa la pantalla.

private void updateDisplay()
{
    displaystring = hours.getDisplayValue() + ": " +
    minutes.getDisplayValue() + "PM trolo no entendes?";
}

//invariante en la siguiente linea
private boolean repOK(){
    
    if (hours.getValue() < 0 || minutes.getValue()< 0){
        
        return false;
        
    }
    else {
        
        return true;
    }
}
}
