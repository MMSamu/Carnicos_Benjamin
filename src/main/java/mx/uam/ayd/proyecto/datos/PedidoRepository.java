package mx.uam.ayd.proyecto.datos;

import mx.uam.ayd.proyecto.negocio.modelo.Pedido;
import org.springframework.data.repository.CrudRepository;

/**
 * Repositorio para la entidad Pedido.
 * Encargado de manejar los pedidos realizados por los clientes.
 * Permite registrar, buscar o cancelar pedidos.
 */

public interface PedidoRepository extends CrudRepository<Pedido, Long> {

}