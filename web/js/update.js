window.onload = function ()
{
    var shop_id = document.getElementsByName("shop_id");
    var shop_name = document.getElementsByName("shop_name");
    var shop_des = document.getElementsByName("shop_des");
    var shop_img = document.getElementsByName("shop_img");
    var shop_price = document.getElementsByName("shop_price");
    var shop_cateId = document.getElementsByName("shop_cateId");
    var shop_stock = document.getElementsByName("shop_stock");
    var shop_isGc = document.getElementsByName("shop_isGc");
    var tijiao = document.getElementsByName("tijiao");

    Boolean.i;

    tijiao.onclick = function ()
    {
        if (shop_name!=null && shop_des!=null &&shop_img!=null&&shop_price!=null&&shop_cateId!=null&&shop_stock!=null&&shop_isGc!=null)
        {
            i = true;
        }else
        {
            i = false;
        }
        if (i==true)
        {
            return true;
        }else
        {
            alert("骚年别乱改！ok？")
            return false;
        }

        if (shop_price == null)
        {
            shop_price = 0;
        }
    }


}