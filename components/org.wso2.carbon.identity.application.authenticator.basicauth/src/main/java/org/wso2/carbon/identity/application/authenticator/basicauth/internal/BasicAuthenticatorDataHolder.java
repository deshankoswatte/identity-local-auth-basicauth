/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.application.authenticator.basicauth.internal;

import org.wso2.carbon.identity.configuration.mgt.core.ConfigurationManager;
import org.wso2.carbon.identity.governance.IdentityGovernanceService;
import org.wso2.carbon.identity.login.resolver.mgt.LoginResolverService;
import org.wso2.carbon.identity.multi.attribute.login.mgt.MultiAttributeLoginService;

import java.util.Properties;

/**
 * Holds services and data required for the Basic Authenticator.
 */
public class BasicAuthenticatorDataHolder {

    private static BasicAuthenticatorDataHolder instance = new BasicAuthenticatorDataHolder();

    private IdentityGovernanceService identityGovernanceService;
    private LoginResolverService loginResolverService;
    private MultiAttributeLoginService multiAttributeLogin;
    private Properties recaptchaConfigs;
    private ConfigurationManager configurationManager = null;

    private BasicAuthenticatorDataHolder() {

    }

    public static BasicAuthenticatorDataHolder getInstance() {
        return instance;
    }

    public IdentityGovernanceService getIdentityGovernanceService() {
        return identityGovernanceService;
    }

    public void setIdentityGovernanceService(IdentityGovernanceService identityGovernanceService) {
        this.identityGovernanceService = identityGovernanceService;
    }

    /**
     * Retrieves the login resolver service.
     *
     * @return The login resolver service.
     */
    public LoginResolverService getLoginResolverService() {

        return loginResolverService;
    }

    /**
     * Sets the login resolver service.
     *
     * @param loginResolverService The login resolver service to be set.
     */
    public void setLoginResolverService(LoginResolverService loginResolverService) {

        this.loginResolverService = loginResolverService;
    }

    /**
     * Retrieves the multi attribute service.
     *
     * @return The multi attribute service.
     * @deprecated To generalize the resolver concept and make it extensible.
     * Use the {@link #getLoginResolverService()} method instead.
     */
    @Deprecated
    public MultiAttributeLoginService getMultiAttributeLogin() {

        return multiAttributeLogin;
    }

    /**
     * Sets the multi attribute login service.
     *
     * @param multiAttributeLogin The multi attribute login service to be set.
     * @deprecated To generalize the resolver concept and make it extensible.
     * Use the {@link #setLoginResolverService(LoginResolverService)} method instead.
     */
    @Deprecated
    public void setMultiAttributeLogin(MultiAttributeLoginService multiAttributeLogin) {

        this.multiAttributeLogin = multiAttributeLogin;
    }

    public Properties getRecaptchaConfigs() {
        return recaptchaConfigs;
    }

    public void setRecaptchaConfigs(Properties recaptchaConfigs) {
        this.recaptchaConfigs = recaptchaConfigs;
    }

    public void setConfigurationManager(ConfigurationManager configurationManager) {

        this.configurationManager = configurationManager;
    }

    public ConfigurationManager getConfigurationManager() {

        return configurationManager;
    }
}
