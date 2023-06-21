package com.example.demo.Interface;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.Model.museo_x_obras;

public interface museo_x_obrasInterface extends CrudRepository<museo_x_obras, Integer> {

    @Query(value = "SELECT sum(sale_value) as Valor_Total_Sales_Con_Descuento FROM sales WHERE discount_sale=:type", nativeQuery = true)
    float SumSales(String type);

    // @Query(value="SELECT id,Console,MinimalPrice,MaximumPrice,Discount FROM
    // discounts",nativeQuery = true)
    // List<discounts> GetDiscounts();

}
