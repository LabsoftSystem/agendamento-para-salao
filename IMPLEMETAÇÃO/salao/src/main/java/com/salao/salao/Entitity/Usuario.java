package com.salao.salao.Entitity;

import com.salao.salao.Configuracao.RoleUsuario;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Usuario extends Pessoa{
    
    @Column(name = "tipoUsuario", nullable = false)
    private RoleUsuario tipoUsuario;

}