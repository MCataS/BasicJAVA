package Semana4;
/*****************
 * @author Margie*
 ****************/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.lang.Math;

public class Entrega2 extends Applet implements ActionListener {
TextField tfSueldo,tfPorcentaje,tfAnos;//entradas de texto
Label lSueldo,lPorcentaje,lAnos;//label de los textos de entrada
Button boton;
TextArea txtResultado;//Campo de texto para mostrar el resultado
//método constructor,donde se crean los objetos a dibujar en el applet
public Entrega2() {
//Damos la instruccion que no se usará ningun layout para poder dibujar con setBounds
this.setLayout((null));
//setBounds(posicionx, posiciony, ancho, alto)
lSueldo= new Label("Sueldo: ");
lSueldo.setBounds(20, 20, 100, 20);
lPorcentaje= new Label("% Aumento: ");
lPorcentaje.setBounds(20, 40, 100, 20);
lAnos= new Label("Número de Años: ");
lAnos.setBounds(20, 60, 100, 20);
tfSueldo = new TextField();
tfSueldo.setBounds(120, 20, 100, 20);
tfPorcentaje = new TextField();
tfPorcentaje.setBounds(120, 40, 100, 20);
tfAnos = new TextField();
tfAnos.setBounds(120, 60, 100, 20);
boton = new Button("Calcular");
boton.setBounds(120,80,100,20);
txtResultado=new TextArea();
txtResultado.setBounds(20,120,300,200);
//agregamos los elementos a la pantalla
add(lSueldo);
add(lPorcentaje);
add(lAnos);
add(tfSueldo);
add(tfPorcentaje);
add(tfAnos);
add(txtResultado);
add(boton);
boton. addActionListener(this); // se le añade al boton la facilidad de
// ser escuchado
}
//método paint en el cual se pone lo que se quiere dibujar
public void paint(Graphics g) {
this.setSize(340, 600);
}
// método para realizar las opciones al oprimir un botón
public void actionPerformed(ActionEvent ae) {
txtResultado.append("RESULTADO: " + "\n");
double Sal = Double.parseDouble(tfSueldo.getText());
double Por = Double.parseDouble(tfPorcentaje.getText());
int n = Integer.parseInt(tfAnos.getText());
double Men, Temp;
int Ano = 1;
        for(int i=1; i<=n; i++)
        {
            Temp = ((Sal*Por)/100);
            Men = Sal+Temp;
            Sal = Men;
            txtResultado.append("Año "+ Ano+ "     $" + Math.round(Sal) + "\n");
            Ano ++;
        }
}
}
