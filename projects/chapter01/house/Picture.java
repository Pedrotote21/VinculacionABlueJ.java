package projects.chapter01.house;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture//creacion de la clase/metodo/campos publico
{
    private Square wall;//variables que conforman a la clase/campos privados
    private Square window;
    private Triangle roof;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    //contructores de la clase Picture
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        drawn = false;//tipo primitivos
    }

    /**
     * Draw this picture.
     */
    //comando utilizado para modificar el formato interno del programa
    public void draw()
    {
        if(!drawn) {// condicional
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()//comando que escoje solo dos colores blanco o negro
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()//otro setter para escojer el color de nuestra picture
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
