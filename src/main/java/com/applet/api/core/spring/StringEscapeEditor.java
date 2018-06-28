package com.applet.api.core.spring;

import jodd.util.StringUtil;
import org.apache.commons.lang.StringEscapeUtils;

import java.beans.PropertyEditorSupport;

/**
 * 防止XSS, SQL注入
 * @author zhouhuahu on 2018/6/26.
 */
public class StringEscapeEditor extends PropertyEditorSupport {
	
	private boolean control = false;

	public StringEscapeEditor() {
		super();
	}
	
	public StringEscapeEditor(boolean control) {
		super();
		this.control = control;
	}

	@Override
	public void setAsText(String text) {
		if (StringUtil.isEmpty(text)) {
			setValue(null);
		} else {
			if(control){
				text = StringEscapeUtils.escapeHtml(text);
				text = StringEscapeUtils.escapeJavaScript(text);
				text = StringEscapeUtils.escapeSql(text);
			}
			setValue(text);
		}
	}

	@Override
	public String getAsText() {
		Object value = getValue();
		return value != null ? value.toString() : null;
	}
}
