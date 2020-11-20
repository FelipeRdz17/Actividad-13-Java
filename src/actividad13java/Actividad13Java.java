/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad13java;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author felip
 */
public class Actividad13Java {
    
    //FELIPE GUADALUPE RODRÍGUEZ RAMÍREZ
    //2795588
    //ACTIVIDAD 13 JAVA
    
    //LISTA STRING REQUERIDA
    static List <String> listaNom = new ArrayList<>();
    
    
    public static void main(String[] args) {
    //LLAMADO A CLASE ANONIMA
    claseAnonima claseA = new claseAnonima(){
        //ORDEN LONGITUD
            @Override
            public void lengthOrder(List<String> lista){
                lista.sort((String o1, String o2) -> {
                int result;
                if (o1.length()>o2.length()){
                    result = 1;
                } else if (o1.length()<o2.length()){
                    result = -1;
                } else {
                    result = 0;
                }
                return result;
                });
            }
            //ORDEN ALFABETICO
            @Override
            public void alphOrder(List<String>lista){
                lista.sort((String s1, String s2) -> s1.compareTo(s2));
            }
        };      
         
    //10 STRINGS REQUERIDOS
        listaNom.add("Lucas");
        listaNom.add("Damián");
        listaNom.add("Nahuel");
        listaNom.add("André-Pierre");
        listaNom.add("Danilinho");
        listaNom.add("Héctor");
        listaNom.add("Eduardo");
        listaNom.add("Guido");
        listaNom.add("Hugo");
        listaNom.add("Rafael");  
        
    //LISTA
    System.out.println("Lista de Nombres: " + listaNom);
    
    //VARIABLES PARA MÉTODOS DE REFERENCIA
    sortList lengthOrder = Actividad13Java::lengthOrder;
    sortList alphOrder = Actividad13Java::alphOrder;
    
    //ORDENAMIENTO DE LONGITUD
    //MENSAJES DEL SISTEMA
    System.out.println("--ORDENADO POR LONGITUD--");
    
    //ORDENAMIENTO DE LONGITUD MEDIANTE CLASE ANÓNIMA
    claseA.lengthOrder(listaNom);
    System.out.println("MEDIANTE CLASE ANÓNIMA:");
    System.out.println(listaNom);
        
    //ORDENAMIENTO DE LONGITUD MEDIANTE LAMBDA
    listaNom.sort(Comparator.comparingInt(String::length));
    System.out.println("MEDIANTE LAMBDA: ");
    System.out.println(listaNom);
    
    //ORDENAMIENTO DE LONGITUD MEDIANTE MÉTODOS DE REFERENCIA
    lengthOrder.sort(listaNom);
    System.out.println("MEDIANTE MÉTODO DE REFERENCIA: ");
    System.out.println(listaNom);

    //ORDEN ALFABETICO
    //MENSJAES DEL SISTEMA
    System.out.println("--ORDENADO POR ALFABETO--");
    
    //ORDENAMIENTO DE ALFABETICO MEDIANTE CLASE ANÓNIMA
    claseA.alphOrder(listaNom);
    System.out.println("MEDIANTE CLASE ANÓNIMA:");
    System.out.println(listaNom);
    
    //ORDENAMIENTO DE ALFABETICO MEDIANTE LAMBDA
    listaNom.sort((String s1, String s2) -> s1.compareTo(s2));
    System.out.println("MEDIANTE LAMBDA: ");
    System.out.println(listaNom);
    
    //ORDENAMIENTO DE ALFABETICO MEDIANTE MÉTODOS DE REFERENCIA
    alphOrder.sort(listaNom);
    System.out.println("MEDIANTE MÉTODO DE REFERENCIA: ");
    System.out.println(listaNom);
        
    }
    
    //DECLARACIÓN DEL ORDENAMIENTO POR LONGITUD
        public static void lengthOrder(List<String> listaNom){
        listaNom.sort((String o1, String o2) -> {
            int result;
            if (o1.length()>o2.length()){
                result = 1;
            } else if (o1.length()<o2.length()){
                result = -1;
            } else {
                result = 0;
            }
            return result;
        });
    }
        
    //DECLARACIÓN DEL ORDENAMIENTO POR ALFABETO
    public static void alphOrder(List<String>listaNom){
        listaNom.sort((String s1, String s2) -> s1.compareTo(s2));
    }
    
    //DECLARACIÓN DE INTERFAZ SORTLIST
    interface sortList {
        void sort(List<String> listaNom);
    }
    
    //DECLARACIÓN DE INTERFAZ DE CLASE ANÓNIMA
    interface claseAnonima{
        //LONGITUD
        public void lengthOrder(List<String> listaNom);
        //ALFABETO
        public void alphOrder(List<String>lista);
    }
    
}
