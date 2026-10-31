package umg.cristian.proyecto2026.service;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import umg.cristian.proyecto2026.entity.Usuario;
import umg.cristian.proyecto2026.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*")
public class UsuarioService {
	
	final UsuarioRepository ur;

	UsuarioService(UsuarioRepository ur) {
		this.ur = ur;
	}
	
	@GetMapping(path="/buscar")
	public List<Usuario> buscarUsuarios(){
		
		return ur.findAll();
	}
	
	@GetMapping(path="/buscar/{correo}/{contrasena}")
	public List<Usuario> buscarUsuariosCorreoYContrasena(
		@PathVariable("correo") String correo,
		@PathVariable("contrasena") String contrasena
		){
		return ur.findByCorreoAndContrasena(correo, contrasena);
	}
	
	@PostMapping(path="/guardar")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		
		return ur.save(usuario);
	}
	
	@DeleteMapping(path = "/eliminar/{idusuario}")
	
	public void eliminarUsuario(@PathVariable("idusuario") int idusuario) {
		ur.deleteById(idusuario);
	}
	
	@PostMapping(path="/login")
	public Usuario login(@RequestBody Usuario usuario) {
		
		List<Usuario> usuarios = ur.findByCorreoAndContrasena(usuario.getCorreo(), usuario.getContrasena());
		if(usuarios.isEmpty()) {
			return null;
		}
		else {
			return usuarios.get(0);
		}
	}
}
