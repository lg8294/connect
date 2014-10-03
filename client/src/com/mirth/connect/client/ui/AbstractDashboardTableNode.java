/*
 * Copyright (c) Mirth Corporation. All rights reserved.
 * 
 * http://www.mirthcorp.com
 * 
 * The software in this package is published under the terms of the MPL license a copy of which has
 * been included with this distribution in the LICENSE.txt file.
 */

package com.mirth.connect.client.ui;

import com.mirth.connect.model.DashboardStatus;

public abstract class AbstractDashboardTableNode extends AbstractSortableTreeTableNode {
    public abstract String getChannelId();

    public abstract DashboardStatus getStatus();
    
    public abstract void setStatus(DashboardStatus status);
    
    public abstract void setShowLifetimeStats(boolean showLifetimeStats);
}
