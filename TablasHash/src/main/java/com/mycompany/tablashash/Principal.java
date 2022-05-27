/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablashash;

/**
 *
 * @author vh367
 */
public class Principal {
        public static void main(String[] args) {
        try{
            int i, n, resp;
            int m = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese tamaño de la tabla\n"));
            Hash[] h = new Hash[m];
            for (i = 0; i<m; i++){
                h[i] = new Hash();
                h[i].estado = 0;
            }
            do{
                resp = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Menú Principal nn \\n"
                        + "Insertar(1)\n"
                        + "nBuscar(2)\n"
                        + "nEliminar(3)\n"
                        + "encontrar casilla del número(4)\n"
                        + "nSalir(5)\n"));
                switch(resp){
                    case 1:
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el Numero a ser insertado en la tabla"));
                        Hash.insertaHash(h, m, n);
                        break;
                    case 2:
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el Numero a ser buscado en la tabla"));
                        i = Hash.buscarHash(h, m, n);
                        if(i == -1){
                            javax.swing.JOptionPane.showMessageDialog(null, "Número no encontrado");
                        }else{
                            javax.swing.JOptionPane.showMessageDialog(null, "Número encontrado");  
                            javax.swing.JOptionPane.showMessageDialog(null, i);
                        }
                        break;
                    case 3:
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese el Numero a ser eliminado en la tabla"));
                        i = Hash.eliminaHash(h, m, n);
                        if(i == -1){
                            javax.swing.JOptionPane.showMessageDialog(null, "Número no encontrado");
                        }else{
                            javax.swing.JOptionPane.showMessageDialog(null, "Número eliminado con éxito");  
                        }
                        break;
                         case 4:
                        n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("ingrese el número al que desea saber su casilla"));
                        i = Hash.buscarHash(h, m, n);
                        if(i == -1){
                            javax.swing.JOptionPane.showMessageDialog(null, "Número no encontrado");
                        }else{
                            
                            javax.swing.JOptionPane.showMessageDialog(null, "la casilla del dato"  +n+ "es:" +i);
                        }
                        break;
                    case 5:
                        System.exit(0);
                    default:
                }      
            }while (resp != 5);  
        }catch (NumberFormatException nfe){
            javax.swing.JOptionPane.showMessageDialog(null, "está saliendo del programa");
        }catch (OutOfMemoryError ome){
            javax.swing.JOptionPane.showMessageDialog(null, "No hay espacio");
            
        }
    }
}
