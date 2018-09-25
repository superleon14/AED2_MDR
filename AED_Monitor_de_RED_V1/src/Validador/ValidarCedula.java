/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author leon
 */
public class ValidarCedula {
    public static boolean validar(String cedula){
        boolean valido = false;
        String regex = "\\d.\\d{3}.\\d{3}-\\d";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(cedula);
            if (matcher.matches()) {
                valido = true;
            }
        return valido;
    }
}
