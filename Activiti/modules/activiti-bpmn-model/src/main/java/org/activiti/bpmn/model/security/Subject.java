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

import java.util.List;

import org.activiti.bpmn.model.BaseElement;
//TODO: Ha create
public class Subject extends BaseElement {
	protected List<Role> roles;
	protected List<Group> groups;
	public synchronized List<Role> getRoles() {
		return roles;
	}
	public synchronized void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public synchronized List<Group> getGroups() {
		return groups;
	}
	public synchronized void setGroups(List<Group> groups) {
		this.groups = groups;
	}
	@Override
	public BaseElement clone() {
		// TODO Auto-generated method stub
		Subject clone = new Subject();
		clone.setValues(this);
		return clone();
	}
	public void setValues(Subject otherElement){
		super.setValues(otherElement);
		setRoles(otherElement.getRoles());
		setGroups(otherElement.getGroups());
	}

} // Subject
