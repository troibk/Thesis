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
public  class ProcessAction extends Action {
	
	protected List<CompositeProcessAction> compositeProcessActions;
	protected org.activiti.bpmn.model.Process process;
	public List<CompositeProcessAction> getCompositeProcessActions() {
		return compositeProcessActions;
	}
	public void setCompositeProcessActions(List<CompositeProcessAction> compositeProcessActions) {
		this.compositeProcessActions = compositeProcessActions;
	}
	public org.activiti.bpmn.model.Process getProcess() {
		return process;
	}
	public void setProcess(org.activiti.bpmn.model.Process process) {
		this.process = process;
	}

	
} // ProcessAction
