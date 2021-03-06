/*
 * Copyright 2018 Red Hat, Inc, and individual contributors.
 *
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

package io.openshift.booster.messaging;

public class WorkerStatus {
    private final String id;
    private final long timestamp;
    private final long requestsProcessed;

    public WorkerStatus(String id, long timestamp, long requestsProcessed) {
        this.id = id;
        this.timestamp = timestamp;
        this.requestsProcessed = requestsProcessed;
    }

    public String getId() {
        return id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public long getRequestsProcessed() {
        return requestsProcessed;
    }

    @Override
    public String toString() {
        return String.format("WorkerStatus{id=%s, timestamp=%s, requestsProcessed=%s}",
                             id, timestamp, requestsProcessed);
    }
}
