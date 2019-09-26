






$.ajax({
    type : "POST",
    //contentType: "application/json;charset=UTF-8",
    url : "/select",
    //data : JSON.stringify(list),
    success : function(result) {

        if (result.status != 200) {

            return alert(result.message);
        }

        buildContentHtml(result.data);
    },
    error : function(e){
        console.log(e.status);
        console.log(e.responseText);
    }
});


function selectParameter(wareId) {

    var url = "/phoneParameter?wareId=" + wareId;

    parent.jumpPage(url);

}


function buildContentHtml(data) {

    var limitDivPre = "<div class='col-sm-4'>";

    var panelDivPre = "<div class='panel panel-info'>";

    // -- HEAD
    var headingDivPre = "<div class='panel-heading'>";

    var hotCurrentRankSpanPre = "<span class='label label-danger'>";
    var currentRankSpanPre = "<span class='label label-info'>";
    // 当前排行
    var currentRank;

    var spanSuf = "</span>";

    // 热卖指数
    var hotScore;

    var headingDivSuf = "</div>";
    // -- HEAD

    // -- BODY
    var bodyDivPre = "<div class='panel-body' style='height: 200px'>";

    // 图片
    var leftPre = "<div class='col-sm-6'><a href='#' class='thumbnail' onclick='";
    var parameterUrl = "selectParameter(";
    var img = ")'> <img style='height: 120px' alt='无法显示' src='https://img13.360buyimg.com/n1/s320x320_";
    var imgPath;
    var leftSuf = "'></a></div>";

    // 名称
    var rightPre = "<div class='col-sm-6'>";

    var wareNamePre = "<h6 class='md-textLine-3'>";
    var wareName;
    var wareNameSuf = "</h6>";

    var goodRatePre = "<span class='label label-info '>好评率";
    var goodRate;
    var goodRateSuf = "%</span>";

    var pricePre = "<label style='color: red' id='";
    var priceId;
    var priceSuf = "'>￥</label>";


    var rightSuf = "</div>";

    var bodyDivSuf = "</div>";

    // -- BODY

    var panelDivSuf = "</div>";
    var limitDivSuf = "</div>";


    var products = data.products;
    var prices = data.prices;


    for (var i=0; i < products.length; i++) {

        var product = products[i];

        currentRank = product.currentRank;
        hotScore = product.hotScore;
        imgPath = product.imgPath;
        wareName = product.wareName;
        goodRate = product.goodRate;

        priceId = "J_" + product.wareId;

        var currentRankHtml;

        if (i < 3) {

            currentRankHtml = hotCurrentRankSpanPre + currentRank + spanSuf;
        } else {

            currentRankHtml = currentRankSpanPre + currentRank + spanSuf;
        }

        var headHtml = headingDivPre
            + currentRankHtml
            + "  热卖指数" + hotScore
            + headingDivSuf;



        var leftHtml = leftPre + parameterUrl + product.wareId + img + imgPath + leftSuf;

        var bodyHtml = bodyDivPre
            + leftHtml
            + rightPre + wareNamePre + wareName + wareNameSuf
            + goodRatePre + goodRate + goodRateSuf+ pricePre + priceId + priceSuf
            + rightSuf
            + bodyDivSuf;

        var html = limitDivPre + panelDivPre + headHtml + bodyHtml + panelDivSuf + limitDivSuf;


        $("#content").append(html);
    }


    for (var i=0; i < prices.length; i++) {

        var price = prices[i];

        var id = price.id;

        $("#" + id).append(price.p);
    }

}

/*


$('#table').bootstrapTable({
    //url: '/select',         //请求后台的URL（*）
    method: 'get',                      //请求方式（*）
    toolbar: '#toolbar',                //工具按钮用哪个容器
    striped: true,                      //是否显示行间隔色
    pagination: true,                   //是否显示分页（*）
    search: true,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
    showColumns: true,                  //是否显示所有的列
    showRefresh: true,                  //是否显示刷新按钮
    clickToSelect: true,                //是否启用点击选中行
    showToggle: true,                    //是否显示详细视图和列表视图的切换按钮
    cardView: true,                    //是否显示详细视图
    detailView: false,                   //是否显示父子表
    responseHandler: function(res) { //


        return res;
    },
    columns: [
        {
            field: 'wareName',
            title: '手机'
        }, {
            field: 'hotScore',
            title: '热卖指数'
        }, {
            field: 'imgPath',
            title: '图片',
            formatter: function(value, row, index) {//赋予的参数

                var pre = "https://img13.360buyimg.com/n1/s320x320_";

                var img  = "<img src='" + pre + value + "'>";

                return img;
            }
        },


    ],
});*/
