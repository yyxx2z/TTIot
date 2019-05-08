/**
 * Copyright(c) link.ttiot & shijun All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Author: shijun (conttononline@outlook.com)
 */

package link.ttiot.broker.eventor.publish;

import io.netty.handler.codec.mqtt.MqttQoS;
import link.ttiot.common.ioc.annotation.Eventor;
import link.ttiot.common.ioc.core.ApplicationEvent;
import lombok.Getter;


/**
 * @author: shijun
 * @date: 2019-04-15
 * @description:
 */
@Eventor
public class MqttPublishDevEvent extends ApplicationEvent {

    @Getter
    private String topic;
    @Getter
    private byte[] byteBuf;
    @Getter
    private  MqttQoS qoS;
    @Getter
    private String tenantId;

    public MqttPublishDevEvent(String clientId, String topic, byte[] byteBuf, MqttQoS qoS,String tenantId) {
        super(clientId);
        this.topic=topic;
        this.byteBuf=byteBuf;
        this.qoS=qoS;
        this.tenantId=tenantId;
    }

    @Override
    public String getSource() {
        return (String) source;
    }

}