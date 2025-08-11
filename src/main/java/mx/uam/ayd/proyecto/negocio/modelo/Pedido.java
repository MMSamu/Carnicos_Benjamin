package mx.uam.ayd.proyecto.negocio.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class Pedido {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idPedido;

    // Compatibilidad con tests que usan setId/getId

    public Long getId() { return idPedido; }

    public void setId(Long id) { this.idPedido = id; }

    // Otras propiedades deldominio…

    private String tipoEntrega;   // <- NECESARIO para HU de método de entrega

    private LocalDate fechaCreacion;

    // Getters/Setters de tipoEntrega ya los genera Lombok
}

