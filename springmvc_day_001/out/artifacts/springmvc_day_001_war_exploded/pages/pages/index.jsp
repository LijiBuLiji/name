<%--
  Created by IntelliJ IDEA.
  User: liujixiang
  Date: 2022/5/4
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="../js/jquery-1.8.2.min.js"></script>
</head>
<body>

    hhhhhhhhh
    <input type="text" onblur="test()"/>
    <script type="text/javascript">
        function test() {
            $.ajax({
                url:"http://localhost:9999/test/test5",
                data:{},
                dataType:"json",
                method:"get",
                success:function (e) {
                    console.log(e);
                    //map取值
                    // console.log(e.name);
                    // var object=JSON.parse(e);
                    // for(a in object){
                    //     console.log(object[a].name+"====="+object[a].age);
                    // }
                    $.each(e,function(i,item){
                        console.log(  item.name+item.age);

                    });

                }

            })
        }
    </script>
</body>
</html>
