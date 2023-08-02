package com.example.demo.regist;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Sales;
import com.example.demo.entity.SalesMapper;

import lombok.RequiredArgsConstructor;

/**
 * goods登録サービス
 * 
 * Tips アプリケーションレイヤーの考え方
 * サービスクラス内では、フォームクラスは使用しない。import禁止。
 * フォームクラスは必ず、Dtoクラスやエンティティクラスに移し替えてからサービスクラスに渡す。
 * サービスクラスに業務ロジックを実装する。
 */
@Service
@RequiredArgsConstructor
public class SalesRegistService {
    
    /** salesマッパー */
    private final SalesMapper salesMapper;

    /**
     * salesを登録する
     * @param sales Sales
     */
    public void registSales(Sales sales) {
        
        // Tips
        // Goodsクラスにsetter,getterは実装していないが「sales.getSalesName()」のビルドができる。
        // Lombokの機能で「@Data」アノテーションをGoodsクラスに付けることでsetter,getterがclassファイルとして生成されている。
        System.out.println(sales.getSalesName());


        // 未実装
        // 業務処理を実装する。例：今回登録する内容とDBに登録済みの内容を比較して、結果によってエラーとする等。


        // DBへ登録する
        salesMapper.regist(sales);
    }
}
