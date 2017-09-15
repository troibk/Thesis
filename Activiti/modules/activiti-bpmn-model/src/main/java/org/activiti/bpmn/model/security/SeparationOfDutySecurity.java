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

//TODO: Ha create
public  class SeparationOfDutySecurity extends AuthorizationConstraint {
	protected Integer minimumUsers;
	protected Integer maxUserActionsPermitted;
	public synchronized Integer getMinimumUsers() {
		return minimumUsers;
	}
	public synchronized void setMinimumUsers(Integer minimumUsers) {
		this.minimumUsers = minimumUsers;
	}
	public synchronized Integer getMaxUserActionsPermitted() {
		return maxUserActionsPermitted;
	}
	public synchronized void setMaxUserActionsPermitted(Integer maxUserActionsPermitted) {
		this.maxUserActionsPermitted = maxUserActionsPermitted;
	}


} // SeparationOfDuty
