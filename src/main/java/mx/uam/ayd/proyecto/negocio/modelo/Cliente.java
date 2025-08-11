package mx.uam.ayd.proyecto.negocio.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Representa a un cliente dentro del sistema.
 * Puede realizar pedidos y consultar su historial.
 */

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String metodoPago; // Efectivo o tarjeta

    /**
     * Metodo para mostrar el nombre completo del cliente.
     * 
     * @return nombre y apellido
     */

    public String nombreCompleto() {

        return nombre + " " + apellido;

    }

    /**
     * Verifica si el cliente tiene datos de contacto válidos.
     * 
     * @return true si el teléfono y el email están presentes
     */

    public boolean datosContactoCompletos() {

        return telefono != null && !telefono.isBlank()
                && email != null && !email.isBlank();

    }
}
