package com.tcsloja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcsloja.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Integer>{

}
