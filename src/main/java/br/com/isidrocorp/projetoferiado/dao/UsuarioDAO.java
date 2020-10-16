package br.com.isidrocorp.projetoferiado.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.projetoferiado.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer> {
	
	
	// se é findBy = SELECT *** from tbl_usuario WHERE ***
	public Usuario findByRacfAndSenha(String racf, String senha);
	public Usuario findByRacf(String racf);
	public Usuario findByRacfOrFuncional(String racf, String funcional);

}
