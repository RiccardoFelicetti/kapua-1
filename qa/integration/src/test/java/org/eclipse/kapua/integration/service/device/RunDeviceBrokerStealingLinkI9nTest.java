/*******************************************************************************
 * Copyright (c) 2017, 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech
 *******************************************************************************/
package org.eclipse.kapua.integration.service.device;

import cucumber.api.CucumberOptions;
import org.eclipse.kapua.qa.common.cucumber.CucumberProperty;
import org.eclipse.kapua.qa.common.cucumber.CucumberWithProperties;
import org.junit.runner.RunWith;

@RunWith(CucumberWithProperties.class)
@CucumberOptions(
        features = {"classpath:features/broker/DeviceBrokerStealingLinkI9n.feature"},
        glue = {"org.eclipse.kapua.qa.common",
                "org.eclipse.kapua.service.account.steps",
                "org.eclipse.kapua.service.user.steps",
                "org.eclipse.kapua.service.tag.steps",
                "org.eclipse.kapua.service.device.registry.steps"
               },
        plugin = {"pretty",
                  "html:target/cucumber/DeviceBrokerStealingLinkI9n",
                  "json:target/DeviceBrokerStealingLinkI9n_cucumber.json"
                 },
        strict = true,
        monochrome = true )
@CucumberProperty(key="broker.ip", value="localhost")
@CucumberProperty(key="kapua.config.url", value="")
public class RunDeviceBrokerStealingLinkI9nTest {}
