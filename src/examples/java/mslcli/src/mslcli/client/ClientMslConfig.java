/**
 * Copyright (c) 2014 Netflix, Inc.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mslcli.client;

import com.netflix.msl.entityauth.PresharedAuthenticationData;

import mslcli.common.MslConfig;
import mslcli.common.util.AppContext;
import mslcli.common.util.ConfigurationException;
import mslcli.client.util.ClientAuthenticationUtils;

/**
 * <p>The configuration class for MSl client</p>
 * 
 * @author Vadim Spector <vspector@netflix.com>
 */

public final class ClientMslConfig extends MslConfig {
    public ClientMslConfig(final AppContext appCtx, final String clientId) throws ConfigurationException {
        super(appCtx, clientId, new PresharedAuthenticationData(clientId), new ClientAuthenticationUtils(clientId, appCtx));
    }
}
