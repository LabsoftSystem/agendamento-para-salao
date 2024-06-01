package com.salao.salao.Entitity;

import java.util.List;

import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Funcionario extends Pessoa{
    
    @OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY)
    private List<Agendamento> agendamentos;
}
