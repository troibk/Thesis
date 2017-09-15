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


public class ItemAwareElementAction extends Action {
	protected List<CompositeItemAwareElementAction> compositeItemAwareElementActions;
	protected ItemAwareElement itemAwareElement;
	public List<CompositeItemAwareElementAction> getCompositeItemAwareElementActions() {
		return compositeItemAwareElementActions;
	}
	public void setCompositeItemAwareElementActions(
			List<CompositeItemAwareElementAction> compositeItemAwareElementActions) {
		this.compositeItemAwareElementActions = compositeItemAwareElementActions;
	}
	public ItemAwareElement getItemAwareElement() {
		return itemAwareElement;
	}
	public void setItemAwareElement(ItemAwareElement itemAwareElement) {
		this.itemAwareElement = itemAwareElement;
	}
	
	

} // ItemAwareElementAction
