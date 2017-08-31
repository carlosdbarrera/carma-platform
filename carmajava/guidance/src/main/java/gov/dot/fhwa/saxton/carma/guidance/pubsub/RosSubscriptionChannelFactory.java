/*
 * TODO: Copyright (C) 2017 LEIDOS.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package gov.dot.fhwa.saxton.carma.guidance.pubsub;

import org.ros.node.ConnectedNode;

/**
 * Concrete ROS implementation of the logic outlined in {@link ISubscriptionChannelFactory}
 *
 * Uses an {@link ConnectedNode} instance to  create {@link org.ros.node.topic.Subscriber} instance
 * for use by {@link RosSubscriptionChannel} instances and their children {@link RosSubscriber}
 */
public class RosSubscriptionChannelFactory implements ISubscriptionChannelFactory {
    protected ConnectedNode node;

    public RosSubscriptionChannelFactory(ConnectedNode node) {
        this.node = node;
    }

    @Override public <T> ISubscriptionChannel<T> newSubscriptionChannel(String topic, String type) {
        return (ISubscriptionChannel<T>) new RosSubscriptionChannel<>(
            node.newSubscriber(topic, type));
    }
}