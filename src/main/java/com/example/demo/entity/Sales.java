package com.example.demo.entity;

import lombok.Data;

/**
 * sales★エンティティ
 * 
 * Tips
 * `@Data`がlombokのアノテーションで、setter,getterをclassファイルに対して自動生成してくれる。
 */
@Data
public class Sales {
    private Integer id;
    private String salesName;
    private Integer price;
}
