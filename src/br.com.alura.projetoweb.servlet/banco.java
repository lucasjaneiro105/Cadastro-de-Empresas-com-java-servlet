package br.com.alura.projetoweb.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class Banco { 

    private static List<Empresa> lista = new ArrayList<>();
    private static Integer chaveSequencial = 1;
    
    static {
    	 Empresa empresa = new Empresa();
         empresa.setId(chaveSequencial++);
         empresa.setNome("Empresa A");
         Empresa empresa2 = new Empresa();
         empresa2.setId(chaveSequencial++);
         empresa2.setNome("Empresa B");
         lista.add(empresa);
         lista.add(empresa2);
    }

  
    public List<Empresa> getEmpresas(){ 
        return Banco.lista;
    }
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);
		
	}
	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while (it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				 it.remove();
		}
		
		
	}

}
	public Empresa buscaEmpresa(Integer id) {
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
	}