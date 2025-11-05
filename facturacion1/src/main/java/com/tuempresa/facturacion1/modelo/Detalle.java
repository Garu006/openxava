package com.tuempresa.facturacion1.modelo;

import javax.persistence.*;
import lombok.*;

@Embeddable @Getter @Setter
public class Detalle {
    int cantidad;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    Producto producto;

    producto.numero = N° de Producto
}
