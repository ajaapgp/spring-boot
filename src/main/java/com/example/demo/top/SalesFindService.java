package com.example.demo.top;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Sales;
import com.example.demo.entity.SalesMapper;

import lombok.RequiredArgsConstructor;

/**
 * goods検索サービス
 */
@Service
@RequiredArgsConstructor
public class SalesFindService {
    
    /** goodsマッパー */
    private final SalesMapper salesMapper;

    /**
     * goodsを全件取得する
     * @return salesリスト
     */
    public List<Sales> findSaless() {
        // 全件取得する
        return salesMapper.select();
    }
}
