<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>投稿 確認</title>
</head>
<body>
<html:errors/>
<div class="header_title" styleId="header_title_entry_confirm">
投稿 確認
</div>
<div class="content" styleId="content_entry_confirm">
<s:form method="post" styleId="form_entry_confirm">
<h3 styleId="h3_entry_confirm_entry_body" class="entry_heading">
萌えを吐き捨てるSNS
</h3>
<div class="confirm" styleId="div_entry_confirm_entry_body">
${f:h(entry_body)}
</div>
<html:hidden property="entry_body" styleId="hiden_entry_confirm_entry_body"/>
<h3 styleId="h3_entry_confirm_tag_name" class="entry_heading">
タグ
</h3>
<div class="confirm" styleId="div_entry_confirm_tag_names">
${f:h(tag_names)}
</div>
<html:hidden property="tag_names" styleId="hiden_entry_confirm_tag_names"/>
<div styleId="entry_confirm_buttons">
<input type="submit" name="goEnter" value="修正する" styleId="submit_entry_confirm_enter"/>
<input type="submit" name="goComplete" value="投稿する" styleId="submit_entry_confirm_complete"/>
</s:form>
</div>
</div>
</body>
</html>