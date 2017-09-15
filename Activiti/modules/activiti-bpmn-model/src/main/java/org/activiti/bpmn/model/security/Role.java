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
//TODO: Ha create
public  class Role extends SecurityFlowNode {
	protected String roleName;
	protected List<Role> parentRoles;
	protected List<Subject> subjects;
	protected List<Role> childRoles;
	protected List<Permission> permissions;
	public synchronized String getRoleName() {
		return roleName;
	}
	public synchronized void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public synchronized List<Role> getParentRoles() {
		return parentRoles;
	}
	public synchronized void setParentRoles(List<Role> parentRoles) {
		this.parentRoles = parentRoles;
	}
	public synchronized List<Subject> getSubjects() {
		return subjects;
	}
	public synchronized void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	public synchronized List<Role> getChildRoles() {
		return childRoles;
	}
	public synchronized void setChildRoles(List<Role> childRoles) {
		this.childRoles = childRoles;
	}
	public synchronized List<Permission> getPermissions() {
		return permissions;
	}
	public synchronized void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	
} // Role
