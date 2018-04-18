
package josuecruz;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Nombre de la clase:
 * Fecha: 
 * Version:
 * CopyRight: 
 * @author Laboratorio2
 */
public class JosueCruz 
{
    public static void main(String[] args) 
    {
        DecimalFormat df = new DecimalFormat("#.##");
        int accion=0;
        String nombre[]=new String[1];
        double nota1[]=new double[1];
        double nota2[]=new double[1];
        double nota3[]=new double[1];
        int edad[]=new int[1];
        
        String nombre2[]=new String[100];
        double nota11[]=new double[100];
        double nota22[]=new double[100];
        double nota33[]=new double[100];
        int edad2[]=new int[100];
        String estado[]=new String[100];
        
        int puntero=0;
        double contador=0;
        int indicador=1;
        double numero=1;
        double promedio[]=new double[100];
        int aprobados=0;
        int reprobados=0;
        double menor=0;
        
        do
        {
            accion=Integer.parseInt(JOptionPane.showInputDialog("::MENU::"
                                   +"\n1-)Agregar Nota"
                                   +"\n2-)Calcular promedio"
                                   +"\n3-)Salir"));
            switch(accion)
            {
                case 1:
                    nombre[0]=JOptionPane.showInputDialog("Ingrese el nombre del estudiante N°"+indicador);
                    nota1[0]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 1 del estudiante N°"+indicador));
                    nota2[0]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 2 del estudiante N°"+indicador));
                    nota3[0]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 3 del estudiante N°"+indicador));
                    edad[0]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante N°"+indicador));
                    
                    nombre2[puntero]=nombre[0];
                    nota11[puntero]=nota1[0];
                    nota22[puntero]=nota2[0];
                    nota33[puntero]=nota3[0];
                    edad2[puntero]=edad[0];
                    promedio[puntero]=(((nota1[0])*(0.35))+((nota2[0])*(0.35))+((nota3[0])*(0.30)));
                    
                   
                    
                    if (promedio[puntero]>=7) 
                        {
                           estado[puntero]="Aprobado";
                           aprobados=aprobados+1;
                           
                        }
                        else
                        {
                           estado[puntero]="Reprobado";
                           reprobados=reprobados+1;
                        }
                    
                    puntero=puntero+1;
                    contador=contador+1;
                    indicador=indicador+1;
                    
                break;
                
                case 2:
                    if(nombre[0]!=null)
                    {
                    
                    for (int i = 0; i < contador; i++) 
                    {
                        JOptionPane.showMessageDialog(null, "::Datos Alumno N°"+numero
                                                     +"\nNombre: "+nombre2[i]
                                                     +"\nNota 1: "+df.format(nota11[i])
                                                     +"\nNota 2: "+df.format(nota22[i])
                                                     +"\nNota 3: "+df.format(nota33[i])
                                                     +"\nEdad: "+edad2[i]
                                                     +"\nPromedio Final: "+df.format(promedio[i])
                                                     +"\nEstado: "+estado[i]);
                    numero=numero+1;
                    }
                    numero=1;
                    JOptionPane.showMessageDialog(null, "::DATOS GENERALES::"
                                                +"\nCantidad de Aprobados: "+aprobados
                                                +"\nCantidad de Reprobados: "+reprobados);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"No ha ingresado alumnos");
                    }
                break;
                
                case 3:
                    System.exit(0);
                break;
            }
            
        
        }while(accion==1 || accion==2);
        
    }
}
