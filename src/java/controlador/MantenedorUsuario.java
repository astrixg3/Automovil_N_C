/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Usuario;

/**
 *
 * @author PabloNote
 */
public class MantenedorUsuario {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public Usuario buscar(String usu) {
        for (Usuario tmp : usuarios) {
            if (tmp.getUser().equals(usu)) {
                return tmp;
            }
        }
        return null;
    }

    public int verificar(Usuario usuarito) {
        Usuario usu = buscar(usuarito.getUser());
        if (usu != null) {
            if (usu.getPass().equals(usuarito.getPass())) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    public int agregar(Usuario usuarito) {
        if (buscar(usuarito.getUser()) == null) {
            usuarios.add(usuarito);
            return 1;
        }
        return 0;
    }
    
    public void llenar()
    {
        usuarios.add(new Usuario("nicolas", "123"));
        usuarios.add(new Usuario("cristiano", "123"));
    }

}
