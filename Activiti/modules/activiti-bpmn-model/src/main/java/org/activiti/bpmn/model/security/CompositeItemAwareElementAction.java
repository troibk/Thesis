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

public class CompositeItemAwareElementAction extends ItemAwareElementAction {
	
	protected List<ItemAwareElementAction> itemAwareElementActions;

	public List<ItemAwareElementAction> getItemAwareElementActions() {
		return itemAwareElementActions;
	}

	public void setItemAwareElementActions(List<ItemAwareElementAction> itemAwareElementActions) {
		this.itemAwareElementActions = itemAwareElementActions;
	}
	
	

} // CompositeItemAwareElementAction
