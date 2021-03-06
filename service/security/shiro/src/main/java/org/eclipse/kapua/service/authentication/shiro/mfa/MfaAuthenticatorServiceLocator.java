/*******************************************************************************
 * Copyright (c) 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.authentication.shiro.mfa;

import org.eclipse.kapua.service.authentication.mfa.MfaAuthenticator;

/**
 * The {@link MfaAuthenticator} service locator.
 */
public class MfaAuthenticatorServiceLocator {

    private static MfaAuthenticatorServiceLocator locator;

    private final MfaAuthenticator mfaAuthenticator;

    private MfaAuthenticatorServiceLocator() {
        // for the moment the one implemented in MfaAuthenticatorImpl is the only available authenticator
        mfaAuthenticator = new MfaAuthenticatorImpl();
    }

    public static MfaAuthenticatorServiceLocator getInstance() {
        if (locator == null) {
            synchronized (MfaAuthenticatorServiceLocator.class) {
                if (locator == null) {
                    locator = new MfaAuthenticatorServiceLocator();
                }
            }
        }
        return locator;
    }

    /**
     * Retrieve the {@link MfaAuthenticator} service.
     *
     * @return a {@link MfaAuthenticator} object.
     */
    public MfaAuthenticator getMfaAuthenticator() {
        return mfaAuthenticator;
    }

}
