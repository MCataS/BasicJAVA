package Semana2;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.Graphics;
/*****************
 * @author Margie*
 ****************/
public class AppletGuia2 extends Applet implements ActionListener {
TextField tfEstatura,tfPeso;//Entradas de texto
Label lEstatura,lPeso;//Etiquetas de los textos de entrada
Button boton; //Botón
double resultado;//Variable para mostrar el resultado
//método constructor,donde se crean los objetos a dibujar en el applet
public AppletGuia2() {
//Damos la instruccion que no se usará ningun layout (controlan tamaño y posición
    // automáticamente) para poder dibujar con setBounds (método que mueve y cambia el
    //tamaño de un componente para caber dentro de los parámetros de un rectángulo
    //delimitador esecificado
this.setLayout((null));
//setBounds(posicionx, posiciony, ancho, alto)
lEstatura= new Label("Estatura (mt): ");// se crea una etiqueta
lEstatura.setBounds(20, 20, 100, 20);//se asigna el tamaño al componente
lPeso= new Label("Peso (kg): ");// se crea una etiqueta
lPeso.setBounds(20, 40, 100, 20);//se asigna el tamaño al componente
tfEstatura = new TextField();// se crea un texto
tfEstatura.setBounds(120, 20, 100, 20);//se asigna el tamaño al componente
tfPeso = new TextField();// se crea un texto
tfPeso.setBounds(120, 40, 100, 20);//se asigna el tamaño al componente
boton = new Button("Calcula");// se crea un botón
boton.setBounds(120,80,100,20);//se asigna el tamaño al componente
//agregamos los elementos a la pantalla
add(lEstatura);
add(lPeso);
add(tfEstatura);
add(tfEstatura);
add(tfPeso);
add(boton);

boton. addActionListener(this); // se le añade al boton la facilidad de
// ser escuchado
}
//método paint en el cual se pone lo que se quiere dibujar
public void paint(Graphics g) {
this.setSize(300, 300);

g.drawString("Su Indice de Masa corporal es = "+ resultado, 20, 120); //dibuja el cuadrado

}
// método para realizar las opciones al oprimir un botón
public void actionPerformed(ActionEvent ae) {
// se toma el numero del texto tfEstatura y se pasa a la variable double Estatura    
double Estatura = Double.parseDouble(tfEstatura.getText());
// se toma el numero del texto tfPeso y se pasa a la variable double Peso
double Peso = Double.parseDouble(tfPeso.getText());
//Teniendo los números tipo double podemos realizar la operación deseada y la asignamos a
//la variable resultado, devlarada al iniciar al iniciar la clase
resultado = (Peso/(Math.pow(Estatura,2)));
//Se solicita que se repinte la pantalla para añadir el resultado
repaint();
//La estatura debe marcarse cn un punto y no con coma para que el programa funcione.
}
    }

//public class Random extends Applet {
   
    
