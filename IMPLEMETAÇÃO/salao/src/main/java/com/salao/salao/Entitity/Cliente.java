package com.salao.salao.Entitity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "cliente")
@Table(name = "cliente")
public class Cliente extends Usuario{
    
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)  // Mapeamento um-para-muitos
    private List<Agendamento> agendamentos;
}