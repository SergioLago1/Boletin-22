/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg22;

/**
 *
 * @author slagogonzalez
 */
public class Boletin22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Ficheros obx=new Ficheros();   
        obx.crearArray();
        obx.crearFichero("Libreria.txt");
        obx.buscarAutor();
        obx.consultarTitulo();
        obx.eliminar();
        obx.añadir("Libreria.txt",new Libros("Libro2","Pepe",5f,5));
        obx.modificar();
        obx.leerFichero("Libreria.txt");
    }
    
}
