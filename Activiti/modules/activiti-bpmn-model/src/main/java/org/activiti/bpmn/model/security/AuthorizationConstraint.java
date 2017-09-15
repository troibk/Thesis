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

import org.activiti.bpmn.model.FlowElement;
//TODO: Ha create
public  class AuthorizationConstraint extends SecurityFlowNode {
	
	public static final String CONSTRAINT_NAME_EDEFAULT = null;
	public static final boolean DYNAMIC_ENFORCEMENT_EDEFAULT = false;
	public static final String EXPRESSION_EDEFAULT = null;
	
	public String constraintName = CONSTRAINT_NAME_EDEFAULT;
	public String expression = EXPRESSION_EDEFAULT;
	public List<Permission> permissions = new ArrayList<Permission>();
	public boolean dynamicEnforcement = DYNAMIC_ENFORCEMENT_EDEFAULT;
	
	public String getConstraintName() {
		return constraintName;
	}
	public void setConstraintName(String constraintName) {
		this.constraintName = constraintName;
	}
	public String getExpression() {
		return expression;
	}
	public void setExpression(String expression) {
		this.expression = expression;
	}
	public List<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	public boolean isDynamicEnforcement() {
		return dynamicEnforcement;
	}
	public void setDynamicEnforcement(boolean dynamicEnforcement) {
		this.dynamicEnforcement = dynamicEnforcement;
	}

	public AuthorizationConstraint clone() {
		AuthorizationConstraint clone = new AuthorizationConstraint();
		clone.setValues(this);
		return clone();
	}
	
	public void setValues(AuthorizationConstraint otherElement){
		super.setValues(otherElement);
		setConstraintName(otherElement.getConstraintName());
		setExpression(otherElement.getExpression());
		setDynamicEnforcement(otherElement.isDynamicEnforcement());
		permissions = new ArrayList<Permission>();
	    if (otherElement.getPermissions() != null && !otherElement.getPermissions().isEmpty()) {
	    	permissions.addAll(otherElement.getPermissions());
	    }
	}

} // AuthorizationConstraint
