package Semana2;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.Graphics;
/*****************
 * @author Margie*
 ****************/
public class AppletGuia extends Applet implements ActionListener {
TextField tfEstatura,tfPeso,tfGenero;//Entradas de texto
Label lEstatura,lPeso,lGenero;//Etiquetas de los textos de entrada
Button boton; //Botón
double resultado;//Variable para mostrar el resultado
String estado, genero;//Variable para mostrar el resultado
//método constructor,donde se crean los objetos a dibujar en el applet
public AppletGuia() {
//Damos la instruccion que no se usará ningun layout (controlan tamaño y posición
    
this.setLayout((null));
//setBounds(posicionx, posiciony, ancho, alto)
lEstatura= new Label("Estatura (mt): ");// se crea una etiqueta
lEstatura.setBounds(20, 20, 100, 20);//se asigna el tamaño al componente
lPeso= new Label("Peso (kg): ");// se crea una etiqueta
lPeso.setBounds(20, 40, 100, 20);//se asigna el tamaño al componente
lGenero= new Label("Género (1 F, 2 M): ");// se crea una etiqueta
lGenero.setBounds(20, 60, 100, 20);//se asigna el tamaño al componente
tfEstatura = new TextField();// se crea un texto
tfEstatura.setBounds(120, 20, 100, 20);//se asigna el tamaño al componente
tfPeso = new TextField();// se crea un texto
tfPeso.setBounds(120, 40, 100, 20);//se asigna el tamaño al componente
tfGenero = new TextField();// se crea un texto
tfGenero.setBounds(120, 60, 100, 20);//se asigna el tamaño al componente
boton = new Button("Calcula");// se crea un botón
boton.setBounds(120,100,100,20);//se asigna el tamaño al componente
//agregamos los elementos a la pantalla
add(lEstatura);
add(lPeso);
add(lGenero);
add(tfEstatura);
add(tfPeso);
add(tfGenero);
add(boton);

boton. addActionListener(this); // se le añade al boton la facilidad de
// ser escuchado
}
//método paint en el cual se pone lo que se quiere dibujar
public void paint(Graphics g) {
this.setSize(300, 300);

g.drawString("Su IMC es = "+ resultado, 40, 140); //dibuja el cuadrado
g.drawString("Su Género es = "+ genero, 40, 160); //dibuja el cuadrado
g.drawString("Su Estado es = "+ estado, 40, 180); //dibuja el cuadrado
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
int Genero = Integer.parseInt(tfGenero.getText());
switch (Genero)
{
    case 1:
        genero=("Femenino");
        //lGenero.setText("Femenino"); cambia el label en la interface
        if (resultado <20)
        {
        estado=("Bajo Peso");        
        }
        else
        {
            if(resultado <=23.9)
            {
            estado=("Normal");
            }
            else
            {
                if(resultado <=28.9)
                {
                    estado=("Obesidad Leve");
                }
                else
                {
                    if(resultado<=37)
                    {
                        estado=("Obesidad Severa");
                    }
                    else
                    {
                        estado=("Obesidad Muy Severa");
                    }
                }
            }
        }
       
        break;
    case 2:
        genero=("Masculino");
        if (resultado <20)
        {
        estado=("Bajo Peso");        
        }
        else
        {
            if(resultado <=24.9)
            {
            estado=("Normal");
            }
            else
            {
                if(resultado <=29.9)
                {
                    estado=("Obesidad Leve");
                }
                else
                {
                    if(resultado<=40)
                    {
                        estado=("Obesidad Severa");
                    }
                    else
                    {
                        estado=("Obesidad Muy Severa");
                    }
                }
            }
        }
        break;
        }

repaint();
//La estatura debe marcarse cn un punto y no con coma para que el programa funcione.
}
    }


   
    
