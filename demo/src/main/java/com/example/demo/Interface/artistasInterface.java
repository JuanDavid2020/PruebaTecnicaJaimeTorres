package com.example.demo.Interface;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.Model.artistas;

public interface artistasInterface extends CrudRepository<artistas, Integer> {

    @Query(value = "SELECT sum(sale_value) as Valor_Total_Sales_Con_Descuento FROM sales WHERE discount_sale=:type", nativeQuery = true)
    float SumSales(String type);

}
