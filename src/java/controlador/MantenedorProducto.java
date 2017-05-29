/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Producto;

/**
 *
 * @author PabloNote
 */
public class MantenedorProducto {

    private ArrayList<Producto> productos = new ArrayList<>();

    public Producto buscar(String codigo) {
        for (Producto tmp : productos) {
            if (tmp.getCodigo().equals(codigo)) {
                return tmp;
            }
        }
        return null;
    }

    public int agregar(Producto productito) {
        if (productito.getCodigo() == null) {
            productito.setCodigo(generarCodigo(productito));
            if (buscar(productito.getCodigo()) == null) {
                productos.add(productito);
                return 1;
            }
            return 2;
        }
        return 0;
    }

    public String generarCodigo(Producto produ) {
        int numero = productos.size() + 1;

        return numero + "-"
                + produ.getTalla().charAt(0) + "-"
                + produ.getNombre().charAt(0);

    }
    public ArrayList<Producto> devolver()
    {
        return productos;
    }
    public int modificar(Producto productito)
    {
        if(buscar(productito.getCodigo())!=null){
            for (int i = 0; i < productos.size(); i++) {
                if(productos.get(i).getCodigo().equals(productito.getCodigo())){
                    productos.set(i, productito);
                    return 1;
                }
            }
        }
        return 0;
    }

}








