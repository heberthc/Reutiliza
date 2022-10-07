/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author Heberth Córdova
 */
public class comentarios { 
    
    javax.swing.JTextField descripcion=new javax.swing.JTextField();
    javax.swing.JTextField importe=new javax.swing.JTextField();
    javax.swing.JButton btnAgregar=new javax.swing.JButton();
    
    /*Este metodo permite habilitar o desativar el btn para agregar las filas a la tabla
    btn desactivado por defecto si el Txtfield descripcion && importe <<NO>> está vacío habilitamos btn agregar*/
    /*public void habilitarboton()
    {
        if(!descripcion.getText().isEmpty() && !importe.getText().isEmpty())
        {
            btnAgregar.setEnabled(true);
        }
        else
        {
            btnAgregar.setEnabled(false);
        }
    }
    */
       /* public void habilitarboton()
    {
        boolean descripcionllena = !descripcion.getText().isEmpty();
        boolean importelleno = !importe.getText().is Empty();
        boolean botonHabilitado=descripcionllena &&importelleno;        
        btnAgregar.set.Enabled(botonHabilitado);
    }*/
    
    boolean campoLleno(javax.swing.JTextField campo)
    {
        return !campo.getText().isEmpty();
    }
    public void HabilitarBotonParaAgregarFilas()
    {
        boolean descripcionLlena = campoLleno(descripcion);
        boolean importeLleno=campoLleno(importe);
        boolean botonHabilitado = descripcionLlena && importeLleno;
        btnAgregar.setEnabled(botonHabilitado);
    }
    
}
