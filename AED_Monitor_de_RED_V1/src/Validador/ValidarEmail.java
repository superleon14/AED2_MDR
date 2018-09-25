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
public class ValidarEmail {
    public static boolean validar(String email){
        boolean valido = false;
        String regex = "([_a-zA-Z0-9-]+)@([a-zA-Z0-9-]+)(.[a-z]{2,3})";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                valido = true;
            }
        return valido;
    }
}
