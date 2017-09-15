/**
 * <copyright>
 * 
 * Copyright (c) 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 * 
 * </copyright>
 */
package org.activiti.bpmn.model.security;

import java.util.ArrayList;
import java.util.List;
import org.activiti.bpmn.model.BaseElement;
import org.activiti.bpmn.model.Pool;

//TODO: Ha create
public class Action extends BaseElement {
	protected static final String ACTION_NAME_EDEFAULT = null;
	protected String actionName = ACTION_NAME_EDEFAULT;
	protected List<Permission> permissions = new ArrayList<Permission>();
	
	public Action clone() {
		// TODO Auto-generated method stub
		Action clone = new Action();
	    clone.setValues(this);
		return clone;
	}
	
	public void setValues(Action otherElement){
		super.setValues(otherElement);
		setActionName(otherElement.getActionName());
		permissions = new ArrayList<Permission>();
	    if (otherElement.getPermissions() != null && !otherElement.getPermissions().isEmpty()) {
	    	permissions.addAll(otherElement.getPermissions());
	    }
	}
	
	public String getActionName() {
		return actionName;
	}
	
	public void setActionName(String newActionName) {
		actionName = newActionName;
	}
	
	public List<Permission> getPermissions() {
		return permissions;
	}

	public synchronized void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	
} // Action
