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

import org.activiti.bpmn.model.FlowElement;
import org.activiti.bpmn.model.FlowNode;

public class SecurityFlow extends FlowElement {
	protected FlowNode sourceRefNode;
	protected FlowNode targetRefNode;
	public synchronized FlowNode getSourceRefNode() {
		return sourceRefNode;
	}
	public synchronized void setSourceRefNode(FlowNode sourceRefNode) {
		this.sourceRefNode = sourceRefNode;
	}
	public synchronized FlowNode getTargetRefNode() {
		return targetRefNode;
	}
	public synchronized void setTargetRefNode(FlowNode targetRefNode) {
		this.targetRefNode = targetRefNode;
	}
	@Override
	public FlowElement clone() {
		SecurityFlow clone = new SecurityFlow();
		clone.setValues(this);
		return clone;
	}
	
	public void setValues(SecurityFlow otherElement){
		super.setValues(otherElement);
		setSourceRefNode(otherElement.getSourceRefNode());
		setTargetRefNode(otherElement.getTargetRefNode());
	}
	
} // SecurityFlow
