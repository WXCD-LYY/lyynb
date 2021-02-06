<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
    <head>
        <!-- 指定字符集 -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>修改用户</title>

        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="js/jquery-2.1.0.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        
    </head>
    <body>
        <div class="container" style="width: 400px;">
        <h3 style="text-align: center;">修改联系人</h3>
        <form action="${pageContext.request.contextPath}/UpdateUserServlet" method="post">
            <%--隐藏于 提交id--%>
            <input type="hidden" name="id" value="${user.id}">

          <div class="form-group">
            <label for="name">姓名：</label>
            <input type="text" class="form-control" id="name" name="name"  value="${user.name}" readonly="readonly" placeholder="请输入姓名" />
          </div>

          <div class="form-group">
            <label>性别：</label>
              <c:if test="${user.gender == '男'}">
                  <input type="radio" name="gender" value="男" checked />男
                  <input type="radio" name="gender" value="女"  />女
              </c:if>

              <c:if test="${user.gender == '女'}">
                  <input type="radio" name="gender" value="男"  />男
                  <input type="radio" name="gender" value="女" checked />女
              </c:if>
              
              
          </div>

          <div class="form-group">
            <label for="age">年龄：</label>
            <input type="text" class="form-control" id="age"  name="age" value="${user.age}" placeholder="请输入年龄" />
          </div>

          <div class="form-group">
            <label for="address">籍贯：</label>
             <select name="address" id="address" class="form-control" >

                 <c:if test="${user.address == '广东'}">
                     <option value="广东" selected>广东</option>
                 </c:if>

                 <c:if test="${user.address == '广西'}">
                     <option value="广西" selected>广西</option>
                 </c:if>

                 <c:if test="${user.address == '湖南'}">
                     <option value="湖南" selected>湖南</option>
                 </c:if>

                 <c:if test="${user.address == '黑龙江'}">
                     <option value="黑龙江" selected>黑龙江</option>
                 </c:if>

                 <c:if test="${user.address == '吉林'}">
                     <option value="吉林" selected>吉林</option>
                 </c:if>

                 <c:if test="${user.address == '辽宁'}">
                     <option value="辽宁" selected>辽宁</option>
                 </c:if>

                 <c:if test="${user.address == '北京'}">
                     <option value="北京" selected>北京</option>
                 </c:if>

                 <c:if test="${user.address == '天津'}">
                     <option value="天津" selected>天津</option>
                 </c:if>

                 <c:if test="${user.address == '内蒙古'}">
                     <option value="内蒙古" selected>内蒙古</option>
                 </c:if>

                 <c:if test="${user.address == '河北'}">
                     <option value="河北" selected>河北</option>
                 </c:if>

                 <c:if test="${user.address == '山西'}">
                     <option value="山西" selected>山西</option>
                 </c:if>

                 <c:if test="${user.address == '山东'}">
                     <option value="山东" selected>山东</option>
                 </c:if>

                 <c:if test="${user.address == '新疆'}">
                     <option value="新疆" selected>新疆</option>
                 </c:if>

                 <c:if test="${user.address == '甘肃'}">
                     <option value="甘肃" selected>甘肃</option>
                 </c:if>

                 <c:if test="${user.address == '宁夏'}">
                     <option value="宁夏" selected>宁夏</option>
                 </c:if>

                 <c:if test="${user.address == '青海'}">
                     <option value="青海" selected>青海</option>
                 </c:if>

                 <c:if test="${user.address == '西藏'}">
                     <option value="西藏" selected>西藏</option>
                 </c:if>

                 <c:if test="${user.address == '陕西'}">
                     <option value="陕西" selected>陕西</option>
                 </c:if>

                 <c:if test="${user.address == '河南'}">
                     <option value="河南" selected>河南</option>
                 </c:if>

                 <c:if test="${user.address == '江苏'}">
                     <option value="江苏" selected>江苏</option>
                 </c:if>

                 <c:if test="${user.address == '安徽'}">
                     <option value="安徽" selected>安徽</option>
                 </c:if>

                 <c:if test="${user.address == '上海'}">
                     <option value="上海" selected>上海</option>
                 </c:if>

                 <c:if test="${user.address == '四川'}">
                     <option value="四川" selected>四川</option>
                 </c:if>

                 <c:if test="${user.address == '重庆'}">
                     <option value="重庆" selected>重庆</option>
                 </c:if>

                 <c:if test="${user.address == '湖北'}">
                     <option value="湖北" selected>湖北</option>
                 </c:if>

                 <c:if test="${user.address == '江西'}">
                     <option value="江西" selected>江西</option>
                 </c:if>

                 <c:if test="${user.address == '贵州'}">
                     <option value="贵州" selected>贵州</option>
                 </c:if>

                 <c:if test="${user.address == '福建'}">
                     <option value="福建" selected>福建</option>
                 </c:if>

                 <c:if test="${user.address == '云南'}">
                     <option value="云南" selected>云南</option>
                 </c:if>

                 <c:if test="${user.address == '海南'}">
                     <option value="海南" selected>海南</option>
                 </c:if>

                 <c:if test="${user.address == '浙江'}">
                     <option value="浙江" selected>浙江</option>
                 </c:if>

                 <c:if test="${user.address == '台湾'}">
                     <option value="台湾" selected>台湾</option>
                 </c:if>

                 <c:if test="${user.address == '香港'}">
                     <option value="香港" selected>香港</option>
                 </c:if>

                 <c:if test="${user.address == '澳门'}">
                     <option value="澳门" selected>澳门</option>
                 </c:if>
                 <option value="黑龙江">黑龙江</option>
                 <option value="吉林">吉林</option>
                 <option value="辽宁">辽宁</option>
                 <option value="北京">北京</option>
                 <option value="天津">天津</option>
                 <option value="内蒙古">内蒙古</option>
                 <option value="河北">河北</option>
                 <option value="山西">山西</option>
                 <option value="山东">山东</option>
                 <option value="新疆">新疆</option>
                 <option value="甘肃">甘肃</option>
                 <option value="宁夏">宁夏</option>
                 <option value="青海">青海</option>
                 <option value="西藏">西藏</option>
                 <option value="陕西">陕西</option>
                 <option value="河南">河南</option>
                 <option value="江苏">江苏</option>
                 <option value="安徽">安徽</option>
                 <option value="上海">上海</option>
                 <option value="四川">四川</option>
                 <option value="重庆">重庆</option>
                 <option value="湖北">湖北</option>
                 <option value="江西">江西</option>
                 <option value="贵州">贵州</option>
                 <option value="福建">福建</option>
                 <option value="云南">云南</option>
                 <option value="海南">海南</option>
                 <option value="浙江">浙江</option>
                 <option value="台湾">台湾</option>
                 <option value="香港">香港</option>
                 <option value="澳门">澳门</option>

            </select>
          </div>

          <div class="form-group">
            <label for="qq">QQ：</label>
            <input type="text" class="form-control" name="qq" id="qq" value="${user.qq}" placeholder="请输入QQ号码"/>
          </div>

          <div class="form-group">
            <label for="email">Email：</label>
            <input type="text" class="form-control" name="email" id="email" value="${user.email}" placeholder="请输入邮箱地址"/>
          </div>

             <div class="form-group" style="text-align: center">
                <input class="btn btn-primary" type="submit" value="提交" />
                <input class="btn btn-default" type="reset" value="重置" />
                <input class="btn btn-default" type="button" value="返回"/>
             </div>
        </form>
        </div>
    </body>
</html>