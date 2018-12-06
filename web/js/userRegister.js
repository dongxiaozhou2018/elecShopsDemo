window.onload = function ()
{
    //用户名验证
    var username = document.getElementById("username");
    username.onblur = function ()
    {
        var result = this.value.match(/^[a-z0-9]{6,14}$/);
        if (result == null)
        {
            document.getElementById("span1").innerText ="请输入用户名";
        }else
        {
            document.getElementById("span1").innerText ="√";
        }
    }
    //
    var password = document.getElementById("password");
    password.onblur = function ()
    {
        var result = this.value.match(/^\w{6,14}$/);
        if (result == null)
        {
            document.getElementById("span2").innerText ="请输入6~14位密码";
        }else
        {
            document.getElementById("span2").innerText ="√";
        }
        if (result == null )
        {
            document.getElementById("span3").innerText ="密码不匹配";
        }
    }
    var repassword = document.getElementById("repassword");
    repassword.onblur = function ()
    {
        if (repassword.value != password.value )
        {
            document.getElementById("span3").innerText ="密码不匹配";
        }else
        {
            document.getElementById("span3").innerText ="√";
        }

    }
    //邮箱验证
    var email = document.getElementById("email");
    email.onblur = function ()
    {
        var result = this.value.match(/^[0-9]{6,14}@(qq|163|126)(\.com|\.cn|\.org)$/);
        if (result == null)
        {
            document.getElementById("span4").innerText ="邮箱不可用";
        }else
        {
            document.getElementById("span4").innerText ="√";
        }
    }

    //手机号码
    var tel = document.getElementById("tel");
    tel.onblur = function ()
    {
        var result = this.value.match(/^[0-9]{11}$/);
        if (result == null)
        {
            document.getElementById("span5").innerText ="手机号有误";
        }else
        {
            document.getElementById("span5").innerText ="√";
        }
    }
    //邮编
    var zipcode = document.getElementById("zipcode");
    zipcode.onblur = function ()
    {
        var result = this.value.match(/^[0-9]{6}$/);
        if (result == null)
        {
            document.getElementById("span6").innerText ="邮编有误";
        }else
        {
            document.getElementById("span6").innerText ="√";
        }
    }
    //身份证号
    var id = document.getElementById("id");
    id.onblur = function ()
    {
        var result = this.value.match(/^[0-9]{17}([0-9]|x)$/);
        if (result == null)
        {
            document.getElementById("span7").innerText ="身份证有误";
        }else
        {
            document.getElementById("span7").innerText ="√";
        }
    }
    var submit = document.getElementById("submit");
    submit.onclick = function (){
        if (username.value==null&&password.value==null&&repassword.value==null&& !"".equals(username) && !"".equals(password))
        {
            alert("注册失败");
        }else if (username.length<6 || username.length>14)
        {
            alert("注册失败");
        }else if (password.length<6 || password.length>14 )
        {
            alert("注册失败");
        }else if (repassword.value != password.value )
        {
            alert("注册失败");
        }else
        {

        }
    }
}