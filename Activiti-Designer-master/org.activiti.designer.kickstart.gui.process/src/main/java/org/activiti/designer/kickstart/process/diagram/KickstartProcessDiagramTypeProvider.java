/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.designer.kickstart.process.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.notification.INotificationService;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

public class KickstartProcessDiagramTypeProvider extends AbstractDiagramTypeProvider {

  private KickstartProcessNotificationService activitiNotificationService;

	private IToolBehaviorProvider[] toolBehaviorProviders;

	public KickstartProcessDiagramTypeProvider() {
		super();
		setFeatureProvider(new KickstartProcessFeatureProvider(this));
	}

  @Override
  public INotificationService getNotificationService() {
    if (activitiNotificationService == null) {
      activitiNotificationService = new KickstartProcessNotificationService(this);
    }

    return activitiNotificationService;
  }

  @Override
	public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
		if (toolBehaviorProviders == null) {
			toolBehaviorProviders = new IToolBehaviorProvider[] { new KickstartProcessToolBehaviorProvider(this) };
		}
		return toolBehaviorProviders;
	}

  @Override
  public boolean isAutoUpdateAtStartup() {
    return true;
  }


}
