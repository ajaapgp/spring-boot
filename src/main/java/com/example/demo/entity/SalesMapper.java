package com.example.demo.entity;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Goodsマッパー
 * MyBatisを使って、SQLを発行する
 */
@Mapper
public interface SalesMapper {

    /**
     * salesを全件取得する
     * @return salesリスト
     */
    @Select("select * from sales") // SQLをXMLではなく、アノテーションで実装することもできる。
    List<Sales> select();

    /**
     * salesをインサートする
     * @param comoddity Sales
     */
    @Insert("insert into sales(id, sales_name, price) values(#{id}, #{salesName}, #{price})") // SQLが長くなるならXMLでも実装可能
    void regist(Sales sales);

}
