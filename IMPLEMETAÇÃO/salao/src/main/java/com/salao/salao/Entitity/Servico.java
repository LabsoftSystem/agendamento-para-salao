package com.salao.salao.Entitity;

import java.util.List;
import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "servicos")  
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Servico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "nome_serviço")
    private String nomeServico;

    @Column(name = "descrição")
    private String descricao;

    @Column(name = "preço")
    private double preco;

    @ManyToMany(mappedBy = "servicos")  // Mapeamento muitos-para-muitos com o campo "servicos" em Agendamento
    private List<Agendamento> agendamentos;
}