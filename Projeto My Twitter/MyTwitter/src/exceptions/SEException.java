/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Jarelio Filho
 */
public class SEException extends RuntimeException {
    public SEException(){
        super("Você já segue este usuário!");
    }
}
