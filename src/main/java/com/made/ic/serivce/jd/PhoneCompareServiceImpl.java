package com.made.ic.serivce.jd;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HtmlUtil;
import cn.hutool.http.HttpUtil;
import com.made.ic.util.ResultMessage;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName: PhoneCompareServiceImpl
 * @Description: 手机比较功能
 * @Author: Made
 * @Date: 2019/7/30
 */
@Service
public class PhoneCompareServiceImpl implements PhoneCompareService{


    @Override
    public ResultMessage phoneCompare() {

        // https://www.jd.com/compare/100003060627-49479669533-0-0.html

        String url = "https://www.jd.com/compare/100004770281-100004770247-0-0.html";

        try {
            Document document = Jsoup.connect(url).get();

            Elements table2s = document.getElementsByClass("compare-table2");

            System.out.println(table2s);

            return ResultMessage.ok(table2s.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  ResultMessage.ok();
    }

    private  ResultMessage temp() {

        String url = "https://www.jd.com/compare/100003060627-49479669533-0-0.html";

        String result = HttpUtil.get(url);

        //List<String> list = ReUtil.findAll("<div class=\"compare-main\">(.*?)</div>", result, 1);

        //List<String> list = ReUtil.findAll("<table class=\"compare-table1\">(.*?)</table>", result, 1);

        //List<String> list2 = ReUtil.findAll("<table class=\"compare-table2\" id=\"compareResult\">(.*?)</table>", result, 1);


        List<String> list = ReUtil.findAll("<div id=\"container\" class=\"compare-cont\">(.*?)<div class=\"compare-promo\">", result, 1);

        String html = null;

        for (String content : list) {

            html = content;

            System.out.println(content);

            System.out.println("----------------------");
        }

        return ResultMessage.ok(html);
    }


    public static void main(String[] args) {



        String url = "https://www.jd.com/compare/100003060627-49479669533-0-0.html";

        try {
            Document document = Jsoup.connect(url).get();

            /*Elements tables = document.getElementsByTag("table");

            for (Element table : tables) {

                System.out.println(table.className());
            }*/

            Elements table2s = document.getElementsByClass("compare-table2");

            if (CollectionUtil.isEmpty(table2s)) {

                System.out.println("空...");
            }

            Element table2 = table2s.get(0);

            Elements tbodys = table2.getElementsByTag("tbody");


            for (int i=0; i < tbodys.size(); i++) {


                Element tbody = tbodys.get(i);
                parseTbody(tbody);
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void parseTbody(Element tbody) {

        tbody.getElementsByClass("tr-category");

        // 选择 class包括 tr-category 的 tr元素的所有 em后代元素
        String cssQuery = "tr.tr-category em";

        Element em = tbody.selectFirst(cssQuery);

        if  (em == null) {

            return;
        }


        String subject = em.html();

        System.out.println(subject);

        cssQuery = "tr.tr-item";

        Elements trs = tbody.select(cssQuery);

        for (Element tr : trs) {


            String title = tr.getElementsByClass("tb-title").html();

            Elements texts = tr.getElementsByClass("tb-text");

            System.out.print(title);

            for (Element text: texts) {


                System.out.print("\t" + text.html());
            }

            System.out.println();
        }

        System.out.println("⭐⭐⭐️");
    }
}
