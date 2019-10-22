<%@ page import="java.util.ArrayList" %><%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=0.5, maximum-scale=2.0, user-scalable=yes" />
  <title>阵型模拟器</title>
  <script src="http://libs.baidu.com/jquery/1.9.1/jquery.min.js"></script>
  <script>
    function alertaa() {
      alert("你好!")
    }

    function getLOLResult() {
      var checkID = [];//定义一个空数组
      $("input[name='piece']:checked").each(function (i) {//把所有被选中的复选框的值存入数组
        checkID[i] = $(this).val()
      });
      var arr = [];
      $("input[type='checkbox']:checked").each(function () {
        arr.push(this.value);
      })

      $.ajax({
        url: "line/"+checkID,
        type: "post",
        data: {
          "piece": checkID,
        },
        dataType: "text",
        traditional: true,
        success: function (result) {
          // $("#resultTest").text(result);
          // alert(result);
          $("#resultTest").val(result);
          // $("#resultTest").html(result)
          // alert(result);
        }
      });
    }
  </script>

  <style type="text/css">
    piece {
      display: inline;
      flex-direction: column;
      font-size: 18px;
    }

    div[id] {
      text-align: center;
      font-size: 30px;
      background-color: cornsilk;
    }

    /*.btnDiv{margin:0 auto;width:400px;height:100px;border:1px solid #000;text-align: left}*/
    /* CSS注释：设置对象边框、宽度、高度 便于观察布局效果 */
  </style>

</head>

<body>
<div id="head">LOL自走棋测试版</div>
<br/>

<form action="PieceServlet" method="post">
  <table>
    <tr>
      <td>账11号</td>
      <td><input type="text" name="username"></td>
    </tr>
    <tr>
      <td>密码</td>
      <td><input type="password" name="password"></td>
    </tr>
    <tr>
      <td><input type="button" onclick="javascript:alertaa()" value="登录"></td>
    </tr>
  </table>
</form>


<form action="PieceServlet" method="post" target="blank">
    <div class="pieceDiv">
      <piece>
        <td>狐狸</td>
        <td><input type="checkbox" name="piece" value="狐狸" style="height: 16px;width: 16px">&emsp;</td>
      </piece>
      <piece>
        <td>纳尔</td>
        <td><input type="checkbox" name="piece" value="纳尔" style="height: 16px;width: 16px">&emsp;</td>
      </piece>
      <piece>
        <td>剑魔</td>
        <td><input type="checkbox" name="piece" value="剑魔" style="height: 16px;width: 16px">&emsp;</td>
      </piece>
      <br/>
      <piece>
        <td>德莱文</td>
        <td><input type="checkbox" name="piece" value="德莱文" style="height: 16px;width: 16px">&emsp;</td>
      </piece>
      <piece>
        <td>剑姬</td>
        <td><input type="checkbox" name="piece" value="剑姬" style="height: 16px;width: 16px">&emsp;</td>
      </piece>
      <piece>
        <td>男枪</td>
        <td><input type="checkbox" name="piece" value="男枪" style="height: 16px;width: 16px">&emsp;</td>
      </piece>
      <br/>
      <piece>
        <td>奥巴马</td>
        <td><input type="checkbox" name="piece" value="奥巴马" style="height: 16px;width: 16px">&emsp;</td>
      </piece>
      <piece>
        <td>豹女</td>
        <td><input type="checkbox" name="piece" value="豹女" style="height: 16px;width: 16px">&emsp;</td>
      </piece>
      <piece>
        <td>船长</td>
        <td><input type="checkbox" name="piece" value="船长" style="height: 16px;width: 16px">&emsp;</td>
      </piece>
      <br/>
      <piece>
        <td>女枪</td>
        <td><input type="checkbox" name="piece" value="女枪" style="height: 16px;width: 16px">&emsp;</td>
      </piece>
      <piece>
        <td>慎</td>
        <td><input type="checkbox" name="piece" value="慎" style="height: 16px;width: 16px">&emsp;</td>
      </piece>
      <piece>
        <td>小炮</td>
        <td><input type="checkbox" name="piece" value="小炮" style="height: 16px;width: 16px">&emsp;</td>
      </piece>
      <br/>
      <piece>
        <td>狼人</td>
        <td><input type="checkbox" name="piece" value="狼人" style="height: 16px;width: 16px">&emsp;</td>
      </piece>
      <piece>
        <td>亚索</td>
        <td><input type="checkbox" name="piece" value="亚索" style="height: 16px;width: 16px">&emsp;</td>
      </piece>
      <piece>
        <td>露露</td>
        <td><input type="checkbox" name="piece" value="露露" style="height: 16px;width: 16px">&emsp;</td>
      </piece>
      <br/>
      <piece>
        <td>凯南</td>
        <td><input type="checkbox" name="piece" value="凯南" style="height: 16px;width: 16px">&emsp;</td>
      </piece>
      <piece>
        <td>狗熊</td>
        <td><input type="checkbox" name="piece" value="狗熊" style="height: 16px;width: 16px">&emsp;</td>
      </piece>
    </div>

    <br/>
    <br/>

    <div class="btnDiv">
      <input type="reset" name="reset" value="重置" style="width: 90px;height: 30px;font-size: 16px">&emsp;
      <input type="button" onclick="getLOLResult();" name="result" value="生成阵型"
             style="width: 90px;height: 30px;font-size: 16px">
    </div>
    <br/>
    <br/>
    <div class="resultDiv">
      <textarea id="resultTest" class="resultTest" type="text" name="resultTest" disabled="disabled"
                style="height: 300px;width: 380px;margin:20px auto;font-size: 17px" onfocus=this.blur()></textarea>
      </divclass>
    </div>
</form>
</body>
</html>