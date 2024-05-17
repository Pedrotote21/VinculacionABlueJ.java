public class ClockDisplayFormat12Hs
{
     private NumberDisplay hours;
     private NumberDisplay minutes;
     private String displayString;
     
//
// Constructor para los objetos ClockDisplay. Este constructor
// crea un nuevo reloj inicializado con 00:00.
//V
public ClockDisplayFormat12Hs()
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
public ClockDisplayFormat12Hs(int hour, int minute)
{
     hours = new NumberDisplay(24);
     minutes = new NumberDisplay(60);
     setTime(hour, minute);
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
    hours.setValue(hour);
    minutes.setValue(minute);
    updateDisplay();
}

//Devuelve la hora actual de esta pantalla en el formato HH:M

public String getTime()
{
    return displayString;
}

//Actualiza la cadena interna que representa la pantalla.

private void updateDisplay()
{
    int hour12;
    
    if (hours.getValue() == 12){
        
        hour12 = hours.getValue();
        displayString = hour12 + ":" + minutes.getDisplayValue() + "PM";
        
    } else {
        
        if (hours.getValue() == 0){
            
            hour12 = 12;
            displayString = hour12 + ":" + minutes.getDisplayValue() + "AM";
            
        } else {
            //En el proximo If se evalua si el valor de las horas es mayo o igual a 13
            //si llega a ser verdadero a hora12 se le asigna el valor de las horas - 13
            //ya que entrariamos a las PM
            if (hours.getValue() >= 13){
                
                hour12 = hours.getValue() - 12;
                displayString = hour12 + ":" + minutes.getDisplayValue() + "PM";
                
            }
            else {
                
                hour12 = hours.getValue();
                displayString = hour12 + ":" + minutes.getDisplayValue() + "AM";
                
            }
        }
        
    }
}
}
