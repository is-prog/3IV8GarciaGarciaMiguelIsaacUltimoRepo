/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author alumno
 */
public class FuncionesProgram {
    
    public static boolean isNumeric(String cadena){
	try {
            int num1 = Integer.parseInt(cadena);
                if(num1<=30 && num1>0){
                    return true;
                }else{
                    return false;
                }
		
	} catch (NumberFormatException nfe){
		return false;
	}
}
}
