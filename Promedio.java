package Semana2;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.lang.Math;
// <applet width="200" height="200" code="AppletCuadrado"></applet>
/*****************************
 * @author Margie C Sarmiento*
******************************/
//Declarración de la clase
public class Promedio extends Applet implements ActionListener {
Label l1, l2, l3, l4, l5;//Se declaran las etiquetas
TextField n1, n2, n3, n4, res;//Se declaran las variables para texto
Button b;//botón
public Promedio() {//método contructor
l1 = new Label("Número 1"); // se crea una etiqueta
n1 = new TextField(); // se crea un texto
l2 = new Label("Número 2"); // se crea una etiqueta
n2 = new TextField(); // se crea un texto
l3 = new Label("Número 3"); // se crea una etiqueta
n3 = new TextField(); // se crea un texto
l4 = new Label("Número 4"); // se crea una etiqueta
n4 = new TextField(); // se crea un texto
l5 = new Label ("Promedio");// se crea una etiqueta
res = new TextField ();// se crea un texto
b = new Button("Promedio"); // se crea un boton
add(l1); // se añade la primera etiqueta a la ventana
add(n1); // se añade el primer texto a la ventana
add(l2); // se añade la segunda etiqueta a la ventana
add(n2); // se añade el segundo texto a la ventana
add(l3); // se añade la tercera etiqueta a la ventana
add(n3); // se añade el tercer texto a la ventana
add(l4); // se añade la cuarta etiqueta a la ventana
add(n4); // se añade el cuarto texto a la ventana
add(l5); // Se añade la quinta etiqueta
add(res); //Se añade el texto para resultado
add(b); // se añade el boton a la ventana
b. addActionListener(this); // el botton ahora tiene la facilidad de
// ser escuchado
}
// método para realizar las acciones al oprimir un botón
public void actionPerformed(ActionEvent ae) {
  // se toma el numero del texto n1 y se pasa a la variable num1 
double num1 = Double.parseDouble(n1.getText());
// se toma el numero del texto n2 y se pasa a la variable num2
double num2 = Double.parseDouble(n2.getText());
// se toma el numero del texto n3 y se pasa a la variable num3
double num3 = Double.parseDouble(n3.getText());
// se toma el numero del texto n4 y se pasa a la variable num4
double num4 = Double.parseDouble(n4.getText());
double resultado;// Se declara la variable resultado tipo double
resultado=(num1+num2+num3+num4)/4.0;//Se realiza la operación en la variable resultado
res.setText(""+resultado);//En el texto de resultado se imprime el valor obtenido 
                           //en la variable resultado, se deben colocar las comillas
                           //asi no se imprima ningún texto, de lo contrario no compila
}
}
