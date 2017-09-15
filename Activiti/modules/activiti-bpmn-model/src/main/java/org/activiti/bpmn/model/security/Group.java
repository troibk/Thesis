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
import java.util.List;

public  class Group extends Subject {
	protected String groupName;
	protected List<Subject> subjects;
	public synchronized String getGroupName() {
		return groupName;
	}
	public synchronized void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public synchronized List<Subject> getSubjects() {
		return subjects;
	}
	public synchronized void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

} // Group
