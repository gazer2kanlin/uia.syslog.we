/*******************************************************************************
 * Copyright 2017 UIA
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package uia.syslog.we.model;

/**
 * A handle to an object was requested.
 *
 * @author Kyle K. Lin
 *
 */
public class WindowsEvent4656 extends WindowsEvent {

    private String securityId;

    private String accountName;

    private String accountDomain;

    private String logonId;

    private String objectServer;

    private String objectType;

    private String objectName;

    private String handleId;

    private String resourceAttributes;

    private String processId;

    private String processName;

    private String transactionId;

    private String accesses;

    private String accessMask;

    private String privilegesUsedForAccessCheck;

    private int restrictedSIDCount;

    public WindowsEvent4656() {
        super("Security-Auditing", "4656");
    }

    public String getSecurityId() {
        return this.securityId;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public String getAccountDomain() {
        return this.accountDomain;
    }

    public String getLogonId() {
        return this.logonId;
    }

    public String getObjectServer() {
        return this.objectServer;
    }

    public String getObjectType() {
        return this.objectType;
    }

    public String getObjectName() {
        return this.objectName;
    }

    public String getHandleId() {
        return this.handleId;
    }

    public String getResourceAttributes() {
        return this.resourceAttributes;
    }

    public String getProcessId() {
        return this.processId;
    }

    public String getProcessName() {
        return this.processName;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public String getAccesses() {
        return this.accesses;
    }

    public String getAccessMask() {
        return this.accessMask;
    }

    public String getPrivilegesUsedForAccessCheck() {
        return this.privilegesUsedForAccessCheck;
    }

    public int getRestrictedSIDCount() {
        return this.restrictedSIDCount;
    }

}
