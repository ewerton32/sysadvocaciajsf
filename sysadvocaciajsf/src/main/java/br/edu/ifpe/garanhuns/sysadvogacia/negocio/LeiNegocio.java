/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanhuns.sysadvogacia.negocio;

import br.edu.ifpe.garanhuns.sysadvogacia.entidades.Advogado;
import br.edu.ifpe.garanhuns.sysadvogacia.entidades.Cliente;
import br.edu.ifpe.garanhuns.sysadvogacia.entidades.Lei;
import br.edu.ifpe.garanhuns.sysadvogacia.entidades.Processo;
import br.edu.ifpe.garanhuns.sysadvogacia.persistencia.LeiDAO;
import java.util.List;

/**
 *
 * @author Ewerton
 */
public class LeiNegocio{
    
    private final LeiDAO repositorioLei;
            
    public  LeiNegocio(){
        repositorioLei = new LeiDAO(); 
    }
    
    public Lei salvar(Lei lei){
        return repositorioLei.save(lei);
    }
    
    public void remover(Lei lei){
        repositorioLei.remove(lei);
    }
    
    public List<Lei> listarLeis(){
        return repositorioLei.getAll();
    }
    
    public Lei LeiPorCodigo(int codigo){
        return repositorioLei.getById(Integer.SIZE);
    }
    
    public Processo ProcessoPorCodigoLei(int codigolei){        
        return repositorioLei.getById(codigolei).getProcessoCodigo(); 
    }
        
}
