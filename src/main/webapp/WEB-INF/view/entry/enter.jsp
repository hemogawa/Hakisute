<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>投稿</title>
</head>
<body>
<html:errors/>
<div class="header_title" styleId="header_title_entry_enter">
投稿 入力
</div>
<div class="content" styleId="content_entry_enter">
<s:form method="post" styleId="form_entry_enter">
<h3 styleId="h3_entry_enter_entry_body" class="entry_heading">
萌えを吐き捨てるSNS
</h3>
<html:textarea property="entry_body" styleId="textarea_entry_enter_entry_body"/> <br />
<h3 styleId="h3_entry_enter_tag_name" class="entry_heading">
タグ
</h3>
<html:text property="tag_names" styleId="text_entry_enter_tag_names"/><br />
<input type="submit" name="goConfirm" value="確認する" styleId="submit_entry_enter"/>
</s:form>
</div>
</body>
</html>