package umg.cristian.proyecto2026.service;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import umg.cristian.proyecto2026.entity.Cliente;
import umg.cristian.proyecto2026.repository.ClienteRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cliente")

public class ClienteService {

    final ClienteRepository cr;

    ClienteService(ClienteRepository cr) {
        this.cr = cr;
    }

    @GetMapping(path="/buscar")
    public List<Cliente> buscarClientes() {
        return cr.findAll();
    }

    @PostMapping(path="/guardar")
    public Cliente guardarCliente(@RequestBody Cliente cliente) {
        return cr.save(cliente);
    }

    @DeleteMapping(path="/eliminar/{idcliente}")
    public void eliminarCliente(@PathVariable("idcliente") int idcliente) {
        cr.deleteById(idcliente);
    }

}