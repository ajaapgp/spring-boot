package com.example.demo.top;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Sales;

import lombok.RequiredArgsConstructor;

/**
 * トップ画面コントローラ
 */
@Controller
@RequiredArgsConstructor
public class TopController {

    /** goods検索サービス */
    private final SalesFindService salesFindService;

    /**
     * トップ画面表示する。salesを全件表示する
     * @param model Model
     * @return top画面
     */
    @GetMapping("/")
    public String top(Model model) {
        // goods検索サービスから、全件取得する
        List<Sales> salesList = salesFindService.findSaless();
        // 取得した結果を設定する
        model.addAttribute("salesList", salesList);
        // トップ画面を表示する
        return "top/index";
    }
}
