package com.mycompany.optica.dao;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtilidades {

    // Generar hash de contrase;a 
    public static String generarHash(String contraseña) {
        return BCrypt.hashpw(contraseña, BCrypt.gensalt());
    }

    // Verificar contraseña
    public static boolean verificarPassword(String contraseña, String hash) {
        return BCrypt.checkpw(contraseña, hash);
    }
    public static void main(String[] args) {
    System.out.println(generarHash(""));
}
}