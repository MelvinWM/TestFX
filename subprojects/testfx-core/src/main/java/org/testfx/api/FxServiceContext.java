/*
 * Copyright 2013-2014 SmartBear Software
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the European
 * Commission - subsequent versions of the EUPL (the "Licence"); You may not use this work
 * except in compliance with the Licence.
 *
 * You may obtain a copy of the Licence at:
 * http://ec.europa.eu/idabc/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * Licence is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the Licence for the specific language governing permissions
 * and limitations under the Licence.
 */
package org.testfx.api;

import com.google.common.annotations.Beta;
import org.loadui.testfx.robots.BaseRobot;
import org.loadui.testfx.robots.impl.BaseRobotImpl;
import org.loadui.testfx.service.finder.NodeFinder;
import org.loadui.testfx.service.finder.WindowFinder;
import org.loadui.testfx.service.finder.impl.NodeFinderImpl;
import org.loadui.testfx.service.finder.impl.WindowFinderImpl;
import org.loadui.testfx.service.support.CaptureSupport;
import org.loadui.testfx.service.support.WaitUntilSupport;

@Beta
public class FxServiceContext {

    //---------------------------------------------------------------------------------------------
    // PRIVATE FIELDS.
    //---------------------------------------------------------------------------------------------

    private WindowFinder windowFinder = new WindowFinderImpl();

    private NodeFinder nodeFinder = new NodeFinderImpl(windowFinder);

    private BaseRobot baseRobot = new BaseRobotImpl();

    private CaptureSupport captureSupport = new CaptureSupport(baseRobot);

    private WaitUntilSupport waitUntilSupport = new WaitUntilSupport();

    //---------------------------------------------------------------------------------------------
    // GETTER AND SETTER.
    //---------------------------------------------------------------------------------------------

    public WindowFinder getWindowFinder() {
        return windowFinder;
    }

    public void setWindowFinder(WindowFinder windowFinder) {
        this.windowFinder = windowFinder;
    }

    public NodeFinder getNodeFinder() {
        return nodeFinder;
    }

    public void setNodeFinder(NodeFinder nodeFinder) {
        this.nodeFinder = nodeFinder;
    }

    public BaseRobot getBaseRobot() {
        return baseRobot;
    }

    public void setBaseRobot(BaseRobot baseRobot) {
        this.baseRobot = baseRobot;
    }

    public CaptureSupport getCaptureSupport() {
        return captureSupport;
    }

    public void setCaptureSupport(CaptureSupport captureSupport) {
        this.captureSupport = captureSupport;
    }

    public WaitUntilSupport getWaitUntilSupport() {
        return waitUntilSupport;
    }

    public void setWaitUntilSupport(WaitUntilSupport waitUntilSupport) {
        this.waitUntilSupport = waitUntilSupport;
    }

}