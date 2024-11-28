/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.achavez.farmaciaacg.src;

import com.achavez.farmaciaacg.dto.PedidoDTO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.json.JSONArray;
import org.json.JSONObject;


/**
 *
 * @author delph
 */
public class HistoricoPedidos {
    final String ruta = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();        
    final String rutaFichero = ruta + "..//..//data.txt";
    
    public JSONArray cargarTabla() {
        final String methodName = " [cargarTabla] ";
        try{
            validaArchivo();
            JSONArray dataArray = new JSONArray();
            
            FileReader fr = new FileReader(rutaFichero.replace("%20", " "));
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine()) != null){
                JSONObject objJson = new JSONObject(linea);
                dataArray.put(objJson);
            }
            System.out.println("json: " + dataArray);
            System.out.println(methodName + "FIN");
            return dataArray;
        } catch(IOException e){
            System.err.println(methodName + "Ha ocurrido un error: " + e.toString());
        }   
        return null;
    }
    
    public void almacenarPedido(PedidoDTO pedido){
        final String methodName = " [almacenarPedido] ";        
        try{
            validaArchivo();
            
            JSONObject pedidoJson = new JSONObject();
            pedidoJson.put("nombre",         pedido.getNombreMedicamento());
            pedidoJson.put("tipo",           pedido.getTipoMedicamento());
            pedidoJson.put("cantidad",       String.valueOf(pedido.getCantidadMedicamento()));
            pedidoJson.put("distribuidor",   pedido.getDistribuidor());
            pedidoJson.put("dir1",           pedido.getSucursalPrincipal() != null ? "SI" : "NO");
            pedidoJson.put("dir2",           pedido.getSucursalSecundaria() != null ? "SI" : "NO"); 
                        
            FileWriter fw = new FileWriter(rutaFichero.replace("%20", " "), true);
            PrintWriter data = new PrintWriter(fw);
            data.println(pedidoJson.toString());
            data.close();
                    
        } catch(IOException e){
            System.err.println(methodName + "Ha ocurrido un error: " + e.toString());
        }         
    }
    
    public void limpiarArchivo(){
        final String methodName = " [limpiarArchivo] ";        
        System.out.println(methodName + "[INI]");
         
        FileWriter fw;
        try {
            fw = new FileWriter(rutaFichero.replace("%20", " "));
            fw.flush(); 
            fw.close(); 

        } catch (IOException e) {
            System.err.println(methodName + "Ha ocurrido un error: " + e.toString());
        } 
    }
    
    public void validaArchivo(){
        final String methodName = " [validaArchivo] ";
        try{                                   
            File fichero = new File(rutaFichero.replace("%20", " "));
            if(!fichero.exists()){
                fichero.createNewFile();
            }
        } catch(IOException e){
            System.err.println(methodName + "Ha ocurrido un error: " + e.toString());
        }
    }
    
}
