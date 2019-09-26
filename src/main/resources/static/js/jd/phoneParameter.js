


var wareId = $("#wareId").val();


$.ajax({
    type : "POST",
    //contentType: "application/json;charset=UTF-8",
    url : "/phoneParameter/getParameter?wareId=" + wareId,
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