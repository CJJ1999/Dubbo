<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<script type="text/javascript" src="static/jquery-3.0.0.js"></script>
<script type="text/javascript">
        $(function(){
           $("button").click(function () {
                $.ajax({
                    url:"qwservlet",
                    data:{
                        "cityCode":"101010100"
                    },
                    type:"post",
                    success:function (resp) {
                         alert(resp);
                    }
                })
           })
        })

</script>
</head>
<body>
<button>发起查询天气信息请求</button>
</body>
</html>
