package ar.edu.unlp.info.oo2.ejercicio1_RedSocial;

import java.util.List;
import java.util.stream.Stream;

public class Twitter {
	private List<Usuario> usuarios;
	
	public void eliminarUsuario(Usuario usuario) {
		usuarios.stream()
			.filter
		usuario.eliminarPublicaciones();
		usuarios.remove(usuario);
	}
}
