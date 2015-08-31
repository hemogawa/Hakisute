/*
 * Copyright 2004-2008 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package hakisute.action;

import hakisute.entity.Entry;
import hakisute.form.EntryForm;
import hakisute.service.EntryService;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class EntryAction {

	@ActionForm
	@Resource
	protected EntryForm entryForm;
	public JdbcManager jdbcManager;

	@Resource
	public EntryService entryService;

    @Execute(validator = false)
	public String enter() {
        return "enter.jsp";
	}

    @Execute(input="enter.jsp")
    public String goConfirm(){
    	return "confirm.jsp";
    }

    @Execute(validator = false)
	public String confirm() {
        return "confirm.jsp";
	}

    @Execute(input="confirm.jsp")
    public String goEnter(){
    	return "enter.jsp";
    }

    @Execute(input="confirm.jsp")
    public String goComplete(){
    	Entry entry = new Entry();
    	entry.entryBody = entryForm.entry_body;
    	entry.userId = 1;
    	entry.insertDate = "0000-01-01 00:00:00";
    	entry.updateDate = "0000-01-01 00:00:00";
    	entry.deleteFlg = false;
    	entryService.insert(entry);
    	System.out.println(entry.entryId);
    	return "complete.jsp";
    }

    @Execute(validator = false)
	public String complete() {
        return "complete.jsp";
	}

}
