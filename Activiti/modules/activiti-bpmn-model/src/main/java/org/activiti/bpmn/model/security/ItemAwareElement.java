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
import org.activiti.bpmn.model.ItemDefinition;

//TODO: Ha create
public class ItemAwareElement extends BaseElement {
	
	public DataState dataState;
	public ItemDefinition itemSubjectRef;
	public List<ItemAwareElementAction> itemAwareElementActions = new ArrayList<ItemAwareElementAction>();


	public ItemAwareElement clone() {
		// TODO Auto-generated method stub
		ItemAwareElement clone = new ItemAwareElement();
		clone.setValues(this);
		return clone();
	}
	
	public void setValues(ItemAwareElement otherElement){
		super.setValues(otherElement);
		setDataState(otherElement.getDataState());
		setItemSubjectRef(otherElement.getItemSubjectRef());
		
		itemAwareElementActions = new ArrayList<ItemAwareElementAction>();
	    if (otherElement.getItemAwareElementActions() != null && !otherElement.getItemAwareElementActions().isEmpty()) {
	    	itemAwareElementActions.addAll(otherElement.getItemAwareElementActions());
	    }
	}

	public DataState getDataState() {
		return dataState;
	}

	public void setDataState(DataState dataState) {
		this.dataState = dataState;
	}

	public ItemDefinition getItemSubjectRef() {
		return itemSubjectRef;
	}

	public void setItemSubjectRef(ItemDefinition itemSubjectRef) {
		this.itemSubjectRef = itemSubjectRef;
	}

	public List<ItemAwareElementAction> getItemAwareElementActions() {
		return itemAwareElementActions;
	}

	public void setItemAwareElementActions(List<ItemAwareElementAction> itemAwareElementActions) {
		this.itemAwareElementActions = itemAwareElementActions;
	}
	

} // ItemAwareElement
