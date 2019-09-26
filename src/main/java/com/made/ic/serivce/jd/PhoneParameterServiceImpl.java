package com.made.ic.serivce.jd;

import com.made.ic.util.ResultMessage;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @ClassName: PhoneParametersServiceImpl
 * @Description: 手机参数配置、规格详情
 * @Author: Made
 * @Date: 2019/7/31
 */
@Service
public class PhoneParameterServiceImpl implements PhoneParameterService{


    @Override
    public ResultMessage getParameter(String id) {

        //String url = "https://item.jd.com/100004770281.html";
        String url = "https://item.jd.com/" + id + ".html";


        try {
            Document document = Jsoup.connect(url).get();

            // 规格
            Elements parametersElements = document.getElementsByClass("Ptable");

            if (parametersElements == null || parametersElements.isEmpty()) {

            }

            Element parametersElement = parametersElements.get(0);


            // 包装
            Elements packingElements = document.getElementsByClass("package-list");

            if (packingElements == null || packingElements.isEmpty()) {

            }

            Element packingElement = parametersElements.get(0);


            return ResultMessage.ok(parametersElement.html() + packingElement.html());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  ResultMessage.ok();

    }


    private void parsePhoneParametersHtml(Element element) {

        Elements itemElements = element.getElementsByClass("Ptable-item");


        for (Element itemElement : itemElements) {

            String key = itemElement.selectFirst("h3").html();

        }


    }

    public static void main(String[] args) throws IOException {

        String url = "https://item.jd.com/100004770281.html";

        Document document = Jsoup.connect(url).get();

        Elements parametersElements = document.getElementsByClass("Ptable");

        System.out.println(parametersElements.html());
    }
}
