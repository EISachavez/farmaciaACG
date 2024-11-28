/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.achavez.farmaciaacg.src;

import com.achavez.farmaciaacg.dto.PedidoDTO;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author delph
 */
public class ValidaPedido {
    
    public boolean validarPedido(PedidoDTO pedido){
        if(!validaNombre(pedido.getNombreMedicamento())){
            generarError("Error de nombre", "El valor de nombre del medicamento no es correcto o contiene caracteres invalidos.");
            return false;
        }
        
        if(pedido.getTipoMedicamento().trim().equalsIgnoreCase("--Seleccione--")){
            generarError("Error de tipo de medicamento", "Debe seleccionar un tipo de medicamento.");
            return false;
        }
        
        if(isNullOrEmpty(pedido.getCantidadMedicamento()) || Integer.parseInt(pedido.getCantidadMedicamento()) <= 0){
            generarError("Error de cantidad de medicamento", "Debe digitar una cantidad mayor a cero.");
            return false;
        }
        
        if(isNullOrEmpty(pedido.getDistribuidor())){
            generarError("Error de distribuidor", "Debe seleccionar el distribuidor del medicamento.");
            return false;
        }
        
        if(pedido.getSucursalPrincipal() == null && pedido.getSucursalSecundaria() == null){
            generarError("Error de sucursal", "Debe seleccionar al menos una sucursal solicitante.");
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una sucursal solicitante.", "Error de sucursal", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    public boolean validaNombre(String nombre){
        if(isNullOrEmpty(nombre)){
            return false;
        }
        
        String regex = "^(?=(.*[a-zA-Z]){3})([a-zA-Z0-9áéíóúÁÉÍÓÚñÑ ]{5,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nombre);
        
        return matcher.matches();
    }
    
    public boolean isNullOrEmpty(String valor){
        return (valor == null || valor.trim().isEmpty());
    }
    
    public void generarError(String titulo, String msg){
        JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.ERROR_MESSAGE);
    }
    
}
