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
//TODO: Ha create
public class Permission extends BaseElement {
	protected List<Role> roles= new ArrayList<Role>();
	protected List<Action> actions= new ArrayList<Action>();
	protected List<AuthorizationConstraint> authorizationConstraints= new ArrayList<AuthorizationConstraint>();
	protected String pName;
	public synchronized List<Role> getRoles() {
		return roles;
	}
	public synchronized void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public synchronized List<Action> getActions() {
		return actions;
	}
	public synchronized void setActions(List<Action> actions) {
		this.actions = actions;
	}
	public synchronized List<AuthorizationConstraint> getAuthorizationConstraints() {
		return authorizationConstraints;
	}
	public synchronized void setAuthorizationConstraints(List<AuthorizationConstraint> authorizationConstraints) {
		this.authorizationConstraints = authorizationConstraints;
	}
	public synchronized String getpName() {
		return pName;
	}
	public synchronized void setpName(String pName) {
		this.pName = pName;
	}
	
	public Permission clone() {
		// TODO Auto-generated method stub
		Permission clone = new Permission();
		clone.setValues(clone);
		return clone;
	}
	
	public void setValues(Permission otherElement){
		super.setValues(otherElement);
		setpName(otherElement.getpName());
		
		roles = new ArrayList<Role>();
	    if (otherElement.getRoles() != null && !otherElement.getRoles().isEmpty()) {
	    	roles.addAll(otherElement.getRoles());
	    }
	    
	    actions = new ArrayList<Action>();
	    if (otherElement.getActions() != null && !otherElement.getActions().isEmpty()) {
	    	actions.addAll(otherElement.getActions());
	    }
	    
	    authorizationConstraints = new ArrayList<AuthorizationConstraint>();
	    if (otherElement.getAuthorizationConstraints() != null && !otherElement.getAuthorizationConstraints().isEmpty()) {
	    	authorizationConstraints.addAll(otherElement.getAuthorizationConstraints());
	    }
	}
} // Permission
