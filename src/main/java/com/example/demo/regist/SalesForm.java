package com.example.demo.regist;

import lombok.Data;

/**
 * goodsフォーム
 * 
 * Tips アプリケーションレイヤーの考え方
 * フォームクラスはサービスクラスやマッパーでは使用しない。
 * フォームクラスはHTMLとコントローラ間で使用する。
 * 
 * 未実装
 * 各フィールドにアノテーションを付与して、単項目チェックを行う
 */
@Data
public class SalesForm {
    private Integer id;
    private String salesName;
    private Integer price;
}
