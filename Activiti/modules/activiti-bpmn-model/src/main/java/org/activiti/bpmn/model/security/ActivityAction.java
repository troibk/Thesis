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

import org.activiti.bpmn.model.Activity;

//TODO: Ha create
public class ActivityAction extends Action {

	protected Activity activity;
	protected List<CompositeActivityAction> compositeActivityActions = new ArrayList<CompositeActivityAction>();
	public Activity getActivity() {
		return activity;
	}
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	public List<CompositeActivityAction> getCompositeActivityActions() {
		return compositeActivityActions;
	}
	public void setCompositeActivityActions(List<CompositeActivityAction> compositeActivityActions) {
		this.compositeActivityActions = compositeActivityActions;
	}
	
	

} // ActivityAction
