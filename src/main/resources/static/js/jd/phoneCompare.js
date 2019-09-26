



$.ajax({
    type : "POST",
    //contentType: "application/json;charset=UTF-8",
    url : "/compare",
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


function buildContentHtml(data) {

    $("#content").html(data);

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
