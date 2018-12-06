$(document).ready(function () {
    $("#right1").css("display","none");
    $("#right2").css("display","none");
    $("#right3").css("display","none");

    $("#selectmenu").click(function () {
        $("#right1").css("display","block");
        $("#right2,#right0,#right3").css("display","none");
        $("#selectmenu").css("background-color","#5890cf");
        $("#addmenu,#updatemenu,#classesmenu,#homepagemenu,#orderinfo,#aboutus").css("background-color","aliceblue");
        // $("#right0").css("display","none");
        // $("#right3").css("display","none");
    })

    $("#addmenu").click(function () {
        $("#right0,#right1,#right3").css("display","none");
        $("#right2").css("display","flex");
        $("#addmenu").css("background-color","#5890cf");
        $("#selectmenu,#updatemenu,#classesmenu,#homepagemenu,#orderinfo,#aboutus").css("background-color","aliceblue");
        // $("#right0").css("display","none");
        // $("#right3").css("display","none");
    })

    $("#updatemenu").click(function () {
        $("#right0,#right1,#right2").css("display","none");
        $("#right3").css("display","flex");
        // $("#right1").css("display","none");
        // $("#right2").css("display","none");
        $("#updatemenu").css("background-color","#5890cf");
        $("#addmenu,#selectmenu,#classesmenu,#homepagemenu,#orderinfo,#aboutus").css("background-color","aliceblue");
    })
    //跳转到修改页面
    $(".change").click(function () {
        $("#right0,#right1,#right2").css("display","none");
        $("#right3").css("display","flex");
        $("#updatemenu").css("background-color","#5890cf");
        $("#addmenu,#selectmenu,#classesmenu,#homepagemenu,#orderinfo,#aboutus").css("background-color","aliceblue");
    })

    $(".delete").click(function () {
        confirm("确定删除？")
    })
})