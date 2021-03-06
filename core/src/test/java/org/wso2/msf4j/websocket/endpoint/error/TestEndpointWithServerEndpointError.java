/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.msf4j.websocket.endpoint.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wso2.msf4j.websocket.WebSocketEndpoint;
import org.wso2.transport.http.netty.contract.websocket.WebSocketConnection;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;

public class TestEndpointWithServerEndpointError implements WebSocketEndpoint {
    Logger log = LoggerFactory.getLogger(TestEndpointWithServerEndpointError.class);

    @OnOpen
    public void onOpen(WebSocketConnection webSocketConnection) {
        log.info(webSocketConnection.getChannelId());
    }

    @OnMessage
    public String onStringMessage(String str, WebSocketConnection webSocketConnection) {
        log.info("Test str is: " + str);
        return str;
    }

    @OnClose
    public void onClose(String reasonText, int statusCode) {
    }
}
