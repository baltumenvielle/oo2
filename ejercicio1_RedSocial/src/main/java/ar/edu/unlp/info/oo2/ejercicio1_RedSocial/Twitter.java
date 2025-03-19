package ar.edu.unlp.info.oo2.ejercicio1_RedSocial;

import java.util.List;

public class Twitter {
	private List<Usuario> usuarios;
	
	public void eliminarUsuario(Usuario usuario) {
		usuario.eliminarPublicaciones();
		usuarios.remove(usuario);
	}
}
